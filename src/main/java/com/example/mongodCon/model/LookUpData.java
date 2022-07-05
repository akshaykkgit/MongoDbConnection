package com.example.mongodCon.model;

public class LookUpData {


    public String from;
    public String localField;
    public String foreignField;
    public String as;
    public LookUpData(){

    }

    public LookUpData(String from, String localField, String foreignField, String as) {
        this.from = from;
        this.localField = localField;
        this.foreignField = foreignField;
        this.as = as;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getLocalField() {
        return localField;
    }

    public void setLocalField(String localField) {
        this.localField = localField;
    }

    public String getForeignField() {
        return foreignField;
    }

    public void setForeignField(String foreignField) {
        this.foreignField = foreignField;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }
}
