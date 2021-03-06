package dev.springboot.domain.branch;

import dev.springboot.domain.branch.projection.BranchProjection;
import dev.springboot.domain.branch.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value="branch", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
public class BranchController{

    @Autowired
    private BranchService branchService;

    @GetMapping
    public List<BranchProjection> branchAll(){
        return branchService.selectAll();
    }

}