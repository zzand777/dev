package dev.springboot.domain.school.entity;

import dev.springboot.domain.school.entity.id.SchoolID;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="TSCHL01")
@Data
public class School{

    @EmbeddedId
    private SchoolID schoolID;

    @Column(name="SCHL_NM")
    private String schlnm;

    @Column(name="SCHL_PSTL")
    private String schlPstl;

    @Column(name="SCHL_ADR1")
    private String schlAdr1;

    @Column(name="SCHL_ADR2")
    private String schlAdr2;

    @Column(name="SCHL_OWNER")
    private String schlOwner;

    @Column(name="SCHL_TEL")
    private String schlTel;

    @Column(name="SCHL_MBI")
    private String schlMbi;

}