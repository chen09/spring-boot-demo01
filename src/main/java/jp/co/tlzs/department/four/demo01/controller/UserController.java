package jp.co.tlzs.department.four.demo01.controller;

import jp.co.tlzs.department.four.demo01.model.User;
import jp.co.tlzs.department.four.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(@RequestParam(defaultValue = "0") int offset, @RequestParam(defaultValue = "10") int limit) {
        return userService.getUsers(offset, limit);
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public int createUser(@RequestBody User user) {
        user.setId(null);
        user.setUseFlg(null);
        user.setDelFlg(null);
        user.setCreatedAt(null);
        user.setCreatedUserId(null);
        user.setUpdatedAt(null);
        user.setUpdatedUserId(null);
        userService.createUser(user);
        return user.getId();
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "OK";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.PATCH)
    public int updateUser(@PathVariable int id, @RequestBody User user) {
        user.setId(id);
        user.setUseFlg(null);
        user.setDelFlg(null);
        user.setCreatedAt(null);
        user.setCreatedUserId(null);
        user.setUpdatedAt(null);
        user.setUpdatedUserId(null);
        return userService.updateUser(user);
    }
}
