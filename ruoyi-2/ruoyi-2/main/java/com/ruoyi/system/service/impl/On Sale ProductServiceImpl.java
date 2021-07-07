package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.On Sale ProductMapper;
import com.ruoyi.system.domain.On Sale Product;
import com.ruoyi.system.service.IOn Sale ProductService;
import com.ruoyi.common.core.text.Convert;

/**
 * 在售商品数据项Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Service
public class On Sale ProductServiceImpl implements IOn Sale ProductService 
{
    @Autowired
    private On Sale ProductMapper on Sale ProductMapper;

    /**
     * 查询在售商品数据项
     * 
     * @param PID 在售商品数据项ID
     * @return 在售商品数据项
     */
    @Override
    public On Sale Product selectOn Sale ProductById(String PID)
    {
        return on Sale ProductMapper.selectOn Sale ProductById(PID);
    }

    /**
     * 查询在售商品数据项列表
     * 
     * @param on Sale Product 在售商品数据项
     * @return 在售商品数据项
     */
    @Override
    public List<On Sale Product> selectOn Sale ProductList(On Sale Product on Sale Product)
    {
        return on Sale ProductMapper.selectOn Sale ProductList(on Sale Product);
    }

    /**
     * 新增在售商品数据项
     * 
     * @param on Sale Product 在售商品数据项
     * @return 结果
     */
    @Override
    public int insertOn Sale Product(On Sale Product on Sale Product)
    {
        return on Sale ProductMapper.insertOn Sale Product(on Sale Product);
    }

    /**
     * 修改在售商品数据项
     * 
     * @param on Sale Product 在售商品数据项
     * @return 结果
     */
    @Override
    public int updateOn Sale Product(On Sale Product on Sale Product)
    {
        return on Sale ProductMapper.updateOn Sale Product(on Sale Product);
    }

    /**
     * 删除在售商品数据项对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOn Sale ProductByIds(String ids)
    {
        return on Sale ProductMapper.deleteOn Sale ProductByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除在售商品数据项信息
     * 
     * @param PID 在售商品数据项ID
     * @return 结果
     */
    @Override
    public int deleteOn Sale ProductById(String PID)
    {
        return on Sale ProductMapper.deleteOn Sale ProductById(PID);
    }
}
