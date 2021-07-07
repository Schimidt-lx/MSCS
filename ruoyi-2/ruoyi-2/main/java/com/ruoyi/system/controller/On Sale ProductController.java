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
import com.ruoyi.system.domain.On Sale Product;
import com.ruoyi.system.service.IOn Sale ProductService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 在售商品数据项Controller
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Controller
@RequestMapping("/system/On Sale Product")
public class On Sale ProductController extends BaseController
{
    private String prefix = "system/On Sale Product";

    @Autowired
    private IOn Sale ProductService on Sale ProductService;

    @RequiresPermissions("system:On Sale Product:view")
    @GetMapping()
    public String On Sale Product()
    {
        return prefix + "/On Sale Product";
    }

    /**
     * 查询在售商品数据项列表
     */
    @RequiresPermissions("system:On Sale Product:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(On Sale Product on Sale Product)
    {
        startPage();
        List<On Sale Product> list = on Sale ProductService.selectOn Sale ProductList(on Sale Product);
        return getDataTable(list);
    }

    /**
     * 导出在售商品数据项列表
     */
    @RequiresPermissions("system:On Sale Product:export")
    @Log(title = "在售商品数据项", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(On Sale Product on Sale Product)
    {
        List<On Sale Product> list = on Sale ProductService.selectOn Sale ProductList(on Sale Product);
        ExcelUtil<On Sale Product> util = new ExcelUtil<On Sale Product>(On Sale Product.class);
        return util.exportExcel(list, "在售商品数据项数据");
    }

    /**
     * 新增在售商品数据项
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存在售商品数据项
     */
    @RequiresPermissions("system:On Sale Product:add")
    @Log(title = "在售商品数据项", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(On Sale Product on Sale Product)
    {
        return toAjax(on Sale ProductService.insertOn Sale Product(on Sale Product));
    }

    /**
     * 修改在售商品数据项
     */
    @GetMapping("/edit/{PID}")
    public String edit(@PathVariable("PID") String PID, ModelMap mmap)
    {
        On Sale Product on Sale Product = on Sale ProductService.selectOn Sale ProductById(PID);
        mmap.put("on Sale Product", on Sale Product);
        return prefix + "/edit";
    }

    /**
     * 修改保存在售商品数据项
     */
    @RequiresPermissions("system:On Sale Product:edit")
    @Log(title = "在售商品数据项", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(On Sale Product on Sale Product)
    {
        return toAjax(on Sale ProductService.updateOn Sale Product(on Sale Product));
    }

    /**
     * 删除在售商品数据项
     */
    @RequiresPermissions("system:On Sale Product:remove")
    @Log(title = "在售商品数据项", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(on Sale ProductService.deleteOn Sale ProductByIds(ids));
    }
}
