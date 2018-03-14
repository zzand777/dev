package dev.springboot.domain.school.service;

import dev.springboot.domain.school.projection.SchoolProjection;
import java.util.List;

public interface SchoolService{
    public List<SchoolProjection> selectAll();
}