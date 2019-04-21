package priv.edward.graduationdesign.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import priv.edward.graduationdesign.model.PensionEvent;
import priv.edward.graduationdesign.model.PensionEventExample;

public interface PensionEventMapper {
    long countByExample(PensionEventExample example);

    int deleteByExample(PensionEventExample example);

    int deleteByPrimaryKey(Integer peid);

    int insert(PensionEvent record);

    int insertSelective(PensionEvent record);

    List<PensionEvent> selectByExample(PensionEventExample example);

    PensionEvent selectByPrimaryKey(Integer peid);

    int updateByExampleSelective(@Param("record") PensionEvent record, @Param("example") PensionEventExample example);

    int updateByExample(@Param("record") PensionEvent record, @Param("example") PensionEventExample example);

    int updateByPrimaryKeySelective(PensionEvent record);

    int updateByPrimaryKey(PensionEvent record);
}