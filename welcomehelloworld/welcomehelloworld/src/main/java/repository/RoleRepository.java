package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Models.Role;

public interface RoleRepository extends JpaRepository<Role , Long> {

}
