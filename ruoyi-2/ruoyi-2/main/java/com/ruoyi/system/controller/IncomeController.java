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
import com.ruoyi.system.domain.Income;
import com.ruoyi.system.service.IIncomeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 进货单Controller
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Controller
@RequestMapping("/system/Income")
public class IncomeController extends BaseController
{
    private String prefix = "system/Income";

    @Autowired
    private IIncomeService incomeService;

    @RequiresPermissions("system:Income:view")
    @GetMapping()
    public String Income()
    {
        return prefix + "/Income";
    }

    /**
     * 查询进货单列表
     */
    @RequiresPermissions("system:Income:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Income income)
    {
        startPage();
        List<Income> list = incomeService.selectIncomeList(income);
        return getDataTable(list);
    }

    /**
     * 导出进货单列表
     */
    @RequiresPermissions("system:Income:export")
    @Log(title = "进货单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Income income)
    {
        List<Income> list = incomeService.selectIncomeList(income);
        ExcelUtil<Income> util = new ExcelUtil<Income>(Income.class);
        return util.exportExcel(list, "进货单数据");
    }

    /**
     * 新增进货单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存进货单
     */
    @RequiresPermissions("system:Income:add")
    @Log(title = "进货单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Income income)
    {
        return toAjax(incomeService.insertIncome(income));
    }

    /**
     * 修改进货单
     */
    @GetMapping("/edit/{ID}")
    public String edit(@PathVariable("ID") String ID, ModelMap mmap)
    {
        Income income = incomeService.selectIncomeById(ID);
        mmap.put("income", income);
        return prefix + "/edit";
    }

    /**
     * 修改保存进货单
     */
    @RequiresPermissions("system:Income:edit")
    @Log(title = "进货单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Income income)
    {
        return toAjax(incomeService.updateIncome(income));
    }

    /**
     * 删除进货单
     */
    @RequiresPermissions("system:Income:remove")
    @Log(title = "进货单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(incomeService.deleteIncomeByIds(ids));
    }
}
