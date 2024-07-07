package com.perso.ClientJDR.controllers;


import com.perso.ClientJDR.entities.Job;
import com.perso.ClientJDR.services.JobService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path="/jobs")
public class JobController {

    private final JobService jobService;

    @GetMapping
    public List<Job> findall() {return jobService.findall();}

    @PostMapping
    public Job save(Job newJob) {
        newJob.setId(null);
        return jobService.save(newJob);
    }

    @PutMapping
    public Job save(Job updateJob, String id){
        updateJob.setId(UUID.fromString(id));
        return jobService.save(updateJob);
    }

    @DeleteMapping
    public void delete(String id) {jobService.delete(UUID.fromString(id));}
}
