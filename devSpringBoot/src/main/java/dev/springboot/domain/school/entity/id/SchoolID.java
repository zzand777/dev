package dev.springboot.domain.school.entity.id;

import dev.springboot.domain.branch.entity.id.BranchID;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class SchoolID implements Serializable{

    private static final long serialVersionUID = -1794555488769975013L;

    /*
	@Column(name="COMP_CD")
    private String compCd;

    @Column(name="BRCH_CD")
    private String brchCd;
    */

    private BranchID branchID;

    @Column(name="SCHL_CD")
    private String schlCd;
    
}