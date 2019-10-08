package cn.com.dhcc.bafy.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import cn.com.dhcc.bafy.entity.Loc;

@Repository
@Mapper
public interface CTLocMapper {

    List<Loc> getAllCtLoc(@Param("type") String type);

    void delete(@Param("id") String id);

}
