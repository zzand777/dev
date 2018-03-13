package dev.springboot.company.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import dev.springboot.company.entity.Company;
import dev.springboot.company.entity.id.CompanyID;
import dev.springboot.company.projection.CompanyProjection;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource(path="company", collectionResourceRel="companyResult", excerptProjection=CompanyProjection.class)
public interface CompanyRepository extends JpaRepository<Company, CompanyID>{
    public Iterable<CompanyProjection> findAllProjectedBy();
}