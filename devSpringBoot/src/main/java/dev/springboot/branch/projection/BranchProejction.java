package dev.springboot.branch.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import dev.springboot.branch.Branch;

@Projection(name="branchValue", types=Branch.class)
public interface BranchProejction{

    @Value("#{target.branchID.getCompCd()}")
    public String getCompCd();
    
    @Value("#{target.branchID.getBrchCd()}")
    public String getBrchCd();

    public String getBrchNm();
    public String getBrchOwner();
    public String getBrchTel();
}