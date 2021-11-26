package com.microservices.organization.repository;

import com.microservices.organization.model.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, String> {
    Organization findByOrganizationId(String organizationId);
}
