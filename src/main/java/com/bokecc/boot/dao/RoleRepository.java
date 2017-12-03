package com.bokecc.boot.dao;

import com.bokecc.boot.dto.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lijm on 2017/12/3.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{
}
