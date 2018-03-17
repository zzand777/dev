package dev.springboot.domain.branch.entity;

import dev.springboot.domain.branch.entity.id.BranchID;
import dev.springboot.domain.school.entity.School;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
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

    @OneToMany(fetch=FetchType.EAGER)
    @JoinColumns({@JoinColumn(name="COMP_CD", referencedColumnName="COMP_CD"), @JoinColumn(name="BRCH_CD", referencedColumnName="BRCH_CD")})
    private List<School> school;

}