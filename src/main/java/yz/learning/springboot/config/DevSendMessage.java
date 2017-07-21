package yz.learning.springboot.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Profile(value = "dev")
public class DevSendMessage implements SendMessage {
    @Transactional(value = "txManager1")
    @Override
    public String send() {
        System.out.println(send2());
        return "DEV环境的信息";
    }

    @Transactional
    public String send2() {
        return "DEV环境的信息2";
    }
}
