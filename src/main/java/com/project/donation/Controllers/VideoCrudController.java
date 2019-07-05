package com.project.donation.Controllers;

import com.project.donation.Models.Video;
import com.project.donation.Services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VideoCrudController {

    @Autowired
    VideoService videoService;

    @GetMapping("/videos")
    public List<Video> videos(){
        return null;
    }

    @PostMapping("/createVideo")
    public Boolean createVideo(@RequestBody Video video){
        return null;
    }

    @PutMapping("/updateVideo/{idVideo}")
    public Boolean updateVideo(@PathVariable("idVideo") Long idVideo, @RequestBody Video video){
        return null;
    }

    @DeleteMapping("/deleteVideo/{idVideo}")
    public Boolean deleteVideo(@PathVariable("idVideo") Long idVideo){
        return null;
    }
}

