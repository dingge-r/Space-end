package com.eurasia.first.modules.first.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

@TableName("space")
public class SpaceEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    private Integer id;
    private String kjname;
    private String kjnum;
    private String kjaddress;
    private String week;
    private  String kjtime;

    public String getKjtime() {
        return kjtime;
    }

    public void setKjtime(String kjtime) {
        this.kjtime = kjtime;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getKjaddress() {
        return kjaddress;
    }

    public void setKjaddress(String kjaddress) {
        this.kjaddress = kjaddress;
    }

    public String getKjnum() {
        return kjnum;
    }

    public void setKjnum(String kjnum) {
        this.kjnum = kjnum;
    }

    public String getKjname() {
        return kjname;
    }

    public void setKjname(String kjname) {
        this.kjname = kjname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
