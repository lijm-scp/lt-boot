package com.bokecc.boot.mapper;

import com.bokecc.boot.dto.Role;
import com.bokecc.boot.dto.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lijm on 2017/12/16.
 */
@Repository
public interface StudentMapper {
    Student findStudentByName(@Param("name") String name);
}
