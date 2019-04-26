package priv.edward.graduationdesign.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import priv.edward.graduationdesign.model.RetirePolicy;
import priv.edward.graduationdesign.model.RetirePolicyExample;

@Repository
public interface RetirePolicyMapper {
    long countByExample(RetirePolicyExample example);

    int deleteByExample(RetirePolicyExample example);

    int deleteByPrimaryKey(Integer rpid);

    int insert(RetirePolicy record);

    int insertSelective(RetirePolicy record);

    List<RetirePolicy> selectByExample(RetirePolicyExample example);

    RetirePolicy selectByPrimaryKey(Integer rpid);

    int updateByExampleSelective(@Param("record") RetirePolicy record, @Param("example") RetirePolicyExample example);

    int updateByExample(@Param("record") RetirePolicy record, @Param("example") RetirePolicyExample example);

    int updateByPrimaryKeySelective(RetirePolicy record);

    int updateByPrimaryKey(RetirePolicy record);
}