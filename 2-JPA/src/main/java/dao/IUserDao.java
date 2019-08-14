package dao;

import domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
用户持久层接口
 */
@Repository("userDao")
public interface IUserDao extends JpaRepository<User, Long> {

}
