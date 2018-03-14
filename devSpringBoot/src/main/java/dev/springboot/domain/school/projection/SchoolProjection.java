package dev.springboot.domain.school.projection;

import dev.springboot.domain.school.entity.School;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="schoolAll", types={School.class})
public interface SchoolProjection{

    @Value("#{target.getSchoolID().getBranchID().getCompanyID().getCompCd()}")
    String getCompCd();

    @Value("#{target.getSchoolID().getBranchID().getBrchCd()}")
    String getBrchCd();

    @Value("#{target.getSchoolID().getSchlCd()}")
    String getSchlCd();

    String getSchlnm();
    String getSchlPstl();
    String getSchlAdr1();
    String getSchlAdr2();

    /*
    @Value("#{target.schlAdr1} #{target.schlAdr2}")
    String getSchlFullAdr();
    */

    String getSchlOwner();
    String getSchlTel();
    String getSchlMbi();
}