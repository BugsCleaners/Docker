package com.Tutorial6.Tutorial6.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document("UserData")
public class UserData
{
    private int userid;
    private String name;
    private String status;
    public UserData() {}
    public UserData(String name, int userid) {this.name = name;this.userid=userid;}

    @JsonProperty("userid")
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public int getUserid() {return this.userid;}

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("status")
    public String getStatus() {
        return this.status;
    }
    public void setStatus(String status) {
        this.status = status;
    }



}
