package com.bokecc.boot.dao;

import com.bokecc.boot.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by lijm on 2017/12/3.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByNameLike(String name);

    User readByName(String name);

    List<User> getByCreateDateLessThan(Date star);
}
