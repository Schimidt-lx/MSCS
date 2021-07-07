package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.WokerData;

/**
 * 员工数据项Mapper接口
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public interface WokerDataMapper 
{
    /**
     * 查询员工数据项
     * 
     * @param UserID 员工数据项ID
     * @return 员工数据项
     */
    public WokerData selectWokerDataById(String UserID);

    /**
     * 查询员工数据项列表
     * 
     * @param wokerData 员工数据项
     * @return 员工数据项集合
     */
    public List<WokerData> selectWokerDataList(WokerData wokerData);

    /**
     * 新增员工数据项
     * 
     * @param wokerData 员工数据项
     * @return 结果
     */
    public int insertWokerData(WokerData wokerData);

    /**
     * 修改员工数据项
     * 
     * @param wokerData 员工数据项
     * @return 结果
     */
    public int updateWokerData(WokerData wokerData);

    /**
     * 删除员工数据项
     * 
     * @param UserID 员工数据项ID
     * @return 结果
     */
    public int deleteWokerDataById(String UserID);

    /**
     * 批量删除员工数据项
     * 
     * @param UserIDs 需要删除的数据ID
     * @return 结果
     */
    public int deleteWokerDataByIds(String[] UserIDs);
}
