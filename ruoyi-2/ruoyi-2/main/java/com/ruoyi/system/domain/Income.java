package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 进货单对象 Income
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public class Income extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单号 */
    private String ID;

    /** 商品编号 */
    @Excel(name = "商品编号")
    private String pID;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String name;

    /** 供应商编号 */
    @Excel(name = "供应商编号")
    private String sID;

    /** 进货时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "进货时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 单价 */
    @Excel(name = "单价")
    private String price;

    /** 数量 */
    @Excel(name = "数量")
    private Long number;

    /** 经手人 */
    @Excel(name = "经手人")
    private String person;

    public void setID(String ID) 
    {
        this.ID = ID;
    }

    public String getID() 
    {
        return ID;
    }
    public void setpID(String pID) 
    {
        this.pID = pID;
    }

    public String getpID() 
    {
        return pID;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
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
    public void setPrice(String price) 
    {
        this.price = price;
    }

    public String getPrice() 
    {
        return price;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
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
            .append("ID", getID())
            .append("pID", getpID())
            .append("name", getName())
            .append("sID", getsID())
            .append("time", getTime())
            .append("price", getPrice())
            .append("number", getNumber())
            .append("person", getPerson())
            .toString();
    }
}
