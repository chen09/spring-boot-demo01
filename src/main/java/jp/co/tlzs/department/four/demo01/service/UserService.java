package jp.co.tlzs.department.four.demo01.service;

import jp.co.tlzs.department.four.demo01.mapper.UserMapper;
import jp.co.tlzs.department.four.demo01.mapper.UserMapperExt;
import jp.co.tlzs.department.four.demo01.model.User;
import jp.co.tlzs.department.four.demo01.model.UserExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
//    @Autowired
//    private UserMapper userMapper;

    @Autowired
    private UserMapperExt userMapperExt;

    public List<User> getUsers(int offset, int limit) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUseFlgEqualTo(true).andDelFlgNotEqualTo(true);
        return userMapperExt.selectByExampleWithRowbounds(userExample, new RowBounds(offset, limit));
    }

    public User getUser(Integer id) {
        return userMapperExt.selectByPrimaryKey(id);
    }

    public int createUser(User user) {
        return userMapperExt.insertSelective(user);
    }

    public int updateUser(Map map) {
        return userMapperExt.updateByPrimaryKeySelectiveWithMap(map);
    }

    public int updateUser(User user) {
        return userMapperExt.updateWithOutCommonFieldByPrimaryKey(user);
    }

    public void unuse(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUseFlg(false);
        userMapperExt.updateByPrimaryKey(user);
    }

    public void deleteUser(Integer id) {
        User user = new User();
        user.setId(id);
        user.setDelFlg(true);
        userMapperExt.updateByPrimaryKeySelective(user);
    }


}
