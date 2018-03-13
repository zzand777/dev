package dev.springboot.company.projection;

import dev.springboot.company.Company;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="companyValue", types={Company.class})
public interface CompanyProjection{
    
    @Value("#{target.companyID.getCompCd()}")
    public String getCompCd();

    public String getCompNm();
    
}
