package com.Tutorial6.Tutorial6.Controller;

import com.Tutorial6.Tutorial6.Repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/UserData")
public class UserDataController
{
    @Autowired
    private UserDataRepository  repo;

    @Value("${fileport}")
    public String fileport;



    @GetMapping(path = "/internal")
    public ResponseEntity<String> selectall()
    {
        RestTemplate restTemplate = new RestTemplate();

        String baseUrl = "http://localhost:"+ fileport +"/api/UserData/selectall";

        ResponseEntity<String> result = restTemplate.getForEntity(baseUrl,String.class);
        { return result; }
    }
    /*public  List<UserData>  internal()
    {
          ///api/UserData/internalselectall
        return repo.findAll();
        http://localhost:8085/api/UserData/selectall
    }*/


}
