package dev.springboot.company;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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

}