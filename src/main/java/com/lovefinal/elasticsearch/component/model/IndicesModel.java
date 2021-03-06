package com.lovefinal.elasticsearch.component.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Map;

/**
 * @Description TODO
 * @ClassName IndicesModel
 * @Author lizhengfan
 * @Date 2019/5/22 18:12
 * @Version 1.0.0
 **/
@ApiModel
public class IndicesModel implements Serializable {
    @ApiModelProperty(name = "sIndex", value = "sIndex", required = true)
    private String sIndex;
    @ApiModelProperty(name = "sType", value = "sType", required = true)
    private String sType;
    @ApiModelProperty(name = "iShards", value = "iShards", required = false)
    private Integer iShards;
    @ApiModelProperty(name = "iReplicas", value = "iReplicas", required = false)
    private Integer iReplicas;
    @ApiModelProperty(name = "sFields", value = "sFields", required = true)
    private Map<String, Map<String, Object>> sFields;
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

    public String getsDesc() {
        return sDesc;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc;
    }

    public Map<String, Map<String, Object>> getsFields() {
        return sFields;
    }

    public void setsFields(Map<String, Map<String, Object>> sFields) {
        this.sFields = sFields;
    }
}
