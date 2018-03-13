package dev.springboot.company;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Builder;
import lombok.Data;

@Embeddable
@Data
public class CompanyID implements Serializable{

    private static final long serialVersionUID = 9180739068191713553L;
    
    @Column(name="COMP_CD")
    private String compCd;

    public CompanyID(){}

    @Builder
    public CompanyID(String compCd){
        this.compCd = compCd;
    }

    public String toString() {
		return String.format("%s", compCd);
	}

}