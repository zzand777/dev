package dev.springboot.domain.branch.projection;

import dev.springboot.domain.branch.entity.Branch;
import dev.springboot.domain.school.projection.SchoolProjection;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import java.util.List;

@Projection(name="branchAll", types={Branch.class})
public interface BranchProjection{

    @Value("#{target.branchID.companyID.compCd}")
    String getCompCd();
    
    @Value("#{target.branchID.brchCd}")
    String getBrchCd();

    String getBrchNm();
    String getBrchOwner();
    String getBrchTel();
    List<SchoolProjection> getSchool();
}