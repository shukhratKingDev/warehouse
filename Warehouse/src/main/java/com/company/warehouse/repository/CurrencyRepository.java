package com.company.warehouse.repository;

import com.company.warehouse.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency",collectionResourceRel = "list")
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
}
