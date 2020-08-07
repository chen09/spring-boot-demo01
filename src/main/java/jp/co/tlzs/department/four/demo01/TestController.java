package jp.co.tlzs.department.four.demo01;

import jp.co.tlzs.department.four.demo01.mapper.UserMapper;
import jp.co.tlzs.department.four.demo01.model.User;
import jp.co.tlzs.department.four.demo01.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/test")
    public List<User> test() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(1);
        List<User> users = userMapper.selectByExample(userExample);

        return users;
    }

}
