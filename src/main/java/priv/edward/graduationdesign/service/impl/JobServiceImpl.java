package priv.edward.graduationdesign.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import priv.edward.graduationdesign.dao.JobMapper;
import priv.edward.graduationdesign.model.Job;
import priv.edward.graduationdesign.service.JobService;
import priv.edward.graduationdesign.util.Message;

import java.util.List;

@Service
@Transactional
public class JobServiceImpl implements JobService {

    @Autowired
    private JobMapper jobMapper;

    @Override
    public Message addJob(Job job) {
//        System.out.println("job:"+job.getJobname()+"----"+job.getSpecificity()+"---end");
        int count = jobMapper.insertSelective(job);
        if (count >0){
            return Message.success();
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message queryAllJobs() {
        List<Job> jobList = jobMapper.selectAll();
        if (jobList.size()>0){
            return Message.success().add("jobList",jobList);
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message queryJob(int key) {
        Job job = jobMapper.selectByPrimaryKey(key);
        if (job.getJobid()!=0){
            return Message.success().add("job",job);
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message removeJob(int key) {
        int count = jobMapper.deleteByPrimaryKey(key);
        if (count > 0){
            return Message.success();
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message editJob(Job job) {
        int count = jobMapper.updateByPrimaryKey(job);
        if (count > 0){
            return Message.success();
        }else {
            return Message.fail();
        }
    }
}
