package dev.springboot.domain.company.entity;

import dev.springboot.domain.branch.entity.Branch;
import dev.springboot.domain.company.entity.id.CompanyID;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="TCOMP01")
@Data
public class Company{

    @EmbeddedId
    private CompanyID companyID;

    @Column(name="COMP_NM")
    private String compNm;

    @OneToMany(fetch=FetchType.EAGER)
    @JoinColumn(name="COMP_CD", referencedColumnName="COMP_CD")
    private List<Branch> branch;

}