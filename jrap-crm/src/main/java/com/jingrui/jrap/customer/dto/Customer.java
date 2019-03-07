package com.jingrui.jrap.customer.dto;

/**
 * Auto Generated By Jrap Code Generator
 **/

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;
import com.jingrui.jrap.mybatis.common.query.Where;
import net.bytebuddy.implementation.bind.annotation.Default;
import org.hibernate.validator.constraints.Length;

import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.jingrui.jrap.system.dto.BaseDTO;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

@ExtensionAttribute(disable = true)
@Table(name = "afd_customer")
public class Customer extends BaseDTO {
    public static final String FIELD_CUSTOMER_ID = "customerId";
    public static final String FIELD_CUSTOMER_CODE = "customerCode";
    public static final String FIELD_CUSTOMER_NAME = "customerName";
    public static final String FIELD_CUSTOMER_CLASS = "customerClass";
    public static final String FIELD_CUSTOMER_CATEGORY = "customerCategory";
    public static final String FIELD_CUSTOMER_TYPE = "customerType";
    public static final String FIELD_CUSTOMER_SOURCE = "customerSource";
    public static final String FIELD_COMPANY_ID = "companyId";
    public static final String FIELD_ORGANIZATION_ID = "organizationId";
    public static final String FIELD_EMPLOYEE_ID = "employeeId";
    public static final String FIELD_ID_TYPE = "idType";
    public static final String FIELD_ID_NO = "idNo";
    public static final String FIELD_ID_END_DATE = "idEndDate";
    public static final String FIELD_SEX = "sex";
    public static final String FIELD_AGE = "age";
    public static final String FIELD_DRIVER_LICENSE = "driverLicense";
    public static final String FIELD_LEASE_PURPOSE = "leasePurpose";
    public static final String FIELD_TELPHONE = "telphone";
    public static final String FIELD_CELLPHONE = "cellphone";
    public static final String FIELD_TELPHONE02 = "telphone02";
    public static final String FIELD_TELPHONE03 = "telphone03";
    public static final String FIELD_EMAIL = "email";
    public static final String FIELD_QQ = "qq";
    public static final String FIELD_WEIXIN = "weixin";
    public static final String FIELD_LOCAL_FAMILY_REGISTER = "localFamilyRegister";
    public static final String FIELD_LOCAL_SOCIAL_SECURITY = "localSocialSecurity";
    public static final String FIELD_LOCAL_HOUSE_PROPERTY = "localHouseProperty";
    public static final String FIELD_RESIDE_CONDITION = "resideCondition";
    public static final String FIELD_RESIDE_PERIODS = "residePeriods";
    public static final String FIELD_EDUCATIONAL_BACKGROUND = "educationalBackground";
    public static final String FIELD_MARITAL_STATUS = "maritalStatus";
    public static final String FIELD_FERTILITY_STATUS = "fertilityStatus";
    public static final String FIELD_DEBT_FLAG = "debtFlag";
    public static final String FIELD_MORTGAGE = "mortgage";
    public static final String FIELD_ANNUAL_INCOME = "annualIncome";
    public static final String FIELD_EXPENSE = "expense";
    public static final String FIELD_QUALIFIED_SCORE = "qualifiedScore";
    public static final String FIELD_HOME_ADDRESS = "homeAddress";
    public static final String FIELD_HOME_ZIP = "homeZip";
    public static final String FIELD_RESIDE_ADDRESS = "resideAddress";
    public static final String FIELD_RESIDE_ZIP = "resideZip";
    public static final String FIELD_INDUSTRY = "industry";
    public static final String FIELD_POSITION = "position";
    public static final String FIELD_UNIT_NAME = "unitName";
    public static final String FIELD_UNIT_ADDRESS = "unitAddress";
    public static final String FIELD_UNIT_ZIP = "unitZip";
    public static final String FIELD_CONTACT_ADDRESS = "contactAddress";
    public static final String FIELD_SPOUSE_TYPE = "spouseType";
    public static final String FIELD_SPOUSE_NAME = "spouseName";
    public static final String FIELD_SPOUSE_ID_TYPE = "spouseIdType";
    public static final String FIELD_SPOUSE_ID_NO = "spouseIdNo";
    public static final String FIELD_SPOUSE_TELPHONE = "spouseTelphone";
    public static final String FIELD_SPOUSE_CELLPHONE = "spouseCellphone";
    public static final String FIELD_SPOUSE_DRIVER_LICENSE = "spouseDriverLicense";
    public static final String FIELD_SPOUSE_HOME_ADDRESS = "spouseHomeAddress";
    public static final String FIELD_SPOUSE_UNIT_ADDRESS = "spouseUnitAddress";
    public static final String FIELD_ENABLE_FLAG = "enableFlag";

