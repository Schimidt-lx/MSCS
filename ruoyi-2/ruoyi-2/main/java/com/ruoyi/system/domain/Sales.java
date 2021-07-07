package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 销售订单对象 Sales
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public class Sales extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 销售记录编号 */
    private String sID;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String name;

    /** 商品编号 */
    @Excel(name = "商品编号")
    private String pID;

    /** 单价 */
    @Excel(name = "单价")
    private String price;

    /** 数量 */
    @Excel(name = "数量")
    private Long nuum;

    /** 金额 */
    @Excel(name = "金额")
    private String Totalprice;

    /** 经手人 */
    @Excel(name = "经手人")
    private String person;

    public void setsID(String sID) 
    {
        this.sID = sID;
    }

    public String getsID() 
    {
        return sID;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setpID(String pID) 
    {
        this.pID = pID;
    }

    public String getpID() 
    {
        return pID;
    }
    public void setPrice(String price) 
    {
        this.price = price;
    }

    public String getPrice() 
    {
        return price;
    }
    public void setNuum(Long nuum) 
    {
        this.nuum = nuum;
    }

    public Long getNuum() 
    {
        return nuum;
    }
    public void setTotalprice(String Totalprice) 
    {
        this.Totalprice = Totalprice;
    }

    public String getTotalprice() 
    {
        return Totalprice;
    }
    public void setPerson(String person) 
    {
        this.person = person;
    }

    public String getPerson() 
    {
        return person;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sID", getsID())
            .append("time", getTime())
            .append("name", getName())
            .append("pID", getpID())
            .append("price", getPrice())
            .append("nuum", getNuum())
            .append("Totalprice", getTotalprice())
            .append("person", getPerson())
            .toString();
    }
}
