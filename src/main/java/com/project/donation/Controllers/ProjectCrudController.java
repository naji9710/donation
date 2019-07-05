package com.project.donation.Controllers;

import com.project.donation.Models.Project;
import com.project.donation.Services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectCrudController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/projects")
    public List<Project> projects(){
      return null;
    }

    @PostMapping("/createProject")
    public Boolean createProject(@RequestBody Project project){
        return null;
    }

    @PutMapping("/updateProject/{idProject}")
    public Boolean updateProject(@PathVariable("idProject") Long idProject, @RequestBody Project project){
        return null;
    }

    @DeleteMapping("/deleteProject/{idProject}")
    public Boolean deleteProject(@PathVariable("idProject") Long idProject){
        return null;
    }
}
