package com.Tutorial5.Tutorial5springboot.mongodb.Repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.Tutorial5.Tutorial5springboot.mongodb.Model.DataItem;

public interface DataRepository extends MongoRepository<DataItem,String>
{
    @Query("{'name': ?0}")
    Optional<DataItem> findByName(String name);

}

