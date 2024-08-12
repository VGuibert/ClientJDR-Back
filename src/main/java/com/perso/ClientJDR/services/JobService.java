package com.perso.ClientJDR.services;

import com.perso.ClientJDR.entities.Job;
import com.perso.ClientJDR.repositories.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class JobService {

    private final JobRepository jobRepository;

    public List<Job> findall() { return jobRepository.findAll();}
    public Job findById(final UUID id) { return jobRepository.findById(id).orElseThrow();}
    public Job save (Job newJob) { return jobRepository.save(newJob);}
    public void delete (UUID id) {  jobRepository.deleteById(id);}
}
