package com.company.warehouse.repository;

import com.company.warehouse.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;
@RepositoryRestResource(path = "attachment",collectionResourceRel ="list")
public interface AttachmentRepository  extends JpaRepository<Attachment, UUID> {

}
