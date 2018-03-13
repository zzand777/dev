package dev.springboot.branch;

import dev.springboot.branch.projection.BranchProejction;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path="branch", collectionResourceRel="branchResult", excerptProjection=BranchProejction.class)
@RepositoryRestResource(exported=false)
public interface BranchRepository extends CrudRepository<Branch, BranchID>{

    // /branch/search/findByBrchNm?brchNm=
    public List<Branch> findByBrchNm(@Param("brchNm") String brchNm);


    public List<BranchProejction> findAllProjectedBy();

}