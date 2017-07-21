package yz.learning.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * “属性对象绑定”的自定义属性类
 * 参考：
 * http://blog.csdn.net/catoop/article/details/50548009
 * https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-Configuration-Binding
 *
 */
@Component
@ConfigurationProperties(prefix = "custom.property")
/*
外部配置注释。 如果要绑定和验证某些外部属性（例如.properties文件），请将其添加到@Configuration类中的类定义或@Bean方法中。
请注意，与@Value相反，由于属性值被外部化，因此不会评估SpEL表达式。
 */
public class CustomProperty {
    private String name = "modifiedName";
    private String url;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "CustomProperty{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
