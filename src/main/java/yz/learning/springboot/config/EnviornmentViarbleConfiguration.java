package yz.learning.springboot.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 环境变量的读取
 */

@Component//表示注释类是“Component”。当使用基于注释的配置和类路径扫描时，这些类被认为是自动检测的候选。不写时不会被执行，也就没有本类示例的日志输出。
public class EnviornmentViarbleConfiguration implements EnvironmentAware{
    private static final Logger LOGGER = LoggerFactory.getLogger(EnviornmentViarbleConfiguration.class);

    @Value("${spring.datasource.url}")
    private String dataSourceUrl;

    @Override
    public void setEnvironment(Environment environment) {
        LOGGER.info("spring.datasource.url: " + dataSourceUrl);
        LOGGER.info("JAVA_HOME: " + environment.getProperty("JAVA_HOME"));
        LOGGER.info("spring.datasource.driver-class-name: " + environment.getProperty("spring.datasource.driver-class-name"));
    }
}
