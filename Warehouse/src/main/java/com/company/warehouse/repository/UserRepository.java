package com.company.warehouse.repository;

import com.company.warehouse.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;
@RepositoryRestResource(path = "user",collectionResourceRel = "list")
public interface UserRepository extends JpaRepository<User, UUID> {
}
