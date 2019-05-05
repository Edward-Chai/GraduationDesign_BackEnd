package priv.edward.graduationdesign.service;

import org.springframework.stereotype.Service;
import priv.edward.graduationdesign.model.Staff;
import priv.edward.graduationdesign.util.Message;

@Service
public interface StaffService {

    Message addStaff(Staff staff);

    Message removeStaff(int key);

    Message editStaff(Staff staff);

    Message queryOneStaff(int key);

    Message queryAllStaff();

    Message querySingleStaffInfo(int key);

    Message queryAllStaffWithJobInfo();
}
