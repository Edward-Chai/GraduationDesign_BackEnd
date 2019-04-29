package priv.edward.graduationdesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import priv.edward.graduationdesign.model.Job;
import priv.edward.graduationdesign.service.JobService;
import priv.edward.graduationdesign.util.Message;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping("/addJob")
    @ResponseBody
    public Message addJob(Job job){
//        System.out.println("job:"+job.getJobname()+"----"+job.getSpecificity()+"---end001");
        return jobService.addJob(job);
    }

    @RequestMapping("/queryOne")
    @ResponseBody
    public Message queryOne(int jobid){
        return jobService.queryJob(jobid);
    }

    @RequestMapping("/queryAll")
    @ResponseBody
    public Message queryAll(){
        return jobService.queryAllJobs();
    }

    @RequestMapping("/remove")
    @ResponseBody
    public Message remove(int jobid){
        return jobService.removeJob(jobid);
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Message edit(Job job){
        return jobService.editJob(job);
    }
}
