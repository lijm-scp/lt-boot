package com.bokecc.boot.dao;

import com.bokecc.boot.dto.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lijm on 2017/12/3.
 */
@Repository
public interface DeparmentRepository extends JpaRepository<Department,Long> {
}
