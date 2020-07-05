package com.mybatisplus.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author qiuzhb
 * @date 2020/7/5 20:05
 */
@Component
@ConfigurationProperties(prefix = "spring.datasource")
@Data
public class MysqlConfig {

    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
