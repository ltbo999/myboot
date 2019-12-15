package com.hunau.mydatauser.entity;

import javax.persistence.*;

/**
 * @Systemname:湖南灾害应急管理系统
 * @Author:唐耿涛
 * @Description:
 * @Date:Created in $[TIME] $[DATE]
 * @Unitname:湖南农业大学信息学院物联网工程系
 * @Copyright:综合训练系统V1.0
 * @Rewriting:唐耿涛
 */
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;
import java.util.List;
@Entity
@Table(name="tb_user")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @NotEmpty(message="名字不能为空")
    @Column(length=40)
    private String name;
    @NotEmpty(message="密码不能为空")
    @Column(length=50)
    private String pwd;
    private String sexy;
    private String birthhday;
    private boolean isuse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSexy() {
        return sexy;
    }

    public void setSexy(String sexy) {
        this.sexy = sexy;
    }

    public String getBirthhday() {
        return birthhday;
    }

    public void setBirthhday(String birthhday) {
        this.birthhday = birthhday;
    }

    public boolean isIsuse() {
        return isuse;
    }

    public void setIsuse(boolean isuse) {
        this.isuse = isuse;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sexy='" + sexy + '\'' +
                ", birthhday=" + birthhday +
                ", isuse=" + isuse +
                '}';
    }
}
