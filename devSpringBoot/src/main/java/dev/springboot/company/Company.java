package dev.springboot.company;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Table(name="TCOMP01")
@Entity
@Data
public class Company{

    @EmbeddedId
    private CompanyID companyID;

    @Column(name="COMP_NM")
    private String compNm;

}