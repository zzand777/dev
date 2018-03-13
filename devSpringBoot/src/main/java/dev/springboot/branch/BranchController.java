package dev.springboot.branch;

import dev.springboot.branch.projection.BranchProejction;
import dev.springboot.branch.service.BranchService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="branch", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
public class BranchController{

    @Autowired
    private BranchService branchService;

    @GetMapping
    public List<BranchProejction> branchAll(){
        return branchService.selectAll();
    }

}