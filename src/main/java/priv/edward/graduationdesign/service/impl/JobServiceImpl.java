package priv.edward.graduationdesign.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import priv.edward.graduationdesign.dao.JobMapper;
import priv.edward.graduationdesign.model.Job;
import priv.edward.graduationdesign.service.JobService;
import priv.edward.graduationdesign.util.Message;

@Service
@Transactional
public class JobServiceImpl implements JobService {

    @Autowired
    private JobMapper jobMapper;

    @Override
    public Message addJob(Job job) {
        int count = jobMapper.insert(job);
        if (count >0){
            return Message.success();
        }else {
            return Message.fail();
        }
    }

    @Override
    public boolean removeJob() {
        return false;
    }

    @Override
    public boolean editJob() {
        return false;
    }
}
