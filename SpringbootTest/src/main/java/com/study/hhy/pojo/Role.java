package com.study.hhy.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Role {

    private Integer rid;
    @JsonProperty("rname")
    private String rName;

    private Integer aid;
    @JsonProperty("aname")
    private String aName;
    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }
}