package com.lovefinal.elasticsearch.entity;

import javax.persistence.*;

/**
 * @Description TODO
 * @ClassName Document
 * @Author lizhengfan
 * @Date 2019/5/24 17:42
 * @Version 1.0.0
 **/
@Entity
@Table(name = "document")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iID;
    @Column(length = 128)
    private String sIndex;
    @Column(length = 20)
    private String sType;
    @Column(length = 128)
    private String sID;
    private String sFields;
    @Column(length = 128)
    private String sDesc;

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

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getsFields() {
        return sFields;
    }

    public void setsFields(String sFields) {
        this.sFields = sFields;
    }

    public String getsDesc() {
        return sDesc;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc;
    }
}
