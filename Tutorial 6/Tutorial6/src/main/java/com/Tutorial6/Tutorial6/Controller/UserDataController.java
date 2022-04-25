package com.Tutorial6.Tutorial6.Controller;


import com.Tutorial6.Tutorial6.Model.UserData;
import com.Tutorial6.Tutorial6.Repository.UserDataRepository;
import com.Tutorial6.Tutorial6.Service.UserDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/UserData")
public class UserDataController
{

    @Autowired
    private UserDataRepository  repo;
    //--------------------------------------Select------------------------------------------------------------------
    @GetMapping(path = "/selectall")
    public  List<UserData>  selectall()
    {
        return repo.findAll();
    }

    @GetMapping(path = "/select/{id}")
    public  UserData select(@PathVariable int  id)
    {
        return repo.findByuserid(id);
    }

//-----------------------------Save/Update------------------------------------------------------------------

    @PostMapping(path = "/save")
    public UserData save(@RequestBody UserData user)
    {
        //----- New User
        if(user.getUserid()==0)
        {
            // Generate NEW ID
            int i = (int)Math.random();
            double d =  Math.random();
            int factor = 100;
            i = (int)(Math.random() * factor);

            user.setUserid(i);
            repo.save(user);
            user.setStatus("Saved");
        }
        //----- Update User
        else
        {
            // ---Find the user and remove it
            repo.deleteByuserid(user.getUserid());
            // ---update the value and add it again
            repo.save(user);
            user.setStatus("Updated");
        }

        return user;
    }

//-----------------------------Delete------------------------------------------------------------------

    @PostMapping(path = "/delete")
    public UserData delete(@RequestBody UserData user)
    {
        repo.deleteByuserid(user.getUserid());

        UserData _user=  new UserData();
        _user.setStatus("Deleted");

        return _user;
    }
}
