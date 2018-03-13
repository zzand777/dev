package dev.springboot.domain.company.projection;

import dev.springboot.domain.branch.projection.BranchProjection;
import dev.springboot.domain.company.entity.Company;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import java.util.List;

@Projection(name="companyAll", types={Company.class})
public interface CompanyProjection{
    
    @Value("#{target.companyID.getCompCd()}")
    public String getCompCd();

    public String getCompNm();

    public List<BranchProjection> getBranch();
    
}