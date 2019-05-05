package priv.edward.graduationdesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import priv.edward.graduationdesign.model.Staff;
import priv.edward.graduationdesign.service.StaffService;
import priv.edward.graduationdesign.util.Message;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/staff")
@CrossOrigin(origins = "*")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @RequestMapping("/add")
    @ResponseBody
    public Message addStaff(Staff staff){
        System.out.println("staffGender:"+staff.getStaffgender()+"---------------end");
        return staffService.addStaff(staff);
    }

    @RequestMapping("/remove")
    @ResponseBody
    public Message removeStaff(int staffid){
        return staffService.removeStaff(staffid);
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Message editStaff(Staff staff){
        return staffService.editStaff(staff);
    }

    @RequestMapping("/queryOne")
    @ResponseBody
    public Message queryOneStaff(int staffid){
        return staffService.queryOneStaff(staffid);
    }

    @RequestMapping("/queryAll")
    @ResponseBody
    public Message queryAllStaff(){
        return staffService.queryAllStaff();
    }

    @RequestMapping("/queryAllWithInfo")
    @ResponseBody
    public Message queryAllStaffInfo(){
        return staffService.queryAllStaffWithJobInfo();
    }

    @RequestMapping("/querySingleStaffInfo")
    @ResponseBody
    public Message querySingleStaffInfo(int staffid) {
        return staffService.querySingleStaffInfo(staffid);
    }

    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期 注意这里的转化要和传进来的字符串的格式一直 如2015-9-9 就应该为yyyy-MM-dd
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }
}
