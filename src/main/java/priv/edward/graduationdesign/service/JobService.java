package priv.edward.graduationdesign.service;

import org.springframework.stereotype.Service;
import priv.edward.graduationdesign.model.Job;
import priv.edward.graduationdesign.util.Message;

@Service
public interface JobService {

    Message addJob(Job job);

    Message queryAllJobs();

    Message queryJob(int key);

    Message removeJob(int key);

    Message editJob(Job job);
}
