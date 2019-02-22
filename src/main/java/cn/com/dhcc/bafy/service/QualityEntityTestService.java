package cn.com.dhcc.bafy.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import cn.com.dhcc.bafy.dao.QualityEntityTestDao;
import cn.com.dhcc.bafy.entity.Test;

@Service
public class QualityEntityTestService {

    @Resource
    private QualityEntityTestDao mQualityEntityTestDao;

    public void insert(Test test) {
        mQualityEntityTestDao.insert(test);
    }

}
