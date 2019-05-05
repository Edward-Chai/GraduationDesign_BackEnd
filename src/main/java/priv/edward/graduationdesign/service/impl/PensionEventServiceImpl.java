package priv.edward.graduationdesign.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import priv.edward.graduationdesign.dao.PensionEventMapper;
import priv.edward.graduationdesign.model.PensionEvent;
import priv.edward.graduationdesign.service.PensionEventService;
import priv.edward.graduationdesign.util.Message;

import java.util.List;

@Service
@Transactional
public class PensionEventServiceImpl implements PensionEventService {

    @Autowired
    private PensionEventMapper pensionEventMapper;

    @Override
    public Message addPensionEvent(PensionEvent pensionEvent) {
        int count = pensionEventMapper.insertSelective(pensionEvent);
        if (count > 0){
            return Message.success();
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message removePensionEvent(int key) {
        int count = pensionEventMapper.deleteByPrimaryKey(key);
        if (count > 0){
            return Message.success();
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message queryAllPensionEvent() {
       List<PensionEvent> pensionEvents = pensionEventMapper.selectAll();
        if (pensionEvents.size() > 0){
            return Message.success().add("pensionEvents",pensionEvents);
        }else {
            return Message.fail();
        }
    }
}
