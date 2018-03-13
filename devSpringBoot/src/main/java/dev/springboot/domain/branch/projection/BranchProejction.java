package dev.springboot.domain.branch.projection;

import org.springframework.beans.factory.annotation.Value;

//@Projection(name="branchAll", types=Branch.class)
public interface BranchProejction{

    @Value("#{target.branchID.getCompCd()}")
    public String getCompCd();
    
    @Value("#{target.branchID.getBrchCd()}")
    public String getBrchCd();

    public String getBrchNm();
    public String getBrchOwner();
    public String getBrchTel();
}