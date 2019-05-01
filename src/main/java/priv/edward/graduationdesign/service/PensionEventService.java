package priv.edward.graduationdesign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import priv.edward.graduationdesign.model.PensionEvent;
import priv.edward.graduationdesign.util.Message;

@Service
public interface PensionEventService {

    Message addPensionEvent(PensionEvent pensionEvent);

    Message removePensionEvent(int key);

    Message queryAllPensionEvent();
}
