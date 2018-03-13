package dev.springboot.company;

import dev.springboot.company.projection.CompanyProjection;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/company", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CompanyController{

    @Autowired
    CompanyService companyService;

    @GetMapping
    public Iterable<CompanyProjection> selectCompanyAll(){
        return companyService.selectAll();
    }

    @GetMapping(value="/{compCd}")
    public Optional<Company> selectCompany(@PathVariable String compCd){
        return companyService.select(compCd);
    }

    @PostMapping
    public Company saveCompany(@RequestBody Company company){
        return companyService.save(company);
    }

    @DeleteMapping(value="/{compCd}")
    public boolean deleteCompany(@PathVariable String compCd){
        return companyService.delete(compCd);
    }

}