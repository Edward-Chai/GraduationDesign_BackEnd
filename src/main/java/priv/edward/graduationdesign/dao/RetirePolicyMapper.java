package priv.edward.graduationdesign.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import priv.edward.graduationdesign.model.RetirePolicy;

import java.util.List;

@Repository
@Mapper
public interface RetirePolicyMapper {
    int deleteByPrimaryKey(Integer rpid);

    int insert(RetirePolicy record);

    int insertSelective(RetirePolicy record);

    RetirePolicy selectByPrimaryKey(Integer rpid);

    List<RetirePolicy> selectAll();

    int updateByPrimaryKeySelective(RetirePolicy record);

    int updateByPrimaryKey(RetirePolicy record);
}