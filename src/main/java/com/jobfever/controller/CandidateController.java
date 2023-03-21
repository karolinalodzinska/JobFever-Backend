package com.jobfever.controller;

import com.jobfever.service.CandidateService;
import com.jobfever.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/candidates")
@RestController
public class CandidateController {

    private JobService jobService;
//    private CandidateService candidateService;
//
//    @Autowired
//    public CandidateController(JobService jobService, CandidateService candidateService){
//        this.jobService = jobService;
//        this.candidateService = candidateService;
//    }
//
//    @GetMapping("/{candidate_id}")
//    public String getCandidate(@PathVariable("candidate_id") int candidateId){
//        return candidateService.getCandidateById(candidateId);
//    }
//
//    @PutMapping("/{candidate_id}/edit")
//    public String editProfile(@PathVariable("candidate_id") int candidateId){
//        return candidateService.editProfileById(candidateId);
//    }
//
//    @GetMapping("/{candidate_id}/my-jobs")
//    public String getJobsOffersAppliedFor(@PathVariable("candidate_id") int candidateId){
//        return candidateService.getJobOffersAppliedForByCandidateId(candidateId);
//    }
//
//    @GetMapping("/{candidate_id}/favourites")
//    public String getFavouritesJobs(@PathVariable("candidate_id") int candidateId){
//        return candidateService.getFavouritesJobsByCandidateId(candidateId);
//    }
//
//    @DeleteMapping("/{candidate_id}")
//    public boolean deleteCandidateById(@PathVariable("candidate_id") int candidateId){
//        return candidateService.deleteCandidateById(candidateId);
//    }
}