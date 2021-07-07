package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 在售商品数据项对象 On Sale Product
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public class On Sale Product extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String PID;

    /** 名称 */
    @Excel(name = "名称")
    private String Pname;

    /** 单价 */
    @Excel(name = "单价")
    private Long Pprice;

    /** 库存数量 */
    @Excel(name = "库存数量")
    private Long Pnum2;

    /** 销售量 */
    @Excel(name = "销售量")
    private Long sale volume;

    public void setPID(String PID) 
    {
        this.PID = PID;
    }

    public String getPID() 
    {
        return PID;
    }
    public void setPname(String Pname) 
    {
        this.Pname = Pname;
    }

    public String getPname() 
    {
        return Pname;
    }
    public void setPprice(Long Pprice) 
    {
        this.Pprice = Pprice;
    }

    public Long getPprice() 
    {
        return Pprice;
    }
    public void setPnum2(Long Pnum2) 
    {
        this.Pnum2 = Pnum2;
    }

    public Long getPnum2() 
    {
        return Pnum2;
    }
    public void setSale volume(Long sale volume) 
    {
        this.sale volume = sale volume;
    }

    public Long getSale volume() 
    {
        return sale volume;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("PID", getPID())
            .append("Pname", getPname())
            .append("Pprice", getPprice())
            .append("Pnum2", getPnum2())
            .append("sale volume", getSale volume())
            .toString();
    }
}
