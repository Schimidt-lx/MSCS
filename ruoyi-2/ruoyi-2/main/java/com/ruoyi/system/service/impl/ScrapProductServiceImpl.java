package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ScrapProductMapper;
import com.ruoyi.system.domain.ScrapProduct;
import com.ruoyi.system.service.IScrapProductService;
import com.ruoyi.common.core.text.Convert;

/**
 * 报废商品Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Service
public class ScrapProductServiceImpl implements IScrapProductService 
{
    @Autowired
    private ScrapProductMapper scrapProductMapper;

    /**
     * 查询报废商品
     * 
     * @param ID 报废商品ID
     * @return 报废商品
     */
    @Override
    public ScrapProduct selectScrapProductById(String ID)
    {
        return scrapProductMapper.selectScrapProductById(ID);
    }

    /**
     * 查询报废商品列表
     * 
     * @param scrapProduct 报废商品
     * @return 报废商品
     */
    @Override
    public List<ScrapProduct> selectScrapProductList(ScrapProduct scrapProduct)
    {
        return scrapProductMapper.selectScrapProductList(scrapProduct);
    }

    /**
     * 新增报废商品
     * 
     * @param scrapProduct 报废商品
     * @return 结果
     */
    @Override
    public int insertScrapProduct(ScrapProduct scrapProduct)
    {
        return scrapProductMapper.insertScrapProduct(scrapProduct);
    }

    /**
     * 修改报废商品
     * 
     * @param scrapProduct 报废商品
     * @return 结果
     */
    @Override
    public int updateScrapProduct(ScrapProduct scrapProduct)
    {
        return scrapProductMapper.updateScrapProduct(scrapProduct);
    }

    /**
     * 删除报废商品对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteScrapProductByIds(String ids)
    {
        return scrapProductMapper.deleteScrapProductByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除报废商品信息
     * 
     * @param ID 报废商品ID
     * @return 结果
     */
    @Override
    public int deleteScrapProductById(String ID)
    {
        return scrapProductMapper.deleteScrapProductById(ID);
    }
}
