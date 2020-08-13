package jp.co.tlzs.department.four.demo01.mapper;

import jp.co.tlzs.department.four.demo01.model.User;

import java.util.Map;

public interface UserMapperExt extends UserMapper {
    int updateWithOutCommonFieldByPrimaryKey(User user);

    int updateByPrimaryKeySelectiveWithMap(Map map);
    int deleteAll();
}
