package top.xiesen.springcloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @className top.xiesen.springcloud.order.OrderMain
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/22 0:22
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class, args);
    }
}
