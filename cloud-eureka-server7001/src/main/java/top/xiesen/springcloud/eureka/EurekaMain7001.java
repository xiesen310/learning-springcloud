package top.xiesen.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description
 * @className top.xiesen.springcloud.eureka.EurekaMain7001
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/22 12:18
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
