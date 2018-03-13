package dev.springboot.domain.branch.repository;

import dev.springboot.domain.branch.entity.id.BranchID;
import dev.springboot.domain.branch.entity.Branch;
import dev.springboot.domain.branch.projection.BranchProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

//@RepositoryRestResource(exported=false)
@RepositoryRestResource(path="branch", collectionResourceRel="branchResult", excerptProjection=BranchProjection.class)
public interface BranchRepository extends JpaRepository<Branch, BranchID>{

    // /branch/search/findByBrchNm?brchNm=
    public List<Branch> findByBrchNm(@Param("brchNm") String brchNm);

    public List<BranchProjection> findAllProjectedBy();

}