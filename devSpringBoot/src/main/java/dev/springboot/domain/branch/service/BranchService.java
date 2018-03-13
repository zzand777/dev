package dev.springboot.domain.branch.service;

import dev.springboot.domain.branch.projection.BranchProejction;
import java.util.List;

public interface BranchService{
    public List<BranchProejction> selectAll();
}