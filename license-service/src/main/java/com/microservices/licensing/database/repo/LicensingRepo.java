package com.microservices.licensing.database.repo;

import com.microservices.licensing.database.entity.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicensingRepo extends JpaRepository<License, String> {
    List<License> findByOrganizationId(String licenseId);

    License findByOrganizationIdAndLicenseId(String organizationId, String licenseId);
}
