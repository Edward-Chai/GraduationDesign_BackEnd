package priv.edward.graduationdesign.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import priv.edward.graduationdesign.dao.StaffStateMapper;
import priv.edward.graduationdesign.model.StaffState;
import priv.edward.graduationdesign.service.StaffStateService;
import priv.edward.graduationdesign.util.Message;

import java.util.List;

@Service
@Transactional
public class StaffStateServiceImpl implements StaffStateService {

    @Autowired
    private StaffStateMapper staffStateMapper;

    @Override
    public Message addStaffState(StaffState staffState) {
        int count = staffStateMapper.insertSelective(staffState);
        if (count > 0){
            return Message.success();
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message removeStaffState(int key) {
        int count = staffStateMapper.deleteByPrimaryKey(key);
        if (count > 0){
            return Message.success();
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message queryAll() {
        List<StaffState> staffStates = staffStateMapper.selectAll();
        if (staffStates.size()>0){
            return Message.success().add("staffStates",staffStates);
        }else {
            return Message.fail();
        }
    }
}
