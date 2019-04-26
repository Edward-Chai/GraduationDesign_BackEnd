package priv.edward.graduationdesign.service;

import org.springframework.stereotype.Service;
import priv.edward.graduationdesign.model.Job;
import priv.edward.graduationdesign.util.Message;

@Service
public interface JobService {

    Message addJob(Job job);

    boolean removeJob();

    boolean editJob();
}
