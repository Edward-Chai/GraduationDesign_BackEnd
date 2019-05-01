package priv.edward.graduationdesign.service;

import org.springframework.stereotype.Service;
import priv.edward.graduationdesign.model.StaffState;
import priv.edward.graduationdesign.util.Message;

@Service
public interface StaffStateService {

    Message addStaffState(StaffState staffState);

    Message removeStaffState(int key);

    Message queryAll();
}
