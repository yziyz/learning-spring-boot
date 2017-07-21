package yz.learning.springboot.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 定时任务使用
 * https://spring.io/guides/gs/scheduling-tasks/
 * http://docs.spring.io/spring/docs/current/spring-framework-reference/html/scheduling.html#scheduling-annotation-support-scheduled
 * https://www.mkyong.com/java8/java-8-how-to-format-localdatetime/
 */
@Component
public class ScheduledConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledConfig.class);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 5000)//固定速率
    public void reportCurrentTime() {
        LOGGER.info(LocalDateTime.now().format(formatter));
    }
}
