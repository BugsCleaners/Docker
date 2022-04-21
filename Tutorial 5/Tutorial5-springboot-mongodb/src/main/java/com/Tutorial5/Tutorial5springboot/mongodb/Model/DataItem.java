package com.Tutorial5.Tutorial5springboot.mongodb.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("DataItem")
public class DataItem {

    @Field(name = "dataid")
    public String dataid;

    @Field(name = "name")
    public String name;

    @Field(name = "country")
    public String country;

    @Field(name = "phonenumber")
    public String phonenumber;


}
