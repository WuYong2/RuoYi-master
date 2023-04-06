package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PersonalSalaryMapper;
import com.ruoyi.system.domain.PersonalSalary;
import com.ruoyi.system.service.IPersonalSalaryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-06
 */
@Service
public class PersonalSalaryServiceImpl implements IPersonalSalaryService 
{
    @Autowired
    private PersonalSalaryMapper personalSalaryMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public PersonalSalary selectPersonalSalaryById(Long id)
    {
        return personalSalaryMapper.selectPersonalSalaryById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param personalSalary 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<PersonalSalary> selectPersonalSalaryList(PersonalSalary personalSalary)
    {
        return personalSalaryMapper.selectPersonalSalaryList(personalSalary);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param personalSalary 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertPersonalSalary(PersonalSalary personalSalary)
    {
        return personalSalaryMapper.insertPersonalSalary(personalSalary);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param personalSalary 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updatePersonalSalary(PersonalSalary personalSalary)
    {
        return personalSalaryMapper.updatePersonalSalary(personalSalary);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePersonalSalaryByIds(String ids)
    {
        return personalSalaryMapper.deletePersonalSalaryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePersonalSalaryById(Long id)
    {
        return personalSalaryMapper.deletePersonalSalaryById(id);
    }
}
