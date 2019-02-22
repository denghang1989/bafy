package cn.com.dhcc.bafy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.com.dhcc.emr.metaservice.ImageBOItemInfo;

@Configuration
public class ImageBOItemInfoConfig {

    @Bean
    public ImageBOItemInfo creat() {
        return new ImageBOItemInfo();
    }
}
