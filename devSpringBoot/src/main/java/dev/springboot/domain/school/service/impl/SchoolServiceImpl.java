package dev.springboot.domain.school.service.impl;

import dev.springboot.domain.school.projection.SchoolProjection;
import dev.springboot.domain.school.repository.SchoolRepository;
import dev.springboot.domain.school.service.SchoolService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService{

	@Autowired
    private SchoolRepository schoolRepository;

	@Override
	public List<SchoolProjection> selectAll() {
		return schoolRepository.findAllProjectedBy();
	}

}