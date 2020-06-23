package com.motif.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.motif.common.*;

@Configuration
@ComponentScan(basePackageClasses = User.class)
public class UserConfig {
	@Bean
    public Profile getProfile() {
        return new Profile("Kevin Li", 21, 1);
    }
}
