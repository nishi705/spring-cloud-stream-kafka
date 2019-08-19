package com.stackroute.com.springcloudstream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface GreetingsStream {
    String INPUT = "greetings-in";
    String OUTPUT = "greetings-out";
    @Input("greetings-in")
    SubscribableChannel inboundGreetings();
    @Output(OUTPUT)
    MessageChannel outboundGreetings();

}
