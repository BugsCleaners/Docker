package com.Tutorial6.Tutorial6.Repository;

import com.Tutorial6.Tutorial6.Model.UserData;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserDataRepository extends MongoRepository<UserData,String>
{

    public  UserData findByuserid(int userid);

    public  UserData deleteByuserid(int userid);


}