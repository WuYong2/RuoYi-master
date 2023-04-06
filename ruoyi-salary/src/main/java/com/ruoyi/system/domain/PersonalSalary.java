package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 personal_salary
 * 
 * @author ruoyi
 * @date 2023-04-06
 */
public class PersonalSalary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 薪资管理ID */
    private Long id;

    /** 员工编号 */
    @Excel(name = "员工编号")
    private Long personalId;

    /** 员工姓名 */
    @Excel(name = "员工姓名")
    private String personalName;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String departmentName;

    /** 岗位名称 */
    @Excel(name = "岗位名称")
    private String positionName;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date salaryDate;

    /** 基本工资 */
    @Excel(name = "基本工资")
    private BigDecimal basisSalary;

    /** 补助工资 */
    @Excel(name = "补助工资")
    private BigDecimal subsidySalary;

    /** 社保 */
    @Excel(name = "社保")
    private BigDecimal socialSalary;

    /** 公积金 */
    @Excel(name = "公积金")
    private Long providentFund;

    /** 奖金 */
    @Excel(name = "奖金")
    private Long bonus;

    /** 应发工资 */
    @Excel(name = "应发工资")
    private BigDecimal allSalary;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPersonalId(Long personalId) 
    {
        this.personalId = personalId;
    }

    public Long getPersonalId() 
    {
        return personalId;
    }
    public void setPersonalName(String personalName) 
    {
        this.personalName = personalName;
    }

    public String getPersonalName() 
    {
        return personalName;
    }
    public void setDepartmentName(String departmentName) 
    {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() 
    {
        return departmentName;
    }
    public void setPositionName(String positionName) 
    {
        this.positionName = positionName;
    }

    public String getPositionName() 
    {
        return positionName;
    }
    public void setSalaryDate(Date salaryDate) 
    {
        this.salaryDate = salaryDate;
    }

    public Date getSalaryDate() 
    {
        return salaryDate;
    }
    public void setBasisSalary(BigDecimal basisSalary) 
    {
        this.basisSalary = basisSalary;
    }

    public BigDecimal getBasisSalary() 
    {
        return basisSalary;
    }
    public void setSubsidySalary(BigDecimal subsidySalary) 
    {
        this.subsidySalary = subsidySalary;
    }

    public BigDecimal getSubsidySalary() 
    {
        return subsidySalary;
    }
    public void setSocialSalary(BigDecimal socialSalary) 
    {
        this.socialSalary = socialSalary;
    }

    public BigDecimal getSocialSalary() 
    {
        return socialSalary;
    }
    public void setProvidentFund(Long providentFund) 
    {
        this.providentFund = providentFund;
    }

    public Long getProvidentFund() 
    {
        return providentFund;
    }
    public void setBonus(Long bonus) 
    {
        this.bonus = bonus;
    }

    public Long getBonus() 
    {
        return bonus;
    }
    public void setAllSalary(BigDecimal allSalary) 
    {
        this.allSalary = allSalary;
    }

    public BigDecimal getAllSalary() 
    {
        return allSalary;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("personalId", getPersonalId())
            .append("personalName", getPersonalName())
            .append("departmentName", getDepartmentName())
            .append("positionName", getPositionName())
            .append("salaryDate", getSalaryDate())
            .append("basisSalary", getBasisSalary())
            .append("subsidySalary", getSubsidySalary())
            .append("socialSalary", getSocialSalary())
            .append("providentFund", getProvidentFund())
            .append("bonus", getBonus())
            .append("allSalary", getAllSalary())
            .toString();
    }
}
