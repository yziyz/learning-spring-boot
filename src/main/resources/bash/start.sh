#!/bin/bash

#删除pid文件
rm -f tpid

#启动项目
nohup java -jar /home/yuanzhen/project/springboot/target/springboot-1.0.jar --spring.config.location=application.properties > /dev/null 2>&1 &

#将pid写到文件
echo $! > tpid

#打印提示信息
echo Start Success!