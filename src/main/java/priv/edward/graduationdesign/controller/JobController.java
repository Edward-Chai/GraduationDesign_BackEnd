package priv.edward.graduationdesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import priv.edward.graduationdesign.model.Job;
import priv.edward.graduationdesign.service.JobService;
import priv.edward.graduationdesign.util.Message;
import javax.annotation.Resource;

@Controller
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping("/addJob")
    @ResponseBody
    public Message addJob(Job job){
        return jobService.addJob(job);
    }
}
