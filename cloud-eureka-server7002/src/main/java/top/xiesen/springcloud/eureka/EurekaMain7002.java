package top.xiesen.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description
 * @className top.xiesen.springcloud.eureka.EurekaMain7002
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/22 14:51
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class, args);
    }
}
