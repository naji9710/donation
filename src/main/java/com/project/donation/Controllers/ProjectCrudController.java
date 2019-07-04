package com.project.donation.Controllers;

import com.project.donation.Models.Project;
import com.project.donation.Services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectCrudController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/projects")
    public List<Project> projects(){
      return null;
    }

    @PostMapping("/newProject")
    public Boolean createProject(){
        return null;
    }

    @GetMapping("/updateProject")
    public Boolean updateProject(){
        return null;
    }

    @GetMapping("/deleteProect/{id}")
    public Boolean deleteProject(){
        return null;
    }
}
