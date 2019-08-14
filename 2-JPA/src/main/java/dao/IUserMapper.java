package dao;

import domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/*
使用mybatis实现对数据库的操作接口
 */
@Mapper
public interface IUserMapper {

    @Select("select * from user where name like '%${value}%'")
    public List<User> queryUserByName(String name);
}
