package com.Tutorial5.Tutorial5springboot.mongodb.Controller;

import com.Tutorial5.Tutorial5springboot.mongodb.Model.DataItem;
import com.Tutorial5.Tutorial5springboot.mongodb.Service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Data")
@RequiredArgsConstructor
public class DataController {
    private final DataService _service;

    @GetMapping("select")
    public ResponseEntity<List<DataItem>> Select() {
        return ResponseEntity.ok(_service.Select());
    }

    @GetMapping("select/{name}")
    public ResponseEntity SelectByName(@PathVariable String name) {
        return ResponseEntity.ok(_service.SelectByName(name));

    }
}