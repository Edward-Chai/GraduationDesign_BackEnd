package priv.edward.graduationdesign.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import priv.edward.graduationdesign.dao.PensionMapper;
import priv.edward.graduationdesign.dao.RetirePolicyMapper;
import priv.edward.graduationdesign.dao.StaffMapper;
import priv.edward.graduationdesign.model.Pension;
import priv.edward.graduationdesign.model.PensionStaffInfo;
import priv.edward.graduationdesign.model.RetirePolicy;
import priv.edward.graduationdesign.model.StaffInfo;
import priv.edward.graduationdesign.service.PensionService;
import priv.edward.graduationdesign.util.Message;
import priv.edward.graduationdesign.util.PensionCalculator;

import java.util.List;

@Service
public class PensionServiceImpl implements PensionService {

    @Autowired
    private PensionMapper pensionMapper;

    @Autowired
    private StaffMapper staffMapper;

    @Autowired
    private RetirePolicyMapper retirePolicyMapper;

    @Override
    public Message addPension(Pension pension) {
        pension.setPensionadd(0f);
        pension.setPensionstate("0");
        StaffInfo staffInfo = staffMapper.selectSingleStaffInfo(pension.getStaffid());
        RetirePolicy retirePolicy = retirePolicyMapper.selectByPrimaryKey(1);
        Integer year;
        if (staffInfo.getStaffgender()=="1"){
            if (staffInfo.getCadre()=="1"){
                if (staffInfo.getSsid()==2){
                    year = retirePolicy.getNormalagemc();
                }else if (staffInfo.getSsid()==3){
                    year = retirePolicy.getSpecialjobagemc();
                }else if (staffInfo.getSsid()==4){
                    year = retirePolicy.getBankruptcyagemc();
                }else {
                    year = retirePolicy.getIllnessagemc();
                }
            }else {
                if (staffInfo.getSsid()==2){
                    year = retirePolicy.getNormalagem();
                }else if (staffInfo.getSsid()==3){
                    year = retirePolicy.getSpecialjobagem();
                }else if (staffInfo.getSsid()==4){
                    year = retirePolicy.getBankruptcyagem();
                }else {
                    year = retirePolicy.getIllnessagem();
                }
            }
        }else {
            if (staffInfo.getCadre()=="1"){
                if (staffInfo.getSsid()==2){
                    year = retirePolicy.getNormalagefc();
                }else if (staffInfo.getSsid()==3){
                    year = retirePolicy.getSpecialjobagefc();
                }else if (staffInfo.getSsid()==4){
                    year = retirePolicy.getBankruptcyagefc();
                }else {
                    year = retirePolicy.getIllnessagefc();
                }
            }else {
                if (staffInfo.getSsid()==2){
                    year = retirePolicy.getNormalagef();
                }else if (staffInfo.getSsid()==3){
                    year = retirePolicy.getSpecialjobagef();
                }else if (staffInfo.getSsid()==4){
                    year = retirePolicy.getBankruptcyagef();
                }else {
                    year = retirePolicy.getIllnessagef();
                }
            }
        }
        Integer month = PensionCalculator.getMonthDiff(staffInfo.getBirthday(), staffInfo.getEmploymentdate(), year);
        pension.setPensionmonthly(PensionCalculator.calc(pension.getPensionavg(),pension.getPensionbalance(),month));
//        System.out.println(pension.toString());
        int count = pensionMapper.insertSelective(pension);
        if (count > 0){
            return Message.success();
        }else {
            return Message.fail();
        }
//        return null;
    }

    @Override
    public Message queryAllPensions() {
        return null;
    }

    @Override
    public Message queryOnePension() {
        return null;
    }

    @Override
    public Message queryAllPensionsInfo() {
        return null;
    }

    @Override
    public Message queryOnePensionsInfo() {
        return null;
    }

    @Override
    public Message editPension(Pension pension) {
        Pension pTemp = pensionMapper.selectByPrimaryKey(pension.getPensionid());
        StaffInfo staffInfo = staffMapper.selectSingleStaffInfo(pTemp.getStaffid());
        RetirePolicy retirePolicy = retirePolicyMapper.selectByPrimaryKey(1);
        Integer year;
        if (staffInfo.getStaffgender()=="1"){
            if (staffInfo.getCadre()=="1"){
                if (staffInfo.getSsid()==2){
                    year = retirePolicy.getNormalagemc();
                }else if (staffInfo.getSsid()==3){
                    year = retirePolicy.getSpecialjobagemc();
                }else if (staffInfo.getSsid()==4){
                    year = retirePolicy.getBankruptcyagemc();
                }else {
                    year = retirePolicy.getIllnessagemc();
                }
            }else {
                if (staffInfo.getSsid()==2){
                    year = retirePolicy.getNormalagem();
                }else if (staffInfo.getSsid()==3){
                    year = retirePolicy.getSpecialjobagem();
                }else if (staffInfo.getSsid()==4){
                    year = retirePolicy.getBankruptcyagem();
                }else {
                    year = retirePolicy.getIllnessagem();
                }
            }
        }else {
            if (staffInfo.getCadre()=="1"){
                if (staffInfo.getSsid()==2){
                    year = retirePolicy.getNormalagefc();
                }else if (staffInfo.getSsid()==3){
                    year = retirePolicy.getSpecialjobagefc();
                }else if (staffInfo.getSsid()==4){
                    year = retirePolicy.getBankruptcyagefc();
                }else {
                    year = retirePolicy.getIllnessagefc();
                }
            }else {
                if (staffInfo.getSsid()==2){
                    year = retirePolicy.getNormalagef();
                }else if (staffInfo.getSsid()==3){
                    year = retirePolicy.getSpecialjobagef();
                }else if (staffInfo.getSsid()==4){
                    year = retirePolicy.getBankruptcyagef();
                }else {
                    year = retirePolicy.getIllnessagef();
                }
            }
        }
        Integer month = PensionCalculator.getMonthDiff(staffInfo.getBirthday(), staffInfo.getEmploymentdate(), year);
        if (pension.getPensionstate().equals("0")){
            pension.setPensionmonthly(PensionCalculator.calc(pension.getPensionavg(),pension.getPensionbalance(),month));
            pension.setPensionadd(0.0f);
        }else if (pension.getPensionstate().equals("1")){
            pension.setPensionmonthly(PensionCalculator.calc(pension.getPensionavg(),pension.getPensionbalance(),month)+pension.getPensionadd());
        }
        System.out.println(pension);
        int count = pensionMapper.updateByPrimaryKeySelective(pension);
        if (count > 0){
            return Message.success();
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message removePension(int key) {
        int count = pensionMapper.deleteByPrimaryKey(key);
        if (count > 0){
            return Message.success();
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message queryPensionStaffInfo() {
        List<PensionStaffInfo> pensionStaffInfos = pensionMapper.selectPensionStaffInfo();
        if (pensionStaffInfos.size()!=0){
            return Message.success().add("pensionStaffInfos",pensionStaffInfos);
        }else {
            return Message.fail();
        }
    }

    @Override
    public Message querySinglePensionStaffInfo(int key) {
        PensionStaffInfo pensionStaffInfo = pensionMapper.selectSinglePensionStaffInfo(key);
        if (pensionStaffInfo.getPensionid()!=0){
            return Message.success().add("pensionStaffInfo",pensionStaffInfo);
        }else {
            return Message.fail();
        }
    }
}
