package dev.springboot.branch.repository;

import dev.springboot.branch.entity.id.BranchID;
import dev.springboot.branch.entity.Branch;
import dev.springboot.branch.projection.BranchProejction;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path="branch", collectionResourceRel="branchResult", excerptProjection=BranchProejction.class)
@RepositoryRestResource(exported=false)
public interface BranchRepository extends JpaRepository<Branch, BranchID>{

    // /branch/search/findByBrchNm?brchNm=
    public List<Branch> findByBrchNm(@Param("brchNm") String brchNm);

    public List<BranchProejction> findAllProjectedBy();

}