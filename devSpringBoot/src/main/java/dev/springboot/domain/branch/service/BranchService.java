package dev.springboot.domain.branch.service;

import dev.springboot.domain.branch.projection.BranchProjection;
import java.util.List;

public interface BranchService{
    public List<BranchProjection> selectAll();
}