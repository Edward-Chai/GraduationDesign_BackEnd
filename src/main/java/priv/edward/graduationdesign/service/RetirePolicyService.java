package priv.edward.graduationdesign.service;

import org.springframework.stereotype.Service;
import priv.edward.graduationdesign.model.RetirePolicy;
import priv.edward.graduationdesign.util.Message;

@Service
public interface RetirePolicyService {

    Message addRetirePolicy(RetirePolicy retirePolicy);

    Message editRetirePolicy(RetirePolicy retirePolicy);

    Message removeRetirePolicy(int key);

    Message queryRetirePolicy(int key);

    Message queryAllRetirePolicy();
}
