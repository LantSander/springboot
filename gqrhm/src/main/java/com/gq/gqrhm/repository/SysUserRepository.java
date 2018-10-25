package com.gq.gqrhm.repository;

import com.gq.gqrhm.pojo.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser,Integer> {
    SysUser findByUsername(String username);
}
