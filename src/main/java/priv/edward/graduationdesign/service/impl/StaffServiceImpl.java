package priv.edward.graduationdesign.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import priv.edward.graduationdesign.dao.StaffMapper;
import priv.edward.graduationdesign.model.Staff;
import priv.edward.graduationdesign.service.StaffService;
import priv.edward.graduationdesign.util.Message;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;

    @Override
    public Message addStaff(Staff staff) {
        int count = staffMapper.insertSelective(staff);
        if (count > 0){
            return Message.success();
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message removeStaff(int key) {
        int count = staffMapper.deleteByPrimaryKey(key);
        if (count > 0){
            return Message.success();
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message editStaff(Staff staff) {
        int count = staffMapper.updateByPrimaryKey(staff);
        if (count > 0){
            return Message.success();
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message queryOneStaff(int key) {
        Staff staff = staffMapper.selectByPrimaryKey(key);
        if (staff.getStaffid() != 0){
            return Message.success().add("staff",staff);
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message queryAllStaff() {
        List<Staff> staffList = staffMapper.selectAll();
        if (staffList.size() != 0){
            return Message.success().add("staffList",staffList);
        }else {
            return Message.fail();
        }
    }
}
