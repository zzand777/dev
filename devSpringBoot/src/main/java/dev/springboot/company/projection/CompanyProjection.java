package dev.springboot.company.projection;

import dev.springboot.company.Company;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="companyID", types={Company.class})
public interface CompanyProjection{
    
    /*
    public CompanyID getCompanyID();
    */
    
    @Value("#{target.companyID.getCompCd()}")
    public String getCompCd();

    public String getCompNm();
    
}
