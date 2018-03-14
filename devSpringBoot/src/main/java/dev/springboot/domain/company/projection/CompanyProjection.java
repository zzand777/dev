package dev.springboot.domain.company.projection;

import dev.springboot.domain.branch.projection.BranchProjection;
import dev.springboot.domain.company.entity.Company;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="companyAll", types={Company.class})
public interface CompanyProjection{
    
    @Value("#{target.getCompanyID().getCompCd()}")
    public String getCompCd();

    public String getCompNm();

    public List<BranchProjection> getBranch();
}