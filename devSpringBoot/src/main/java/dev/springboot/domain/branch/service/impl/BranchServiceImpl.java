package dev.springboot.domain.branch.service.impl;

import dev.springboot.domain.branch.repository.BranchRepository;
import dev.springboot.domain.branch.service.BranchService;
import dev.springboot.domain.branch.projection.BranchProjection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService{ 

	@Autowired
    private BranchRepository branchRepository;

	@Override
	public List<BranchProjection> selectAll() {
		return branchRepository.findAllProjectedBy();
	}

}