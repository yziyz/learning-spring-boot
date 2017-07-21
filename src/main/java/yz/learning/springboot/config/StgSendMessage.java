package yz.learning.springboot.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "stg")
public class StgSendMessage implements SendMessage {
    @Override
    public String send() {
        return "STG环境的信息";
    }
}