    @Id
    @GeneratedValue
    @Where
    private Long customerId;

    @NotEmpty
    @Length(max = 30)
    @OrderBy("ASC")
    @Where
    private String customerCode; //编码

    @Length(max = 200)
    private String customerName; //名称

    @Length(max = 30)
    private String customerClass; //分类（自然人、法人）

    @Length(max = 30)
    private String customerCategory; //类别

    @Length(max = 30)
    private String customerType; //类型

    @Length(max = 30)
    private String customerSource; //客户来源

    private Long companyId; //所属公司ID

    private Long organizationId; //所属机构ID

    private Long employeeId; //所属员工ID

    @Length(max = 30)
    private String idType; //证件类型（身份证、港澳通行证、军官证、其他、护照、台湾同胞通行证）

    @Length(max = 45)
    private String idNo; //证件号码

    private Date idEndDate; //证件有效期至

    @Length(max = 30)
    private String sex; //性别

    private Long age; //年龄

    @Length(max = 60)
    private String driverLicense; //驾驶证档案编号

    @Length(max = 30)
    private String leasePurpose; //租车目的

    @Length(max = 30)
    private String telphone; //主手机号

    @Length(max = 30)
    private String cellphone; //座机号

    @Length(max = 60)
    private String telphone02; //备用手机号2

    @Length(max = 60)
    private String telphone03; //备用手机号3

    @Length(max = 60)
    private String email; //邮箱

    @Length(max = 60)
    private String qq; //QQ

    @Length(max = 60)
    private String weixin; //微信号

    @Length(max = 30)
    private String localFamilyRegister; //本地户籍

    @Length(max = 30)
    private String localSocialSecurity; //当地社保

    @Length(max = 30)
    private String localHouseProperty; //本地房产

    @Length(max = 30)
    private String resideCondition; //居住状况

    @Length(max = 60)
    private String residePeriods; //租期

    @Length(max = 30)
    private String educationalBackground; //学历

    @Length(max = 30)
    private String maritalStatus; //婚姻状况

    @Length(max = 30)
    private String fertilityStatus; //生育状况

    @Length(max = 30)
    private String debtFlag; //有无债务

    private Long mortgage; //每月还款额

    private Long annualIncome; //年收入

    private Long expense; //每月家庭支出

    private Long qualifiedScore; //客户资质评分

    @Length(max = 200)
    private String homeAddress; //户籍住址

    @Length(max = 45)
    private String homeZip; //户籍邮编

    @Length(max = 200)
    private String resideAddress; //居住地址

    @Length(max = 45)
    private String resideZip; //居住邮编

    @Length(max = 30)
    private String industry; //行业

    @Length(max = 30)
    private String position; //职位

    @Length(max = 200)
    private String unitName; //现职公司全称

    @Length(max = 200)
    private String unitAddress; //单位地址

    @Length(max = 45)
    private String unitZip; //单位邮编

    @Length(max = 200)
    private String contactAddress; //联系地址

    @Length(max = 30)
    private String spouseType; //关系

    @Length(max = 200)
    private String spouseName; //配偶姓名

    @Length(max = 30)
    private String spouseIdType; //配偶身份证件类型

    @Length(max = 60)
    private String spouseIdNo; //配偶身份证件编号

    @Length(max = 30)
    private String spouseTelphone; //配偶主手机号

    @Length(max = 30)
    private String spouseCellphone; //配偶座机

    @Length(max = 60)
    private String spouseDriverLicense; //配偶驾照

    @Length(max = 200)
    private String spouseHomeAddress; //配偶户籍住址

    @Length(max = 400)
    private String spouseUnitAddress; //配偶工作单位名称及地址

    @NotEmpty
    @Length(max = 1)
    private String enableFlag; //是否启用

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerClass(String customerClass) {
        this.customerClass = customerClass;
    }

    public String getCustomerClass() {
        return customerClass;
    }

    public void setCustomerCategory(String customerCategory) {
        this.customerCategory = customerCategory;
    }

