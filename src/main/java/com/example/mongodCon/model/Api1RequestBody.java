package com.example.mongodCon.model;

import java.util.List;

public class Api1RequestBody {
    public String collection;
    public String database;
    public String dataSource;

    public Api1RequestBody(String collection, String database, String dataSource) {
        this.collection = collection;
        this.database = database;
        this.dataSource = dataSource;
    }

//    public List<LookUp> pipeline;
//
//    public Api1RequestBody(){
//
//    }
//
//    public Api1RequestBody(String collection, String database, String dataSource, List<LookUp> pipeline) {
//        this.collection = collection;
//        this.database = database;
//        this.dataSource = dataSource;
//        this.pipeline = pipeline;
//    }
//
//    public List<LookUp> getPipeline() {
//        return pipeline;
//    }
//
//    public void setPipeline(List<LookUp> pipeline) {
//        this.pipeline = pipeline;
//    }
//
//    public String getCollection() {
//        return collection;
//    }
//
//    public void setCollection(String collection) {
//        this.collection = collection;
//    }
//
//    public String getDatabase() {
//        return database;
//    }
//
//    public void setDatabase(String database) {
//        this.database = database;
//    }
//
//    public String getDataSource() {
//        return dataSource;
//    }
//
//    public void setDataSource(String dataSource) {
//        this.dataSource = dataSource;
//    }


}
