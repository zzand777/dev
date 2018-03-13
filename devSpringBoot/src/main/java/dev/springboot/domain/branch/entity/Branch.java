package dev.springboot.domain.branch.entity;

import dev.springboot.domain.branch.entity.id.BranchID;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name="TBRCH01")
@Data
public class Branch{

    @EmbeddedId
	private BranchID branchID;

    @Column(name="BRCH_NM")
    private String brchNm;

    @Column(name="BRCH_OWNER")
    private String brchOwner;

    @Column(name="BRCH_TEL")
    private String brchTel;

}