    public String getCustomerCategory() {
        return customerCategory;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerSource(String customerSource) {
        this.customerSource = customerSource;
    }

    public String getCustomerSource() {
        return customerSource;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdEndDate(Date idEndDate) {
        this.idEndDate = idEndDate;
    }

    public Date getIdEndDate() {
        return idEndDate;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getAge() {
        return age;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setLeasePurpose(String leasePurpose) {
        this.leasePurpose = leasePurpose;
    }

    public String getLeasePurpose() {
        return leasePurpose;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setTelphone02(String telphone02) {
        this.telphone02 = telphone02;
    }

    public String getTelphone02() {
        return telphone02;
    }

    public void setTelphone03(String telphone03) {
        this.telphone03 = telphone03;
    }

    public String getTelphone03() {
        return telphone03;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getQq() {
        return qq;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setLocalFamilyRegister(String localFamilyRegister) {
        this.localFamilyRegister = localFamilyRegister;
    }

    public String getLocalFamilyRegister() {
        return localFamilyRegister;
    }

    public void setLocalSocialSecurity(String localSocialSecurity) {
        this.localSocialSecurity = localSocialSecurity;
    }

    public String getLocalSocialSecurity() {
        return localSocialSecurity;
    }

    public void setLocalHouseProperty(String localHouseProperty) {
        this.localHouseProperty = localHouseProperty;
    }

    public String getLocalHouseProperty() {
        return localHouseProperty;
    }

    public void setResideCondition(String resideCondition) {
        this.resideCondition = resideCondition;
    }

    public String getResideCondition() {
        return resideCondition;
    }

    public void setResidePeriods(String residePeriods) {
        this.residePeriods = residePeriods;
    }

    public String getResidePeriods() {
        return residePeriods;
    }

    public void setEducationalBackground(String educationalBackground) {
        this.educationalBackground = educationalBackground;
    }

    public String getEducationalBackground() {
        return educationalBackground;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setFertilityStatus(String fertilityStatus) {
        this.fertilityStatus = fertilityStatus;
    }

    public String getFertilityStatus() {
        return fertilityStatus;
    }

    public void setDebtFlag(String debtFlag) {
        this.debtFlag = debtFlag;
    }

    public String getDebtFlag() {
        return debtFlag;
    }

    public void setMortgage(Long mortgage) {
        this.mortgage = mortgage;
    }

    public Long getMortgage() {
        return mortgage;
    }

    public void setAnnualIncome(Long annualIncome) {
        this.annualIncome = annualIncome;
    }

    public Long getAnnualIncome() {
        return annualIncome;
    }

    public void setExpense(Long expense) {
        this.expense = expense;
    }

    public Long getExpense() {
        return expense;
    }

    public void setQualifiedScore(Long qualifiedScore) {
        this.qualifiedScore = qualifiedScore;
    }

    public Long getQualifiedScore() {
        return qualifiedScore;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeZip(String homeZip) {
        this.homeZip = homeZip;
    }

    public String getHomeZip() {
        return homeZip;
    }

    public void setResideAddress(String resideAddress) {
        this.resideAddress = resideAddress;
    }

    public String getResideAddress() {
        return resideAddress;
    }

    public void setResideZip(String resideZip) {
        this.resideZip = resideZip;
    }

    public String getResideZip() {
        return resideZip;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getIndustry() {
        return industry;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitAddress(String unitAddress) {
        this.unitAddress = unitAddress;
    }

    public String getUnitAddress() {
        return unitAddress;
    }

    public void setUnitZip(String unitZip) {
        this.unitZip = unitZip;
    }

    public String getUnitZip() {
        return unitZip;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setSpouseType(String spouseType) {
        this.spouseType = spouseType;
    }

    public String getSpouseType() {
        return spouseType;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseIdType(String spouseIdType) {
        this.spouseIdType = spouseIdType;
    }

    public String getSpouseIdType() {
        return spouseIdType;
    }

    public void setSpouseIdNo(String spouseIdNo) {
        this.spouseIdNo = spouseIdNo;
    }

    public String getSpouseIdNo() {
        return spouseIdNo;
    }

    public void setSpouseTelphone(String spouseTelphone) {
        this.spouseTelphone = spouseTelphone;
    }

    public String getSpouseTelphone() {
        return spouseTelphone;
    }

    public void setSpouseCellphone(String spouseCellphone) {
        this.spouseCellphone = spouseCellphone;
    }

    public String getSpouseCellphone() {
        return spouseCellphone;
    }

    public void setSpouseDriverLicense(String spouseDriverLicense) {
        this.spouseDriverLicense = spouseDriverLicense;
    }

    public String getSpouseDriverLicense() {
        return spouseDriverLicense;
    }

    public void setSpouseHomeAddress(String spouseHomeAddress) {
        this.spouseHomeAddress = spouseHomeAddress;
    }

    public String getSpouseHomeAddress() {
        return spouseHomeAddress;
    }

    public void setSpouseUnitAddress(String spouseUnitAddress) {
        this.spouseUnitAddress = spouseUnitAddress;
    }

    public String getSpouseUnitAddress() {
        return spouseUnitAddress;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }

    public String getEnableFlag() {
        return enableFlag;
    }

}