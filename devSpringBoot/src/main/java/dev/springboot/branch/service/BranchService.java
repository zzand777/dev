package dev.springboot.branch.service;

import dev.springboot.branch.projection.BranchProejction;
import java.util.List;

public interface BranchService{
    public List<BranchProejction> selectAll();
}