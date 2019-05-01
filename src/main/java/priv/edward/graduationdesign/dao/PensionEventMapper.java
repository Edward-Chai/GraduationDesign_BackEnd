package priv.edward.graduationdesign.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import priv.edward.graduationdesign.model.PensionEvent;

import java.util.List;

@Repository
@Mapper
public interface PensionEventMapper {
    int deleteByPrimaryKey(Integer peid);

    int insert(PensionEvent record);

    int insertSelective(PensionEvent record);

    PensionEvent selectByPrimaryKey(Integer peid);

    List<PensionEvent> selectAll();

    int updateByPrimaryKeySelective(PensionEvent record);

    int updateByPrimaryKey(PensionEvent record);
}