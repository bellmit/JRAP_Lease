package com.jingrui.jrap.item.dto;

/**
 * Auto Generated By Jrap Code Generator
 **/

import com.jingrui.jrap.mybatis.common.query.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;
import javax.persistence.Transient;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.jingrui.jrap.system.dto.BaseDTO;
import java.util.Date;
import javax.validation.constraints.NotNull;

@ExtensionAttribute(disable = true)
@Table(name = "afd_item")
public class Item extends BaseDTO {

  public static final String FIELD_ITEM_ID = "itemId";
  public static final String FIELD_COMPANY_ID = "companyId";
  public static final String FIELD_LINE_CODE = "lineCode";
  public static final String FIELD_MODEL = "model";
  public static final String FIELD_OUTSIDE_COLOR = "outsideColor";
  public static final String FIELD_INSIDE_COLOR = "insideColor";
  public static final String FIELD_VIN = "vin";
  public static final String FIELD_ENGINE_NUMBER = "engineNumber";
  public static final String FIELD_LICENSE = "license";
  public static final String FIELD_MILEAGE = "mileage";
  public static final String FIELD_CAR_KEY = "carKey";
  public static final String FIELD_GUIDE_PRICE = "guidePrice";
  public static final String FIELD_INVOICE_PRICE = "invoicePrice";
  public static final String FIELD_CAR_TYPE = "carType";
  public static final String FIELD_LOAN_TYPE = "loanType";
  public static final String FIELD_LOAN_REMARK = "loanRemark";
  public static final String FIELD_RELEASE_DATE = "releaseDate";
  public static final String FIELD_ANNUAL_DATE = "annualDate";
  public static final String FIELD_INSURANCE = "insurance";
  public static final String FIELD_DRIVING_DATE = "drivingDate";
  public static final String FIELD_ENABLED_FLAG = "enabledFlag";
  public static final String FIELD_REMARK = "remark";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
  public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


  @Id
  @GeneratedValue
  private Long itemId;

  @NotNull
  private Long companyId; //所属公司ID

  @NotNull
  private String lineCode; //产品线ID

  @Length(max = 200)
  private String model; //型号

  @Length(max = 60)
  private String outsideColor; //车体颜色

  @Length(max = 60)
  private String insideColor; //车内颜色

  @Length(max = 30)
  private String vin; //车架号

  @Length(max = 30)
  private String engineNumber; //发动机号

  @Length(max = 50)
  private String license; //车牌号

  @Length(max = 30)
  private String mileage; //里程数

  @Length(max = 30)
  private String carKey; //车辆钥匙

  private Long guidePrice; //指导价

  private Long invoicePrice; //发票价格

  @Length(max = 30)
  private String carType; //车辆抵押状况

  @Length(max = 30)
  private String loanType; //借款情况

  @Length(max = 200)
  private String loanRemark; //抵押详情

  private Date releaseDate; //出厂日期

  private Date annualDate; //年检日期

  private Date insurance; //保险日期

  private Date drivingDate; //行驶证登记日

  @Length(max = 1)
  private String enabledFlag; //启用标识

  @Length(max = 2147483647)
  private String remark; //备注说明

  @Transient
  @JoinColumn(joinName = "unitJoin", field = "name")
  private String description; //经销商名称

  private Long programApplicationId;

  private Date programUpdateDate;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public Long getItemId() {
    return itemId;
  }

  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }

  public Long getCompanyId() {
    return companyId;
  }

  public void setLineCode(String lineCode) {
    this.lineCode = lineCode;
  }

  public String getLineCode() {
    return lineCode;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getModel() {
    return model;
  }

  public void setOutsideColor(String outsideColor) {
    this.outsideColor = outsideColor;
  }

  public String getOutsideColor() {
    return outsideColor;
  }

  public void setInsideColor(String insideColor) {
    this.insideColor = insideColor;
  }

  public String getInsideColor() {
    return insideColor;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public String getVin() {
    return vin;
  }

  public void setEngineNumber(String engineNumber) {
    this.engineNumber = engineNumber;
  }

  public String getEngineNumber() {
    return engineNumber;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public String getLicense() {
    return license;
  }

  public void setMileage(String mileage) {
    this.mileage = mileage;
  }

  public String getMileage() {
    return mileage;
  }

  public void setCarKey(String carKey) {
    this.carKey = carKey;
  }

  public String getCarKey() {
    return carKey;
  }

  public void setGuidePrice(Long guidePrice) {
    this.guidePrice = guidePrice;
  }

  public Long getGuidePrice() {
    return guidePrice;
  }

  public void setInvoicePrice(Long invoicePrice) {
    this.invoicePrice = invoicePrice;
  }

  public Long getInvoicePrice() {
    return invoicePrice;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }

  public String getCarType() {
    return carType;
  }

  public void setLoanType(String loanType) {
    this.loanType = loanType;
  }

  public String getLoanType() {
    return loanType;
  }

  public void setLoanRemark(String loanRemark) {
    this.loanRemark = loanRemark;
  }

  public String getLoanRemark() {
    return loanRemark;
  }

  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Date getReleaseDate() {
    return releaseDate;
  }

  public void setAnnualDate(Date annualDate) {
    this.annualDate = annualDate;
  }

  public Date getAnnualDate() {
    return annualDate;
  }

  public void setInsurance(Date insurance) {
    this.insurance = insurance;
  }

  public Date getInsurance() {
    return insurance;
  }

  public void setDrivingDate(Date drivingDate) {
    this.drivingDate = drivingDate;
  }

  public Date getDrivingDate() {
    return drivingDate;
  }

  public void setEnabledFlag(String enabledFlag) {
    this.enabledFlag = enabledFlag;
  }

  public String getEnabledFlag() {
    return enabledFlag;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public String getRemark() {
    return remark;
  }

  public void setProgramApplicationId(Long programApplicationId) {
    this.programApplicationId = programApplicationId;
  }

  public Long getProgramApplicationId() {
    return programApplicationId;
  }

  public void setProgramUpdateDate(Date programUpdateDate) {
    this.programUpdateDate = programUpdateDate;
  }

  public Date getProgramUpdateDate() {
    return programUpdateDate;
  }

}
