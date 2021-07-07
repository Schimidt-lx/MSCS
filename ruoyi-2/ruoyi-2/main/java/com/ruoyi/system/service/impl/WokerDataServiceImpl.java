package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WokerDataMapper;
import com.ruoyi.system.domain.WokerData;
import com.ruoyi.system.service.IWokerDataService;
import com.ruoyi.common.core.text.Convert;

/**
 * 员工数据项Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Service
public class WokerDataServiceImpl implements IWokerDataService 
{
    @Autowired
    private WokerDataMapper wokerDataMapper;

    /**
     * 查询员工数据项
     * 
     * @param UserID 员工数据项ID
     * @return 员工数据项
     */
    @Override
    public WokerData selectWokerDataById(String UserID)
    {
        return wokerDataMapper.selectWokerDataById(UserID);
    }

    /**
     * 查询员工数据项列表
     * 
     * @param wokerData 员工数据项
     * @return 员工数据项
     */
    @Override
    public List<WokerData> selectWokerDataList(WokerData wokerData)
    {
        return wokerDataMapper.selectWokerDataList(wokerData);
    }

    /**
     * 新增员工数据项
     * 
     * @param wokerData 员工数据项
     * @return 结果
     */
    @Override
    public int insertWokerData(WokerData wokerData)
    {
        return wokerDataMapper.insertWokerData(wokerData);
    }

    /**
     * 修改员工数据项
     * 
     * @param wokerData 员工数据项
     * @return 结果
     */
    @Override
    public int updateWokerData(WokerData wokerData)
    {
        return wokerDataMapper.updateWokerData(wokerData);
    }

    /**
     * 删除员工数据项对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWokerDataByIds(String ids)
    {
        return wokerDataMapper.deleteWokerDataByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除员工数据项信息
     * 
     * @param UserID 员工数据项ID
     * @return 结果
     */
    @Override
    public int deleteWokerDataById(String UserID)
    {
        return wokerDataMapper.deleteWokerDataById(UserID);
    }
}
