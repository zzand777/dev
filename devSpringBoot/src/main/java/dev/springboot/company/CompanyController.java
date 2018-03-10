package dev.springboot.company;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController{

    @Autowired
    CompanyService companyService;

    @GetMapping(value="/company", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Company> selectCompanyAll(){
        return companyService.selectAll();
    }

    @GetMapping(value="/company/{compCd}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Optional<Company> selectCompany(@PathVariable String compCd){
        return companyService.select(compCd);
    }

    @PostMapping(value="/company", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Company saveCompany(@RequestBody Company company){
        return companyService.save(company);
    }

    @DeleteMapping(value="/company/{compCd}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean deleteCompany(@PathVariable String compCd){
        return companyService.delete(compCd);
    }

}