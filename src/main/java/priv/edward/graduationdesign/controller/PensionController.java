package priv.edward.graduationdesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import priv.edward.graduationdesign.model.Pension;
import priv.edward.graduationdesign.service.PensionService;
import priv.edward.graduationdesign.util.Message;

@RestController
@RequestMapping("/pension")
@CrossOrigin(origins = "*")
public class PensionController {

    @Autowired
    private PensionService pensionService;

    @RequestMapping("/add")
    @ResponseBody
    public Message addPension(Pension pension){
        return pensionService.addPension(pension);
    }

    @RequestMapping("/queryPensionStaffInfo")
    @ResponseBody
    public Message queryPensionStaffInfo(){
        return pensionService.queryPensionStaffInfo();
    }

    @RequestMapping("/querySinglePensionStaffInfo")
    @ResponseBody
    public Message querySinglePensionStaffInfo(int pensionid){
        return pensionService.querySinglePensionStaffInfo(pensionid);
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Message editPension(Pension pension){
        return pensionService.editPension(pension);
    }

    @RequestMapping("/remove")
    @ResponseBody
    public Message removePension(int pensionid){
        return pensionService.removePension(pensionid);
    }
}
