package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Models.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
       Users findByUsername(String userName);
}
