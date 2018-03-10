package dev.springboot.company;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TCOMP01")
public class Company{

    @Id
    @Column(name="COMP_CD")
    String compCd;

    @Column(name="COMP_NM")
    String compNm;

    public Company(){}

    public Company(String compCd, String compNm){
        this.compCd = compCd;
        this.compNm = compNm;
    }

    /**
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * @param compCd the compCd to set
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * @return the compNm
     */
    public String getCompNm() {
        return compNm;
    }

    /**
     * @param compNm the compNm to set
     */
    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }
}