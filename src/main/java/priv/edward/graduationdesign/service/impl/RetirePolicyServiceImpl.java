package priv.edward.graduationdesign.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import priv.edward.graduationdesign.dao.RetirePolicyMapper;
import priv.edward.graduationdesign.model.RetirePolicy;
import priv.edward.graduationdesign.service.RetirePolicyService;
import priv.edward.graduationdesign.util.Message;

import java.util.List;

@Service
@Transactional
public class RetirePolicyServiceImpl implements RetirePolicyService {

    @Autowired
    private RetirePolicyMapper retirePolicyMapper;

    @Override
    public Message addRetirePolicy(RetirePolicy retirePolicy) {
        int count = retirePolicyMapper.insertSelective(retirePolicy);
        if (count > 0){
            return Message.success();
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message editRetirePolicy(RetirePolicy retirePolicy) {
        int count = retirePolicyMapper.updateByPrimaryKey(retirePolicy);
        if (count > 0){
            return Message.success();
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message removeRetirePolicy(int key) {
        int count = retirePolicyMapper.deleteByPrimaryKey(key);
        if (count > 0){
            return Message.success();
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message queryRetirePolicy(int key) {
        RetirePolicy retirePolicy = retirePolicyMapper.selectByPrimaryKey(key);
        if (retirePolicy.getRpid() > 0){
            return Message.success().add("retirePolicy",retirePolicy);
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message queryAllRetirePolicy() {
        List<RetirePolicy> retirePolicyList = retirePolicyMapper.selectAll();
        if (retirePolicyList.size() > 0){
            return Message.success().add("retirePolicyList",retirePolicyList);
        }else {
            return Message.fail();
        }
    }
}
