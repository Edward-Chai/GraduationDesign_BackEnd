package priv.edward.graduationdesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import priv.edward.graduationdesign.model.StaffState;
import priv.edward.graduationdesign.service.StaffStateService;
import priv.edward.graduationdesign.util.Message;

@RestController
@RequestMapping("/staffState")
@CrossOrigin(origins = "*")
public class StaffStateController {

    @Autowired
    private StaffStateService staffStateService;

    @RequestMapping("/add")
    @ResponseBody
    public Message addStaffState(StaffState staffState){
        return staffStateService.addStaffState(staffState);
    }

    @RequestMapping("/remove")
    @ResponseBody
    public Message removeStaffstate(int ssid){
        return staffStateService.removeStaffState(ssid);
    }

    @RequestMapping("/queryAll")
    @ResponseBody
    public Message queryAll(){
        return staffStateService.queryAll();
    }
}
