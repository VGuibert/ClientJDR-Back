package com.perso.ClientJDR.controllers;


import com.perso.ClientJDR.entities.Job;
import com.perso.ClientJDR.mapper.MapperService;
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
    private final MapperService mapperService;

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

    @PatchMapping("/{id}")
    public Job updatePartially(@PathVariable UUID id,@RequestBody Job updatePartillyJob){
        Job jobToUpdate = jobService.findById(id);
        mapperService.patcherMapSecured(jobToUpdate,updatePartillyJob);
        return jobService.save(updatePartillyJob);
    }

    @DeleteMapping
    public void delete(String id) {jobService.delete(UUID.fromString(id));}
}
