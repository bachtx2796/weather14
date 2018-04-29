package com.example.bb.weather14.data.dto;

import com.google.gson.annotations.SerializedName;

public class Imperial {
    @SerializedName("UnitType")
    private int unitType;
    @SerializedName("Value")
    private float value;
    @SerializedName("Unit")
    private String unit;

    public void setUnitType(int unitType) {
        this.unitType = unitType;
    }

    public int getUnitType() {
        return unitType;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

}
