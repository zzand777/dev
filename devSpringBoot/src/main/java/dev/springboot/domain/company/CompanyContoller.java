package dev.springboot.domain.company;

import dev.springboot.domain.company.projection.CompanyProjection;
import dev.springboot.domain.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value="company", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CompanyContoller{
    
    @Autowired
    private CompanyService companyService;

    @GetMapping
    public List<CompanyProjection> companyAll(){
        return companyService.selectAll();
    }
}