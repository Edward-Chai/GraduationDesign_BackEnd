package priv.edward.graduationdesign.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import priv.edward.graduationdesign.model.Job;

import java.util.List;

@Repository
@Mapper
public interface JobMapper {
    int deleteByPrimaryKey(Integer jobid);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer jobid);

    List<Job> selectAll();

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
}