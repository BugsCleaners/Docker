package com.reading_from_app_properites.application_properites.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/get")
@RequiredArgsConstructor
public class GetSetting {


    @Value("${app}")
    private String app;


    @GetMapping("reading")
    public String Select()
    {
        return app;
    }


}
