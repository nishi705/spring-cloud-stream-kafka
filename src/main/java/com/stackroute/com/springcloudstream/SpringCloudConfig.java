package com.stackroute.com.springcloudstream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@Configuration
@EnableBinding(GreetingsStream.class)
public class SpringCloudConfig {

}
