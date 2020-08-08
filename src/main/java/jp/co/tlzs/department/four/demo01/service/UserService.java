package jp.co.tlzs.department.four.demo01.service;

import jp.co.tlzs.department.four.demo01.mapper.UserMapper;
import jp.co.tlzs.department.four.demo01.model.User;
import jp.co.tlzs.department.four.demo01.model.UserExample;
import org.apache.ibatis.session.RowBounds;
import org.graalvm.compiler.lir.LIRInstruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers(int offset, int limit) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUseFlgEqualTo(true).andDelFlgNotEqualTo(true);
        return userMapper.selectByExampleWithRowbounds(userExample, new RowBounds(offset, limit));
    }

    public User getUser(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public void update(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    public void unuse(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUseFlg(false);
        userMapper.updateByPrimaryKey(user);
    }

    public void delete(Integer id) {
        User user = new User();
        user.setId(id);
        user.setDelFlg(true);
        userMapper.updateByPrimaryKey(user);
    }

    public void insert(User user) {
        userMapper.insertSelective(user);
    }


}
