package com.company.warehouse.repository;

import com.company.warehouse.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse",collectionResourceRel = "list")
public interface WareHouseRepository extends JpaRepository<Warehouse,Integer> {
}
