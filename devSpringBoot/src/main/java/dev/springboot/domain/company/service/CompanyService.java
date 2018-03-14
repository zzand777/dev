package dev.springboot.domain.company.service;

import dev.springboot.domain.company.projection.CompanyProjection;
import java.util.List;

public interface CompanyService{
    public List<CompanyProjection> selectAll();
}