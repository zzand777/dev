package dev.springboot.company;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import dev.springboot.company.projection.CompanyProjection;

import org.springframework.data.repository.CrudRepository;

@RepositoryRestResource(path="company", collectionResourceRel="companyResult", excerptProjection=CompanyProjection.class)
// public interface CompanyRepository extends JpaRepository<Company, CompanyID>{ CrudRepository 및 PagingAndSortingRepository를 포함
public interface CompanyRepository extends CrudRepository<Company, CompanyID>{ // 일반적인 CRUD
    public Iterable<CompanyProjection> findAllProjectedBy();
}