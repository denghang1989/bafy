package cn.com.dhcc.bafy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import cn.com.dhcc.bafy.entity.Test;
import cn.com.dhcc.bafy.service.QualityEntityTestService;

@Controller
@RequestMapping("/test")
public class QualityEntityTestController {

    @Resource
    private QualityEntityTestService mQualityEntityTestService;

    @GetMapping("/test")
    @ResponseBody
    public Map<String,String> test(){
        Map<String,String> map = new HashMap<>();
        Test test = new Test();
        test.setName("22");
        test.setAge("22");
        mQualityEntityTestService.insert(test);
        map.put("code","ok");
        return map;
    }

}
