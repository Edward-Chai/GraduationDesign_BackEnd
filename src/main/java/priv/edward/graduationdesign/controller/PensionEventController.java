package priv.edward.graduationdesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import priv.edward.graduationdesign.model.PensionEvent;
import priv.edward.graduationdesign.service.PensionEventService;
import priv.edward.graduationdesign.util.Message;

@RestController
@RequestMapping("/pensionEvent")
@CrossOrigin(origins = "*")
public class PensionEventController {

    @Autowired
    private PensionEventService pensionEventService;

    @RequestMapping("/add")
    @ResponseBody
    public Message addPensionEvent(PensionEvent pensionEvent){
        return pensionEventService.addPensionEvent(pensionEvent);
    }

    @RequestMapping("/remove")
    @ResponseBody
    public Message removePensionEvent(int peid){
        return pensionEventService.removePensionEvent(peid);
    }

    @RequestMapping("/queryAll")
    @ResponseBody
    public Message queryAllPensionEvent(){
        return pensionEventService.queryAllPensionEvent();
    }
}
