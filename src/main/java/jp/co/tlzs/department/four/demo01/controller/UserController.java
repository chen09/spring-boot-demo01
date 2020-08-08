package jp.co.tlzs.department.four.demo01.controller;

import jp.co.tlzs.department.four.demo01.model.User;
import jp.co.tlzs.department.four.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(@RequestParam(defaultValue = "0") int offset, @RequestParam(defaultValue = "10") int limit) {
        List<User> users = userService.getUsers(offset, limit);

        return users;
    }

//    @GetMapping("/users/{id}")
//    public User getUser(@RequestParam int id) {
//        return userService.getUser(id);
//    }
}
