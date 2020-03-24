package top.xiesen.springcloud.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @className top.xiesen.springcloud.consul.OrderConsulMain
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/24 22:50
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain.class, args);
    }
}
