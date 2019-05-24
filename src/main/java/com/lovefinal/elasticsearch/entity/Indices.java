package com.lovefinal.elasticsearch.entity;

import com.alibaba.fastjson.JSON;
import com.lovefinal.elasticsearch.component.model.IndicesModel;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description 文档类
 * @ClassName Indices
 * @Author lizhengfan
 * @Date 2019/5/22 10:27
 * @Version 1.0.0
 **/
@Entity
@Table(name = "indices")
public class Indices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iID;
    @Column(length = 128)
    private String sIndex;
    @Column(length = 20)
    private String sType;
    private Integer iShards;
    private Integer iReplicas;
    private String sFields;
    private Date dNewDate;
    @Column(length = 256)
    private String sDesc;

    public Indices(IndicesModel model) {
        this.sIndex = model.getsIndex();
        this.sType = model.getsType();
        this.iShards = model.getiShards();
        this.iReplicas = model.getiReplicas();
        this.sDesc = model.getsDesc();
        this.dNewDate = new Date();
        this.sFields = JSON.toJSONString(model.getsFields());
    }

    public Integer getiID() {
        return iID;
    }

    public void setiID(Integer iID) {
        this.iID = iID;
    }

    public String getsIndex() {
        return sIndex;
    }

    public void setsIndex(String sIndex) {
        this.sIndex = sIndex;
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType;
    }

    public Integer getiShards() {
        return iShards;
    }

    public void setiShards(Integer iShards) {
        this.iShards = iShards;
    }

    public Integer getiReplicas() {
        return iReplicas;
    }

    public void setiReplicas(Integer iReplicas) {
        this.iReplicas = iReplicas;
    }

    public String getsFields() {
        return sFields;
    }

    public void setsFields(String sFields) {
        this.sFields = sFields;
    }

    public Date getdNewDate() {
        return dNewDate;
    }

    public void setdNewDate(Date dNewDate) {
        this.dNewDate = dNewDate;
    }

    public String getsDesc() {
        return sDesc;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc;
    }
}
