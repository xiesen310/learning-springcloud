package top.xiesen.springcloud.consul.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Description
 * @className top.xiesen.springcloud.consul.controller.PaymentController
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/24 22:40
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentZk() {
        return "spring cloud with consul: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
