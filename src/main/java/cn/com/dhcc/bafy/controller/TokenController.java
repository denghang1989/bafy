package cn.com.dhcc.bafy.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import cn.com.dhcc.bafy.config.JwtConfig;

@RestController
public class TokenController {
    @Resource
    private JwtConfig jwtConfig ;
    // 拦截器直接放行，返回Token
    @PostMapping("/login")
    public Map<String,String> login (@RequestParam("userName") String userName,
                                     @RequestParam("passWord") String passWord){
        Map<String,String> result = new HashMap<>() ;
        // 省略数据源校验
        String token = jwtConfig.getToken(userName+passWord) ;
        if (!StringUtils.isEmpty(token)) {
            result.put("token",token) ;
        }
        result.put("userName",userName) ;
        return result ;
    }


    // 需要 Token 验证的接口
    @PostMapping("/info")
    public String info (){
        return "info" ;
    }
}