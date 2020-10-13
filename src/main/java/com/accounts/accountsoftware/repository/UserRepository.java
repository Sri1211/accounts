package com.accounts.accountsoftware.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.accounts.accountsoftware.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {
}
