package dev.springboot.company;

import dev.springboot.company.projection.CompanyProjection;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
    CompanyRepository companyRepository;

	@Override
	public Iterable<CompanyProjection> selectAll() {
		return companyRepository.findAllProjectedBy();
	}

    @Override
	public Optional<Company> select(String compCd) {
		return companyRepository.findById(CompanyID.builder().compCd(compCd).build());
	}

	@Override
	public Company save(Company company) {
        return companyRepository.save(company);
	}

	@Override
	public boolean delete(String compCd) {

		CompanyID companyID = CompanyID.builder().compCd(compCd).build();

        if(companyRepository.existsById(companyID)){
            companyRepository.deleteById(companyID);
            return true;
        }else{
            return false;
        }
	}

}