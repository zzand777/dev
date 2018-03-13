package dev.springboot.company;

import dev.springboot.company.projection.CompanyProjection;
import java.util.Optional;

public interface CompanyService{
    public Iterable<CompanyProjection> selectAll();
    public Optional<Company> select(String compCd);
    public Company save(Company company);
    public boolean delete(String compCd);
}