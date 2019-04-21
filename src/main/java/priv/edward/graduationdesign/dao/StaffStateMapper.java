package priv.edward.graduationdesign.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import priv.edward.graduationdesign.model.StaffState;
import priv.edward.graduationdesign.model.StaffStateExample;

public interface StaffStateMapper {
    long countByExample(StaffStateExample example);

    int deleteByExample(StaffStateExample example);

    int deleteByPrimaryKey(Integer ssid);

    int insert(StaffState record);

    int insertSelective(StaffState record);

    List<StaffState> selectByExample(StaffStateExample example);

    StaffState selectByPrimaryKey(Integer ssid);

    int updateByExampleSelective(@Param("record") StaffState record, @Param("example") StaffStateExample example);

    int updateByExample(@Param("record") StaffState record, @Param("example") StaffStateExample example);

    int updateByPrimaryKeySelective(StaffState record);

    int updateByPrimaryKey(StaffState record);
}