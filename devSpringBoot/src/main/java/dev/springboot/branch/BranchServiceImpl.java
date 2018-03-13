package dev.springboot.branch;

import dev.springboot.branch.projection.BranchProejction;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService{ 

	@Autowired
    private BranchRepository branchRepository;

	@Override
	public List<BranchProejction> selectAll() {
		return branchRepository.findAllProjectedBy();
	}

}