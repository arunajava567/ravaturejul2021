package com.revature.models.autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.revature.models.autowired")
public class AppConfig {}

//  @componnet @Bean @Value @Configuration  @Autowired @Required @Inject @Qualifier
//@Scope  @PostConstruct  @PreDestroy 