package priv.edward.graduationdesign.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import priv.edward.graduationdesign.model.Pension;
import priv.edward.graduationdesign.model.PensionStaffInfo;

import java.util.List;

@Mapper
@Repository
public interface PensionMapper {
    int deleteByPrimaryKey(Integer pensionid);

    int insert(Pension record);

    int insertSelective(Pension record);

    Pension selectByPrimaryKey(Integer pensionid);

    List<PensionStaffInfo> selectPensionStaffInfo();

    PensionStaffInfo selectSinglePensionStaffInfo(Integer pensionid);

    int updateByPrimaryKeySelective(Pension record);

    int updateByPrimaryKey(Pension record);
}