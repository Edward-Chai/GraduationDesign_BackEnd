package priv.edward.graduationdesign.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import priv.edward.graduationdesign.model.Staff;
import priv.edward.graduationdesign.model.StaffInfo;

import java.util.List;

@Repository
@Mapper
public interface StaffMapper {
    int deleteByPrimaryKey(Integer staffid);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer staffid);

    List<Staff> selectAll();

    List<StaffInfo> selectAllStaffInfo();

    StaffInfo selectSingleStaffInfo(Integer staffid);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}