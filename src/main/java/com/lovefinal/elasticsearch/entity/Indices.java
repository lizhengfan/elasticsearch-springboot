package com.lovefinal.elasticsearch.entity;

import javax.persistence.*;

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
    @Column(length = 128)
    private String sID;

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
}
