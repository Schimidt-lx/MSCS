package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ScrapProduct;

/**
 * 报废商品Service接口
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public interface IScrapProductService 
{
    /**
     * 查询报废商品
     * 
     * @param ID 报废商品ID
     * @return 报废商品
     */
    public ScrapProduct selectScrapProductById(String ID);

    /**
     * 查询报废商品列表
     * 
     * @param scrapProduct 报废商品
     * @return 报废商品集合
     */
    public List<ScrapProduct> selectScrapProductList(ScrapProduct scrapProduct);

    /**
     * 新增报废商品
     * 
     * @param scrapProduct 报废商品
     * @return 结果
     */
    public int insertScrapProduct(ScrapProduct scrapProduct);

    /**
     * 修改报废商品
     * 
     * @param scrapProduct 报废商品
     * @return 结果
     */
    public int updateScrapProduct(ScrapProduct scrapProduct);

    /**
     * 批量删除报废商品
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteScrapProductByIds(String ids);

    /**
     * 删除报废商品信息
     * 
     * @param ID 报废商品ID
     * @return 结果
     */
    public int deleteScrapProductById(String ID);
}
