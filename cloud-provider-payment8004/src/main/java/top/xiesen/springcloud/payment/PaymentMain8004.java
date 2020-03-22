package top.xiesen.springcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @EnableDiscoveryClient 该注解用于向使用 consul 或者 zookeeper 作为注册中心时注册服务
 * @className top.xiesen.springcloud.payment.PaymentMain8004
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/22 21:03
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
