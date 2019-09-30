package com.petproject.messenger.repositories;



import com.petproject.messenger.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getUserByLogin(String login);
}
