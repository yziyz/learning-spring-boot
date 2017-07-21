package yz.learning.springboot.controller;

import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yz.learning.springboot.config.CustomProperty;
import yz.learning.springboot.config.SendMessage;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    /**
     * 自定义的环境变量类，以便输出。
     */
    private CustomProperty customProperty;
    //@Autowired
    //private SendMessage sendMessage;

    @Autowired//标记一个构造函数，字段，setter方法或配置方法，以便由Spring的依赖注入设备自动连接。
    public void setCustomProperty(CustomProperty customProperty) {
        this.customProperty = customProperty;
    }

    @RequestMapping
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping(value = "/info")
    public Map<String, String> getInfo(
            @ApiParam(name = "name", required = true, value = "名称")
            @RequestParam(name = "name", required = true) final String name
    ) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", name);
        return map;
    }

    @RequestMapping(value = "/list")
    public Map<String, String> getInfo() {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 6; i++) {
            map.put(String.format("key-%d", i), String.format("value-%d", i));
        }
        return map;
    }

    @RequestMapping(value = "/environment")
    public String environment() {
        return customProperty.toString();
    }

    @RequestMapping(value = "message")
    public String message() {
        //return sendMessage.send();
        return "message";
    }
}
