package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.PersonalSalary;
import com.ruoyi.system.service.IPersonalSalaryService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2023-04-06
 */
@Controller
@RequestMapping("/system/salary")
public class PersonalSalaryController extends BaseController
{
    private String prefix = "system/salary";

    @Autowired
    private IPersonalSalaryService personalSalaryService;

    @RequiresPermissions("system:salary:view")
    @GetMapping()
    public String salary()
    {
        return prefix + "/salary";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:salary:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PersonalSalary personalSalary)
    {
        startPage();
        List<PersonalSalary> list = personalSalaryService.selectPersonalSalaryList(personalSalary);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:salary:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PersonalSalary personalSalary)
    {
        List<PersonalSalary> list = personalSalaryService.selectPersonalSalaryList(personalSalary);
        ExcelUtil<PersonalSalary> util = new ExcelUtil<PersonalSalary>(PersonalSalary.class);
        return util.exportExcel(list, "【请填写功能名称】数据");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:salary:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PersonalSalary personalSalary)
    {
        return toAjax(personalSalaryService.insertPersonalSalary(personalSalary));
    }

    /**
     * 修改【请填写功能名称】
     */
    @RequiresPermissions("system:salary:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        PersonalSalary personalSalary = personalSalaryService.selectPersonalSalaryById(id);
        mmap.put("personalSalary", personalSalary);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:salary:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PersonalSalary personalSalary)
    {
        return toAjax(personalSalaryService.updatePersonalSalary(personalSalary));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:salary:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(personalSalaryService.deletePersonalSalaryByIds(ids));
    }
}
