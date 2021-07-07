package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Sales;

/**
 * 销售订单Mapper接口
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public interface SalesMapper 
{
    /**
     * 查询销售订单
     * 
     * @param sID 销售订单ID
     * @return 销售订单
     */
    public Sales selectSalesById(String sID);

    /**
     * 查询销售订单列表
     * 
     * @param sales 销售订单
     * @return 销售订单集合
     */
    public List<Sales> selectSalesList(Sales sales);

    /**
     * 新增销售订单
     * 
     * @param sales 销售订单
     * @return 结果
     */
    public int insertSales(Sales sales);

    /**
     * 修改销售订单
     * 
     * @param sales 销售订单
     * @return 结果
     */
    public int updateSales(Sales sales);

    /**
     * 删除销售订单
     * 
     * @param sID 销售订单ID
     * @return 结果
     */
    public int deleteSalesById(String sID);

    /**
     * 批量删除销售订单
     * 
     * @param sIDs 需要删除的数据ID
     * @return 结果
     */
    public int deleteSalesByIds(String[] sIDs);
}
