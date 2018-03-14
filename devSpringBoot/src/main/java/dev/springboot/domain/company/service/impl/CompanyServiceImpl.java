package dev.springboot.domain.company.service.impl;

import dev.springboot.domain.company.projection.CompanyProjection;
import dev.springboot.domain.company.repository.CompanyRepository;
import dev.springboot.domain.company.service.CompanyService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    private CompanyRepository companyRepository;

	@Override
	public List<CompanyProjection> selectAll() {
		return companyRepository.findAllProjectedBy();
	}

}