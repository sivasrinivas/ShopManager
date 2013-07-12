package com.sivasrinivas.ShopManager.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sivasrinivas.service.impl, com.sivasrinivas.dao.impl")
public class AppConfig {

}
