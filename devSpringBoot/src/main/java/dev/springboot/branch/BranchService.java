package dev.springboot.branch;

import dev.springboot.branch.projection.BranchProejction;
import java.util.List;

public interface BranchService{
    public List<BranchProejction> selectAll();
}