package dev.springboot.company;

import java.util.Optional;

public interface CompanyService{
    public Iterable<Company> selectAll();
    public Optional<Company> select(String compCd);
    public Company save(Company company);
    public boolean delete(String compCd);
}