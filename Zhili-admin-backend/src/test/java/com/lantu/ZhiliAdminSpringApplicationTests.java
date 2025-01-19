package com.lantu;

import com.lantu.sys.entity.User;
import com.lantu.sys.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;
@ActiveProfiles("sandbox")
@SpringBootTest
class ZhiliAdminSpringApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void testMapper() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

}
