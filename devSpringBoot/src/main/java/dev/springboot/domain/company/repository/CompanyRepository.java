package dev.springboot.domain.company.repository;

import dev.springboot.domain.company.entity.Company;
import dev.springboot.domain.company.entity.id.CompanyID;
import dev.springboot.domain.company.projection.CompanyProjection;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource(path="company", collectionResourceRel="companyResult", excerptProjection=CompanyProjection.class)
public interface CompanyRepository extends JpaRepository<Company, CompanyID>{
    public Iterable<CompanyProjection> findAllProjectedBy();
}