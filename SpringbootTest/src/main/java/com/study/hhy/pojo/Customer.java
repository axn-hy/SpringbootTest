package com.study.hhy.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    private Integer cid;
    @JsonProperty("cname")
    private String cName;
    @JsonProperty("cage")
    private Integer cAge;
    @JsonProperty("cgnder")
    private String cGnder;

    private Integer rid;

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }
    @JsonProperty("rname")
    private String rName;
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public Integer getcAge() {
        return cAge;
    }

    public void setcAge(Integer cAge) {
        this.cAge = cAge;
    }

    public String getcGnder() {
        return cGnder;
    }

    public void setcGnder(String cGnder) {
        this.cGnder = cGnder == null ? null : cGnder.trim();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}