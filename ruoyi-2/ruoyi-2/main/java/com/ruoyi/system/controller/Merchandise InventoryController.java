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
import com.ruoyi.system.domain.Merchandise Inventory;
import com.ruoyi.system.service.IMerchandise InventoryService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 库存商品Controller
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Controller
@RequestMapping("/system/Merchandise Inventory")
public class Merchandise InventoryController extends BaseController
{
    private String prefix = "system/Merchandise Inventory";

    @Autowired
    private IMerchandise InventoryService merchandise InventoryService;

    @RequiresPermissions("system:Merchandise Inventory:view")
    @GetMapping()
    public String Merchandise Inventory()
    {
        return prefix + "/Merchandise Inventory";
    }

    /**
     * 查询库存商品列表
     */
    @RequiresPermissions("system:Merchandise Inventory:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Merchandise Inventory merchandise Inventory)
    {
        startPage();
        List<Merchandise Inventory> list = merchandise InventoryService.selectMerchandise InventoryList(merchandise Inventory);
        return getDataTable(list);
    }

    /**
     * 导出库存商品列表
     */
    @RequiresPermissions("system:Merchandise Inventory:export")
    @Log(title = "库存商品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Merchandise Inventory merchandise Inventory)
    {
        List<Merchandise Inventory> list = merchandise InventoryService.selectMerchandise InventoryList(merchandise Inventory);
        ExcelUtil<Merchandise Inventory> util = new ExcelUtil<Merchandise Inventory>(Merchandise Inventory.class);
        return util.exportExcel(list, "库存商品数据");
    }

    /**
     * 新增库存商品
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存库存商品
     */
    @RequiresPermissions("system:Merchandise Inventory:add")
    @Log(title = "库存商品", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Merchandise Inventory merchandise Inventory)
    {
        return toAjax(merchandise InventoryService.insertMerchandise Inventory(merchandise Inventory));
    }

    /**
     * 修改库存商品
     */
    @GetMapping("/edit/{ID}")
    public String edit(@PathVariable("ID") String ID, ModelMap mmap)
    {
        Merchandise Inventory merchandise Inventory = merchandise InventoryService.selectMerchandise InventoryById(ID);
        mmap.put("merchandise Inventory", merchandise Inventory);
        return prefix + "/edit";
    }

    /**
     * 修改保存库存商品
     */
    @RequiresPermissions("system:Merchandise Inventory:edit")
    @Log(title = "库存商品", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Merchandise Inventory merchandise Inventory)
    {
        return toAjax(merchandise InventoryService.updateMerchandise Inventory(merchandise Inventory));
    }

    /**
     * 删除库存商品
     */
    @RequiresPermissions("system:Merchandise Inventory:remove")
    @Log(title = "库存商品", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(merchandise InventoryService.deleteMerchandise InventoryByIds(ids));
    }
}
