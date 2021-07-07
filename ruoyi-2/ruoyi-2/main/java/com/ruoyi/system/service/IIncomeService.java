package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Income;

/**
 * 进货单Service接口
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public interface IIncomeService 
{
    /**
     * 查询进货单
     * 
     * @param ID 进货单ID
     * @return 进货单
     */
    public Income selectIncomeById(String ID);

    /**
     * 查询进货单列表
     * 
     * @param income 进货单
     * @return 进货单集合
     */
    public List<Income> selectIncomeList(Income income);

    /**
     * 新增进货单
     * 
     * @param income 进货单
     * @return 结果
     */
    public int insertIncome(Income income);

    /**
     * 修改进货单
     * 
     * @param income 进货单
     * @return 结果
     */
    public int updateIncome(Income income);

    /**
     * 批量删除进货单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteIncomeByIds(String ids);

    /**
     * 删除进货单信息
     * 
     * @param ID 进货单ID
     * @return 结果
     */
    public int deleteIncomeById(String ID);
}
