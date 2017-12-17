package com.bokecc.boot.mapper;

import com.bokecc.boot.dto.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by lijm on 2017/12/16.
 */
@Repository
public interface RoleMapper {
    Role findByRoleName(@Param("roleName") String roleName);

    Role findByStudentId(@Param("studentId") long studentId);
}
