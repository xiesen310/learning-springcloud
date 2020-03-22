package top.xiesen.springcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @className top.xiesen.springcloud.payment.PaymentMain
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/21 23:13
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain.class, args);
    }
}
