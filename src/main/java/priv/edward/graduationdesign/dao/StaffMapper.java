package priv.edward.graduationdesign.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import priv.edward.graduationdesign.model.Staff;
import priv.edward.graduationdesign.model.StaffInfo;

import java.util.List;

@Mapper
@Repository
public interface StaffMapper {
    int deleteByPrimaryKey(Integer staffid);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer staffid);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);

    List<Staff> selectAll();

    List<StaffInfo> selectAllStaffInfoRetired();

    List<Staff> selectAllRetired();

    List<StaffInfo> selectAllStaffInfo();

    List<Staff> selectByPrimaryKeyList();

    StaffInfo selectSingleStaffInfo(Integer staffid);

}