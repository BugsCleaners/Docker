package com.Tutorial5.Tutorial5springboot.mongodb.Service;


import com.Tutorial5.Tutorial5springboot.mongodb.Model.DataItem;
import com.Tutorial5.Tutorial5springboot.mongodb.Repository.DataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class DataService {
    private final DataRepository dataRepository;



    public List<DataItem> Select()
    {
        return dataRepository.findAll();
    }

    public DataItem SelectByName(String name)
    {
        return dataRepository.findByName(name).orElseThrow(() -> new RuntimeException(String.format("Cannot Find Expense by Name - %s", name)));
    }

}