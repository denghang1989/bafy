package cn.com.dhcc.bafy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.com.dhcc.bafy.dao")
public class BafyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BafyApplication.class, args);
    }

}

