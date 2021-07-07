package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 员工数据项对象 WokerData
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public class WokerData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 员工编号 */
    private String UserID;

    /** 用户的登陆密码 */
    @Excel(name = "用户的登陆密码")
    private String password;

    /** 用户的名字 */
    @Excel(name = "用户的名字")
    private String name;

    /** 用户性别 */
    @Excel(name = "用户性别")
    private String sex;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phonenumber;

    /** 职位 */
    @Excel(name = "职位")
    private String post;

    /** 权限 */
    @Excel(name = "权限")
    private String jurisdiction;

    public void setUserID(String UserID) 
    {
        this.UserID = UserID;
    }

    public String getUserID() 
    {
        return UserID;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setPhonenumber(String phonenumber) 
    {
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() 
    {
        return phonenumber;
    }
    public void setPost(String post) 
    {
        this.post = post;
    }

    public String getPost() 
    {
        return post;
    }
    public void setJurisdiction(String jurisdiction) 
    {
        this.jurisdiction = jurisdiction;
    }

    public String getJurisdiction() 
    {
        return jurisdiction;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("UserID", getUserID())
            .append("password", getPassword())
            .append("name", getName())
            .append("sex", getSex())
            .append("phonenumber", getPhonenumber())
            .append("post", getPost())
            .append("jurisdiction", getJurisdiction())
            .toString();
    }
}
