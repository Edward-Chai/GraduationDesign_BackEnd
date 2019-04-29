package priv.edward.graduationdesign.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import priv.edward.graduationdesign.model.RetirePolicy;

@Repository
@Mapper
public interface RetirePolicyMapper {
    int deleteByPrimaryKey(Integer rpid);

    int insert(RetirePolicy record);

    int insertSelective(RetirePolicy record);

    RetirePolicy selectByPrimaryKey(Integer rpid);

    int updateByPrimaryKeySelective(RetirePolicy record);

    int updateByPrimaryKey(RetirePolicy record);
}