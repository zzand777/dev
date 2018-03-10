package dev.springboot.company;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    CompanyRepository companyRepository;

	@Override
	public List<Company> selectAll() {
		return companyRepository.findAll();
	}

    @Override
	public Optional<Company> select(String compCd) {
		return companyRepository.findById(compCd);
	}

	@Override
	public Company save(Company company) {
        return companyRepository.save(company);
	}

	@Override
	public boolean delete(String compCd) {
        if(companyRepository.existsById(compCd)){
            companyRepository.deleteById(compCd);
            return true;
        }else{
            return false;
        }
	}

}