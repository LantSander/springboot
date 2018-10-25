package com.gq.gqrhm.repository;

import com.gq.gqrhm.pojo.SysRole;
import com.gq.gqrhm.pojo.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SysUserRepositoryTest {
    @Autowired
    SysUserRepository repository;
    @Autowired
    SysRoleRepository roleRepository;

    @Test
    public void testSave() {

        SysUser user = repository.findByUsername("sang");
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        // 加密
        String encodedPassword = passwordEncoder.encode(user.getPassword().trim());
        user.setPassword(encodedPassword);

        repository.save(user);

//        SysUser sysUser = new SysUser();
//        sysUser.setId(4);
//        sysUser.setUsername("aa");
//        sysUser.setPassword("123");
//        SysRole sysRole = roleRepository.findById(1).get();
//        List<SysRole> list = new ArrayList<>();
//        list.add(sysRole);
//        sysUser.setRoleList(list);
//        repository.save(sysUser);
////        SysUser sysUser= repository.findById(1).get();
//        System.out.println(sysUser);
    }

    @Test
    @Transactional
    public void  testFind(){
        SysUser sysUser= repository.findById(4).get();
        System.out.println(sysUser.getRoleList());
        System.out.println(sysUser);
    }
}