package com.company.warehouse.repository;

import com.company.warehouse.entity.InputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;
@RepositoryRestResource(path = "inputRepository",collectionResourceRel = "list")
public interface InputProductRepository extends JpaRepository<InputProduct, UUID> {
}
