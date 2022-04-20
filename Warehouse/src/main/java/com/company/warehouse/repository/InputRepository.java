package com.company.warehouse.repository;

import com.company.warehouse.entity.Input;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;
@RepositoryRestResource(path = "input",collectionResourceRel = "list")
public interface InputRepository extends JpaRepository<Input, UUID> {
}
