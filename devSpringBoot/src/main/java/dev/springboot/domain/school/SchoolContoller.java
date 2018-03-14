package dev.springboot.domain.school;

import dev.springboot.domain.school.projection.SchoolProjection;
import dev.springboot.domain.school.service.SchoolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="school", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SchoolContoller{

    @Autowired
    private SchoolService schoolService;

    @GetMapping
    public List<SchoolProjection> schoolAll(){
        return schoolService.selectAll();
    }

}