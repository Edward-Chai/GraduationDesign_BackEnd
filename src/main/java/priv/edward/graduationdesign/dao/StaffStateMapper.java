package priv.edward.graduationdesign.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import priv.edward.graduationdesign.model.StaffState;

@Repository
@Mapper
public interface StaffStateMapper {
    int deleteByPrimaryKey(Integer ssid);

    int insert(StaffState record);

    int insertSelective(StaffState record);

    StaffState selectByPrimaryKey(Integer ssid);

    int updateByPrimaryKeySelective(StaffState record);

    int updateByPrimaryKey(StaffState record);
}