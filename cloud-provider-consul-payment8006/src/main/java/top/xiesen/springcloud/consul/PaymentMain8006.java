package top.xiesen.springcloud.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @className top.xiesen.springcloud.consul.PaymentMain8006
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/24 22:39
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8006.class, args);
    }
}
