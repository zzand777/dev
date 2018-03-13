package dev.springboot.domain.branch.entity.id;

import lombok.Data;
import dev.springboot.domain.company.entity.id.CompanyID;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class BranchID implements Serializable{
    
    private static final long serialVersionUID = 3056154405781194607L;

    /*
    @Column(name="COMP_CD")
    private String compCd;
    */

    private CompanyID companyID;

    @Column(name="BRCH_CD")
    private String brchCd;

}