package com.microservices.licensing.controller;

import com.microservices.licensing.database.entity.License;
import com.microservices.licensing.services.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {
    @Autowired
    private LicenseService licenseService;

    @GetMapping(value = "/{licenseId}")
    public License getLicenses(@PathVariable("organizationId") String organizationId,
                               @PathVariable("licenseId") String licenseId) {

        return licenseService.getLicense(organizationId, licenseId);
    }

    @PutMapping(value = "{licenseId}")
    public String updateLicenses(@PathVariable("licenseId") String licenseId) {
        return String.format("This is the put: %s", licenseId);
    }

    @PostMapping(value = "{licenseId}")
    public String saveLicenses(@PathVariable("licenseId") String licenseId) {
        return String.format("This is the post: %s", licenseId);
    }

    @DeleteMapping(value = "{licenseId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteLicenses(@PathVariable("licenseId") String licenseId) {
        return String.format("This is the Delete: %s", licenseId);
    }
}
