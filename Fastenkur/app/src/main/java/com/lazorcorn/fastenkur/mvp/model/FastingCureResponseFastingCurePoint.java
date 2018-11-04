package com.lazorcorn.fastenkur.mvp.model;

public class FastingCureResponseFastingCurePoint {
    private String pointId;
    private String name;
    private int type;
    private String region;

    public String getPointId() {
        return this.pointId;
    }

    public void setPointId(String pointId) {
        this.pointId = pointId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
