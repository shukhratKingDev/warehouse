package com.company.warehouse.repository;

import com.company.warehouse.entity.Output;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;
@RepositoryRestResource(path = "output",collectionResourceRel = "list")
public interface OutputRepository extends JpaRepository<Output, UUID> {
}
