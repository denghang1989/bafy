package cn.com.dhcc.bafy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import cn.com.dhcc.bafy.dao.CTLocMapper;
import cn.com.dhcc.bafy.entity.Loc;

@Service
public class CTLocService {

    @Autowired
    CTLocMapper mCTLocMapper;

    public List<Loc> getAllLoc(String type){
        List<Loc> locs = mCTLocMapper.getAllCtLoc(type);
        return locs;
    }



}
