package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.IncomeMapper;
import com.ruoyi.system.domain.Income;
import com.ruoyi.system.service.IIncomeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 进货单Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Service
public class IncomeServiceImpl implements IIncomeService 
{
    @Autowired
    private IncomeMapper incomeMapper;

    /**
     * 查询进货单
     * 
     * @param ID 进货单ID
     * @return 进货单
     */
    @Override
    public Income selectIncomeById(String ID)
    {
        return incomeMapper.selectIncomeById(ID);
    }

    /**
     * 查询进货单列表
     * 
     * @param income 进货单
     * @return 进货单
     */
    @Override
    public List<Income> selectIncomeList(Income income)
    {
        return incomeMapper.selectIncomeList(income);
    }

    /**
     * 新增进货单
     * 
     * @param income 进货单
     * @return 结果
     */
    @Override
    public int insertIncome(Income income)
    {
        return incomeMapper.insertIncome(income);
    }

    /**
     * 修改进货单
     * 
     * @param income 进货单
     * @return 结果
     */
    @Override
    public int updateIncome(Income income)
    {
        return incomeMapper.updateIncome(income);
    }

    /**
     * 删除进货单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteIncomeByIds(String ids)
    {
        return incomeMapper.deleteIncomeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除进货单信息
     * 
     * @param ID 进货单ID
     * @return 结果
     */
    @Override
    public int deleteIncomeById(String ID)
    {
        return incomeMapper.deleteIncomeById(ID);
    }
}
