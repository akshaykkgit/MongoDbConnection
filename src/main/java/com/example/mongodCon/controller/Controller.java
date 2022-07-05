package com.example.mongodCon.controller;


import com.example.mongodCon.model.Api1RequestBody;
import com.example.mongodCon.model.LookUp;
import com.example.mongodCon.model.LookUpData;
import com.example.mongodCon.model.Result;
import com.example.mongodCon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class Controller {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/Check")
    public String done()  throws Exception{
        return "done";
    }

    @RequestMapping(value = "/getErrorData")
    public Result somePg()  {
        Api1RequestBody requestBody=null;
        ResponseEntity<Result> result=null;
        Result result1=null;

        try {
            final String baseUrl = "https://data.mongodb-api.com/app/data-sbkkw/endpoint/data/v1/action/find";
            URI uri = new URI(baseUrl);
            Api1RequestBody api1RequestBody =new Api1RequestBody("collection1","analyzer","analyser");
            ////LookUpData lookUpData = new LookUpData("analyzer_errors_collection", "error_code", "errror_code", "errror_code_details");
//            LookUp lookUp=new LookUp(lookUpData);
//
//
//            List<LookUp> lookUps = new ArrayList<LookUp>();
//            lookUps.add(lookUp);
//

           // Api1RequestBody api1RequestBody = new Api1RequestBody("analyzer_redmine_data", "analyzer", "analyzer", lookUps);

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            headers.set("Access-Control-Request-Headers", "*");
            headers.set("api-key", "qZOSUzY1pbrp0VUhbwflo42fsnnRQKDYCym84IRyz7vTfoc80A4KTkVpzIcnJAN0");
            headers.set("Accept", "application/json");

            HttpEntity<Api1RequestBody> request = new HttpEntity<>(api1RequestBody, headers);
            requestBody = api1RequestBody;
            result = restTemplate.postForEntity(uri, request, Result.class);

             result1=result.getBody();
           int a=10;
           a=9;
        }
        catch (Exception exception){
            System.out.println("Exception");
        }

        return result1;
    }

}
