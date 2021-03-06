package com.jingrui.jrap.fnd.controllers;

import com.jingrui.jrap.core.IRequest;
import com.jingrui.jrap.fnd.dto.Company;
import com.jingrui.jrap.fnd.mapper.CompanyMapper;
import com.jingrui.jrap.fnd.service.ICompanyService;
import com.jingrui.jrap.fnd.util.GetLatAndLngByBaidu;
import com.jingrui.jrap.mybatis.common.Criteria;
import com.jingrui.jrap.mybatis.common.query.Comparison;
import com.jingrui.jrap.mybatis.common.query.WhereField;
import com.jingrui.jrap.system.controllers.BaseController;
import com.jingrui.jrap.system.dto.ResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 对公司的操作.
 *
 * @author jialong.zuo@jingrui.com
 * @date 2016/10/9.
 */
@RestController
@RequestMapping(value = {"/fnd/company", "/api/fnd/company"})
@Api(value = "ProductController", tags = {"商户维护接口"})
public class CompanyController extends BaseController {
    @Autowired
    ICompanyService companyService;

    @Autowired
    CompanyMapper companyMapper;

    @RequestMapping(value = "/query", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "获取商户信息", notes = "通用商户查询接口", httpMethod = "GET", response = Company.class)
    public ResponseData select(Company company, HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                               @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize) {
        IRequest requestCtx = createRequestContext(request);
        Criteria criteria = new Criteria(company);
        criteria.where(new WhereField(Company.FIELD_COMPANY_CODE, Comparison.LIKE), Company.FIELD_COMPANY_ID, Company.FIELD_COMPANY_TYPE, Company.FIELD_PARENT_COMPANY_ID, Company.FIELD_COMPANY_FULL_NAME, Company.FIELD_COMPANY_SHORT_NAME);
        return new ResponseData(companyService.selectOptions(requestCtx, company, criteria, page, pagesize));
    }

    @RequestMapping(value = "/queryAll", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "查询全部商户信息", notes = "查询全部商户信息接口", httpMethod = "POST", response = Company.class)
    public ResponseData selectAll(Company company, HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                               @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize) {
        return new ResponseData(companyMapper.select(company));
    }

    @PostMapping(value = {"/submit", "/update"})
    @ApiOperation(value = "商户提交/修改", notes = "商户提交/修改接口(批量)", httpMethod = "GET", response = Company.class)
    public ResponseData update(@RequestBody List<Company> companies, BindingResult result, HttpServletRequest request) {
        IRequest requestCtx = createRequestContext(request);
        getValidator().validate(companies, result);
        if (result.hasErrors()) {
            ResponseData responseData = new ResponseData(false);
            responseData.setMessage(getErrorMessage(result, request));
            return responseData;
        }

        //批量更新经纬度
        for (Company company : companies) {
            //如果地址不为空，获取经纬度
            if (company.getAddress() != null) {
                Map<String, String> map = GetLatAndLngByBaidu.getLatitude(company.getAddress());
                company.setAttribute1(map.get("lng"));  //经度
                company.setAttribute2(map.get("lat"));  //维度
            }
        }

        return new ResponseData(companyService.batchUpdate(requestCtx, companies));
    }

    @PostMapping(value = "/remove")
    @ApiOperation(value = "删除商户信息", notes = "商户删除接口（批量）", httpMethod = "GET", response = Company.class)
    public ResponseData delete(@RequestBody List<Company> companies, HttpServletRequest request) {
        companyService.batchDelete(companies);
        return new ResponseData();
    }

    @PostMapping(value = {"/add"})
    @ApiOperation(value = "添加商户", notes = "添加商户接口", httpMethod = "GET", response = Company.class)
    public ResponseData update(@RequestBody Company company, BindingResult result, HttpServletRequest request) {
        IRequest requestCtx = createRequestContext(request);
        if (result.hasErrors()) {
            ResponseData responseData = new ResponseData(false);
            responseData.setMessage(getErrorMessage(result, request));
            return responseData;
        }

        //如果地址不为空，获取经纬度
        if (company.getAddress() != null) {
            Map<String, String> map = GetLatAndLngByBaidu.getLatitude(company.getAddress());
            company.setAttribute1(map.get("lng"));  //经度
            company.setAttribute2(map.get("lat"));  //维度
        }

        Company company1 = companyService.insertSelective(requestCtx, company);
        List<Company> list = new ArrayList<>();
        list.add(company1);
        return new ResponseData(list);
    }
}
