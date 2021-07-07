package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Merchandise Inventory;

/**
 * 库存商品Service接口
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public interface IMerchandise InventoryService 
{
    /**
     * 查询库存商品
     * 
     * @param ID 库存商品ID
     * @return 库存商品
     */
    public Merchandise Inventory selectMerchandise InventoryById(String ID);

    /**
     * 查询库存商品列表
     * 
     * @param merchandise Inventory 库存商品
     * @return 库存商品集合
     */
    public List<Merchandise Inventory> selectMerchandise InventoryList(Merchandise Inventory merchandise Inventory);

    /**
     * 新增库存商品
     * 
     * @param merchandise Inventory 库存商品
     * @return 结果
     */
    public int insertMerchandise Inventory(Merchandise Inventory merchandise Inventory);

    /**
     * 修改库存商品
     * 
     * @param merchandise Inventory 库存商品
     * @return 结果
     */
    public int updateMerchandise Inventory(Merchandise Inventory merchandise Inventory);

    /**
     * 批量删除库存商品
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMerchandise InventoryByIds(String ids);

    /**
     * 删除库存商品信息
     * 
     * @param ID 库存商品ID
     * @return 结果
     */
    public int deleteMerchandise InventoryById(String ID);
}
