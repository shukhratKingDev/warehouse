package com.company.warehouse.repository;

import com.company.warehouse.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;
@RepositoryRestResource(path = "client",collectionResourceRel = "list")
public interface ClientRepository extends JpaRepository<Client, UUID> {
}
