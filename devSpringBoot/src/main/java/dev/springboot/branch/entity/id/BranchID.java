package dev.springboot.branch.entity.id;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class BranchID implements Serializable{
    
    private static final long serialVersionUID = 3056154405781194607L;

    @Column(name="COMP_CD")
    private String compCd;

    @Column(name="BRCH_CD")
    private String brchCd;

    public String toString() {
		return String.format("%s/%s", compCd, brchCd);
	}

}