package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SalesMapper;
import com.ruoyi.system.domain.Sales;
import com.ruoyi.system.service.ISalesService;
import com.ruoyi.common.core.text.Convert;

/**
 * 销售订单Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Service
public class SalesServiceImpl implements ISalesService 
{
    @Autowired
    private SalesMapper salesMapper;

    /**
     * 查询销售订单
     * 
     * @param sID 销售订单ID
     * @return 销售订单
     */
    @Override
    public Sales selectSalesById(String sID)
    {
        return salesMapper.selectSalesById(sID);
    }

    /**
     * 查询销售订单列表
     * 
     * @param sales 销售订单
     * @return 销售订单
     */
    @Override
    public List<Sales> selectSalesList(Sales sales)
    {
        return salesMapper.selectSalesList(sales);
    }

    /**
     * 新增销售订单
     * 
     * @param sales 销售订单
     * @return 结果
     */
    @Override
    public int insertSales(Sales sales)
    {
        return salesMapper.insertSales(sales);
    }

    /**
     * 修改销售订单
     * 
     * @param sales 销售订单
     * @return 结果
     */
    @Override
    public int updateSales(Sales sales)
    {
        return salesMapper.updateSales(sales);
    }

    /**
     * 删除销售订单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSalesByIds(String ids)
    {
        return salesMapper.deleteSalesByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除销售订单信息
     * 
     * @param sID 销售订单ID
     * @return 结果
     */
    @Override
    public int deleteSalesById(String sID)
    {
        return salesMapper.deleteSalesById(sID);
    }
}
