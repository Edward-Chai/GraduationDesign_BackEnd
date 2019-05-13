package priv.edward.graduationdesign.service;

import org.springframework.stereotype.Service;
import priv.edward.graduationdesign.model.Pension;
import priv.edward.graduationdesign.util.Message;

@Service
public interface PensionService {

    Message addPension(Pension pension);

    Message queryAllPensions();

    Message queryOnePension();

    Message queryAllPensionsInfo();

    Message queryOnePensionsInfo();

    Message editPension(Pension pension);

    Message removePension(int key);

    Message queryPensionStaffInfo();

    Message querySinglePensionStaffInfo(int key);
}
