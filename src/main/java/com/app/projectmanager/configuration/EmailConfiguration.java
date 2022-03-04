package com.app.projectmanager.configuration;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("spring.mail")
@Data
@Getter
@Setter
public class EmailConfiguration {
    public String host;
    public String port;
    public String userName;
    public String password;
    public String auth;
    public String enabled;
}
