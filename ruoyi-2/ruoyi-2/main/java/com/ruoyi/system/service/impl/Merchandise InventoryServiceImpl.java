package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.Merchandise InventoryMapper;
import com.ruoyi.system.domain.Merchandise Inventory;
import com.ruoyi.system.service.IMerchandise InventoryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 库存商品Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Service
public class Merchandise InventoryServiceImpl implements IMerchandise InventoryService 
{
    @Autowired
    private Merchandise InventoryMapper merchandise InventoryMapper;

    /**
     * 查询库存商品
     * 
     * @param ID 库存商品ID
     * @return 库存商品
     */
    @Override
    public Merchandise Inventory selectMerchandise InventoryById(String ID)
    {
        return merchandise InventoryMapper.selectMerchandise InventoryById(ID);
    }

    /**
     * 查询库存商品列表
     * 
     * @param merchandise Inventory 库存商品
     * @return 库存商品
     */
    @Override
    public List<Merchandise Inventory> selectMerchandise InventoryList(Merchandise Inventory merchandise Inventory)
    {
        return merchandise InventoryMapper.selectMerchandise InventoryList(merchandise Inventory);
    }

    /**
     * 新增库存商品
     * 
     * @param merchandise Inventory 库存商品
     * @return 结果
     */
    @Override
    public int insertMerchandise Inventory(Merchandise Inventory merchandise Inventory)
    {
        return merchandise InventoryMapper.insertMerchandise Inventory(merchandise Inventory);
    }

    /**
     * 修改库存商品
     * 
     * @param merchandise Inventory 库存商品
     * @return 结果
     */
    @Override
    public int updateMerchandise Inventory(Merchandise Inventory merchandise Inventory)
    {
        return merchandise InventoryMapper.updateMerchandise Inventory(merchandise Inventory);
    }

    /**
     * 删除库存商品对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMerchandise InventoryByIds(String ids)
    {
        return merchandise InventoryMapper.deleteMerchandise InventoryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除库存商品信息
     * 
     * @param ID 库存商品ID
     * @return 结果
     */
    @Override
    public int deleteMerchandise InventoryById(String ID)
    {
        return merchandise InventoryMapper.deleteMerchandise InventoryById(ID);
    }
}
