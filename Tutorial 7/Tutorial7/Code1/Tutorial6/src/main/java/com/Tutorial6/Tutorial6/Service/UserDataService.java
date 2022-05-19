package com.Tutorial6.Tutorial6.Service;

import com.Tutorial6.Tutorial6.Model.UserData;
import com.Tutorial6.Tutorial6.Repository.UserDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserDataService {


    private final UserDataRepository _repository;


    public void Save(UserData userData) {
        _repository.save(userData);
    }


    public List<UserData> select() {
        return _repository.findAll();

    }

    public UserData selectName(String name) {
        return _repository.findById(name)
                .orElseThrow(() -> new RuntimeException(String.format("Cannot Find Expense by Name - %s", name)));
    }
}