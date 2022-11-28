package com.shopping.api.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.api.Model.UserModel;

import jakarta.annotation.PostConstruct;

@RestController
public class UserController {

    @GetMapping("/")
    public String getMessage(){
        return "Spring Boot is Working";
    }

    public static List<UserModel> userList = new ArrayList<UserModel>();

    @PostConstruct
    public void initialList(){
        UserModel user1 = new UserModel();
            user1.setNome("Ramon Casagrande");
            user1.setCpf("04191679945");
            user1.setEndereco("Rua Felipe Schmidt, 249");
            user1.setEmail("ramon@email.com");
            user1.setTelefone("3413-8848");
            user1.setDataCadastro(new Date());

            userList.add(user1);
    }

    @GetMapping("/users")
    public List<UserModel> getUser(){
        return userList;
    }
    
}
