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
import com.ruoyi.system.domain.WokerData;
import com.ruoyi.system.service.IWokerDataService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 员工数据项Controller
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Controller
@RequestMapping("/system/WokerData")
public class WokerDataController extends BaseController
{
    private String prefix = "system/WokerData";

    @Autowired
    private IWokerDataService wokerDataService;

    @RequiresPermissions("system:WokerData:view")
    @GetMapping()
    public String WokerData()
    {
        return prefix + "/WokerData";
    }

    /**
     * 查询员工数据项列表
     */
    @RequiresPermissions("system:WokerData:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WokerData wokerData)
    {
        startPage();
        List<WokerData> list = wokerDataService.selectWokerDataList(wokerData);
        return getDataTable(list);
    }

    /**
     * 导出员工数据项列表
     */
    @RequiresPermissions("system:WokerData:export")
    @Log(title = "员工数据项", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WokerData wokerData)
    {
        List<WokerData> list = wokerDataService.selectWokerDataList(wokerData);
        ExcelUtil<WokerData> util = new ExcelUtil<WokerData>(WokerData.class);
        return util.exportExcel(list, "员工数据项数据");
    }

    /**
     * 新增员工数据项
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存员工数据项
     */
    @RequiresPermissions("system:WokerData:add")
    @Log(title = "员工数据项", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WokerData wokerData)
    {
        return toAjax(wokerDataService.insertWokerData(wokerData));
    }

    /**
     * 修改员工数据项
     */
    @GetMapping("/edit/{UserID}")
    public String edit(@PathVariable("UserID") String UserID, ModelMap mmap)
    {
        WokerData wokerData = wokerDataService.selectWokerDataById(UserID);
        mmap.put("wokerData", wokerData);
        return prefix + "/edit";
    }

    /**
     * 修改保存员工数据项
     */
    @RequiresPermissions("system:WokerData:edit")
    @Log(title = "员工数据项", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WokerData wokerData)
    {
        return toAjax(wokerDataService.updateWokerData(wokerData));
    }

    /**
     * 删除员工数据项
     */
    @RequiresPermissions("system:WokerData:remove")
    @Log(title = "员工数据项", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(wokerDataService.deleteWokerDataByIds(ids));
    }
}
