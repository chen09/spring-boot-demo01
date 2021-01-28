package jp.co.tlzs.department.four.demo01.service;

import jp.co.tlzs.department.four.demo01.mapper.UserMapperExt;
import jp.co.tlzs.department.four.demo01.model.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    void test01() {
        List<User> users = userService.getUsers(0, 10);
        assertEquals(0, users.size());
    }

    @Test
    void test02() {
        User user = new User();
        user.setName("test");
        user.setAge(10);
        int id = userService.createUser(user);

        user = userService.getUser(id);

        assertEquals("test", user.getName());
        assertEquals(10, user.getAge());
        assertNotNull(user.getId());
    }

    @BeforeAll
    static void beforeAll(@Autowired UserMapperExt userMapperExt) {
        userMapperExt.deleteAll();
    }
}
