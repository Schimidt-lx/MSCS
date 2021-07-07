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
import com.ruoyi.system.domain.Sales;
import com.ruoyi.system.service.ISalesService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 销售订单Controller
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Controller
@RequestMapping("/system/Sales")
public class SalesController extends BaseController
{
    private String prefix = "system/Sales";

    @Autowired
    private ISalesService salesService;

    @RequiresPermissions("system:Sales:view")
    @GetMapping()
    public String Sales()
    {
        return prefix + "/Sales";
    }

    /**
     * 查询销售订单列表
     */
    @RequiresPermissions("system:Sales:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Sales sales)
    {
        startPage();
        List<Sales> list = salesService.selectSalesList(sales);
        return getDataTable(list);
    }

    /**
     * 导出销售订单列表
     */
    @RequiresPermissions("system:Sales:export")
    @Log(title = "销售订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Sales sales)
    {
        List<Sales> list = salesService.selectSalesList(sales);
        ExcelUtil<Sales> util = new ExcelUtil<Sales>(Sales.class);
        return util.exportExcel(list, "销售订单数据");
    }

    /**
     * 新增销售订单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存销售订单
     */
    @RequiresPermissions("system:Sales:add")
    @Log(title = "销售订单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Sales sales)
    {
        return toAjax(salesService.insertSales(sales));
    }

    /**
     * 修改销售订单
     */
    @GetMapping("/edit/{sID}")
    public String edit(@PathVariable("sID") String sID, ModelMap mmap)
    {
        Sales sales = salesService.selectSalesById(sID);
        mmap.put("sales", sales);
        return prefix + "/edit";
    }

    /**
     * 修改保存销售订单
     */
    @RequiresPermissions("system:Sales:edit")
    @Log(title = "销售订单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Sales sales)
    {
        return toAjax(salesService.updateSales(sales));
    }

    /**
     * 删除销售订单
     */
    @RequiresPermissions("system:Sales:remove")
    @Log(title = "销售订单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(salesService.deleteSalesByIds(ids));
    }
}
