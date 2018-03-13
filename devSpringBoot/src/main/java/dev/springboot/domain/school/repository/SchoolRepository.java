package dev.springboot.domain.school.repository;

import dev.springboot.domain.school.entity.School;
import dev.springboot.domain.school.entity.id.SchoolID;
import dev.springboot.domain.school.projection.SchoolProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="school", collectionResourceRel="schoolResult", excerptProjection=SchoolProjection.class)
public interface SchoolRepository extends JpaRepository<School, SchoolID>{

}