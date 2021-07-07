package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.On Sale Product;

/**
 * 在售商品数据项Service接口
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public interface IOn Sale ProductService 
{
    /**
     * 查询在售商品数据项
     * 
     * @param PID 在售商品数据项ID
     * @return 在售商品数据项
     */
    public On Sale Product selectOn Sale ProductById(String PID);

    /**
     * 查询在售商品数据项列表
     * 
     * @param on Sale Product 在售商品数据项
     * @return 在售商品数据项集合
     */
    public List<On Sale Product> selectOn Sale ProductList(On Sale Product on Sale Product);

    /**
     * 新增在售商品数据项
     * 
     * @param on Sale Product 在售商品数据项
     * @return 结果
     */
    public int insertOn Sale Product(On Sale Product on Sale Product);

    /**
     * 修改在售商品数据项
     * 
     * @param on Sale Product 在售商品数据项
     * @return 结果
     */
    public int updateOn Sale Product(On Sale Product on Sale Product);

    /**
     * 批量删除在售商品数据项
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOn Sale ProductByIds(String ids);

    /**
     * 删除在售商品数据项信息
     * 
     * @param PID 在售商品数据项ID
     * @return 结果
     */
    public int deleteOn Sale ProductById(String PID);
}
