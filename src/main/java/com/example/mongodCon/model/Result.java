package com.example.mongodCon.model;

import java.util.ArrayList;
import java.util.List;

public class Result {

    List<ResultData> documents=new ArrayList<ResultData>();

    public List<ResultData> getDocuments() {
        return documents;
    }

    public void setDocuments(List<ResultData> documents) {
        this.documents = documents;
    }
}
