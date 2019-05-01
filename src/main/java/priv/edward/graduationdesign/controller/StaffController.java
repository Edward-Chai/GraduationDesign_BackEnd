package priv.edward.graduationdesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import priv.edward.graduationdesign.model.Staff;
import priv.edward.graduationdesign.service.StaffService;
import priv.edward.graduationdesign.util.Message;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @RequestMapping("/add")
    @ResponseBody
    public Message addStaff(Staff staff){
        return staffService.addStaff(staff);
    }

    @RequestMapping("/remove")
    @ResponseBody
    public Message removeStaff(int key){
        return staffService.removeStaff(key);
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Message editStaff(Staff staff){
        return staffService.editStaff(staff);
    }

    @RequestMapping("/queryOne")
    @ResponseBody
    public Message queryOneStaff(int key){
        return staffService.queryOneStaff(key);
    }

    @RequestMapping("/queryAll")
    @ResponseBody
    public Message queryAllStaff(){
        return staffService.queryAllStaff();
    }
}
