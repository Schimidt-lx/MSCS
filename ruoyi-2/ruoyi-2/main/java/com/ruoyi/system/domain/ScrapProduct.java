package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 报废商品对象 ScrapProduct
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public class ScrapProduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String ID;

    /** 名字 */
    @Excel(name = "名字")
    private String name;

    /** 进价 */
    @Excel(name = "进价")
    private Long in price;

    /** 数量 */
    @Excel(name = "数量")
    private String num;

    /** 报废原因 */
    @Excel(name = "报废原因")
    private String reason;

    /** 损失金额 */
    @Excel(name = "损失金额")
    private Long amout of loss;

    public void setID(String ID) 
    {
        this.ID = ID;
    }

    public String getID() 
    {
        return ID;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setIn price(Long in price) 
    {
        this.in price = in price;
    }

    public Long getIn price() 
    {
        return in price;
    }
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
    }
    public void setAmout of loss(Long amout of loss) 
    {
        this.amout of loss = amout of loss;
    }

    public Long getAmout of loss() 
    {
        return amout of loss;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ID", getID())
            .append("name", getName())
            .append("in price", getIn price())
            .append("num", getNum())
            .append("reason", getReason())
            .append("amout of loss", getAmout of loss())
            .toString();
    }
}
