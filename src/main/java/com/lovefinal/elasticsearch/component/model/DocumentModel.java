package com.lovefinal.elasticsearch.component.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Map;

/**
 * @Description TODO
 * @ClassName DocumentModel
 * @Author lizhengfan
 * @Date 2019/5/24 17:31
 * @Version 1.0.0
 **/
@ApiModel
public class DocumentModel implements Serializable {
    @ApiModelProperty(name = "sIndex", value = "sIndex", required = true)
    private String sIndex;
    @ApiModelProperty(name = "sType", value = "sType", required = true)
    private String sType;
    @ApiModelProperty(name = "sID", value = "sID", required = false)
    private String sID;
    @ApiModelProperty(name = "sFields", value = "sFields", required = true)
    private Map<String, Object> sFields;
    @ApiModelProperty(name = "sDesc", value = "sDesc", required = false)
    private String sDesc;


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

    public Map<String, Object> getsFields() {
        return sFields;
    }

    public void setsFields(Map<String, Object> sFields) {
        this.sFields = sFields;
    }

    public String getsDesc() {
        return sDesc;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc;
    }
}
