package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 库存商品对象 Merchandise Inventory
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public class Merchandise Inventory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品名字 */
    private String ID;

    /** 商品编号 */
    @Excel(name = "商品编号")
    private String name;

    /** 供应商编号 */
    @Excel(name = "供应商编号")
    private String gID;

    /** 当前库存数量 */
    @Excel(name = "当前库存数量")
    private Long num;

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
    public void setgID(String gID) 
    {
        this.gID = gID;
    }

    public String getgID() 
    {
        return gID;
    }
    public void setNum(Long num) 
    {
        this.num = num;
    }

    public Long getNum() 
    {
        return num;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ID", getID())
            .append("name", getName())
            .append("gID", getgID())
            .append("num", getNum())
            .toString();
    }
}
