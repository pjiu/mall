package com.studymall.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.studymall.entity.AdminUser;

public interface AdminUserDao extends JpaRepository<AdminUser, Integer> {
    AdminUser findByUsernameAndPassword(String username, String pwd);
}
