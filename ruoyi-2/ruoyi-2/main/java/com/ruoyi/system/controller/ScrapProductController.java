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
import com.ruoyi.system.domain.ScrapProduct;
import com.ruoyi.system.service.IScrapProductService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 报废商品Controller
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Controller
@RequestMapping("/system/ScrapProduct")
public class ScrapProductController extends BaseController
{
    private String prefix = "system/ScrapProduct";

    @Autowired
    private IScrapProductService scrapProductService;

    @RequiresPermissions("system:ScrapProduct:view")
    @GetMapping()
    public String ScrapProduct()
    {
        return prefix + "/ScrapProduct";
    }

    /**
     * 查询报废商品列表
     */
    @RequiresPermissions("system:ScrapProduct:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ScrapProduct scrapProduct)
    {
        startPage();
        List<ScrapProduct> list = scrapProductService.selectScrapProductList(scrapProduct);
        return getDataTable(list);
    }

    /**
     * 导出报废商品列表
     */
    @RequiresPermissions("system:ScrapProduct:export")
    @Log(title = "报废商品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ScrapProduct scrapProduct)
    {
        List<ScrapProduct> list = scrapProductService.selectScrapProductList(scrapProduct);
        ExcelUtil<ScrapProduct> util = new ExcelUtil<ScrapProduct>(ScrapProduct.class);
        return util.exportExcel(list, "报废商品数据");
    }

    /**
     * 新增报废商品
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存报废商品
     */
    @RequiresPermissions("system:ScrapProduct:add")
    @Log(title = "报废商品", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ScrapProduct scrapProduct)
    {
        return toAjax(scrapProductService.insertScrapProduct(scrapProduct));
    }

    /**
     * 修改报废商品
     */
    @GetMapping("/edit/{ID}")
    public String edit(@PathVariable("ID") String ID, ModelMap mmap)
    {
        ScrapProduct scrapProduct = scrapProductService.selectScrapProductById(ID);
        mmap.put("scrapProduct", scrapProduct);
        return prefix + "/edit";
    }

    /**
     * 修改保存报废商品
     */
    @RequiresPermissions("system:ScrapProduct:edit")
    @Log(title = "报废商品", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ScrapProduct scrapProduct)
    {
        return toAjax(scrapProductService.updateScrapProduct(scrapProduct));
    }

    /**
     * 删除报废商品
     */
    @RequiresPermissions("system:ScrapProduct:remove")
    @Log(title = "报废商品", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(scrapProductService.deleteScrapProductByIds(ids));
    }
}
