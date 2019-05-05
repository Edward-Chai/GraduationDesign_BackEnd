package priv.edward.graduationdesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import priv.edward.graduationdesign.model.RetirePolicy;
import priv.edward.graduationdesign.service.RetirePolicyService;
import priv.edward.graduationdesign.util.Message;

@RestController
@RequestMapping("/retirePolicy")
@CrossOrigin(origins = "*")
public class RetirePolicyController {

    @Autowired
    private RetirePolicyService retirePolicyService;

    @RequestMapping("/add")
    @ResponseBody
    public Message addRetirePolicy(RetirePolicy retirePolicy){
        System.out.println(retirePolicy.toString());
        return retirePolicyService.addRetirePolicy(retirePolicy);
    }

    @RequestMapping("/queryOne")
    @ResponseBody
    public Message queryRetirePolicy(int key){
        return retirePolicyService.queryRetirePolicy(key);
    }

    @RequestMapping("/queryAll")
    @ResponseBody
    public Message queryAllRetirePolicy(){
        return retirePolicyService.queryAllRetirePolicy();
    }

    @RequestMapping("/remove")
    @ResponseBody
    public Message removeRetirePolicy(int key){
        return retirePolicyService.removeRetirePolicy(key);
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Message editRetirePolicy(RetirePolicy retirePolicy){
        return retirePolicyService.editRetirePolicy(retirePolicy);
    }
}
