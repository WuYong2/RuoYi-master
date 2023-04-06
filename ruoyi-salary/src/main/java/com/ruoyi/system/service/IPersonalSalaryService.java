package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.PersonalSalary;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2023-04-06
 */
public interface IPersonalSalaryService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public PersonalSalary selectPersonalSalaryById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param personalSalary 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<PersonalSalary> selectPersonalSalaryList(PersonalSalary personalSalary);

    /**
     * 新增【请填写功能名称】
     * 
     * @param personalSalary 【请填写功能名称】
     * @return 结果
     */
    public int insertPersonalSalary(PersonalSalary personalSalary);

    /**
     * 修改【请填写功能名称】
     * 
     * @param personalSalary 【请填写功能名称】
     * @return 结果
     */
    public int updatePersonalSalary(PersonalSalary personalSalary);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deletePersonalSalaryByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deletePersonalSalaryById(Long id);
}
