package top.xiesen.springcloud.consul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.xiesen.springcloud.common.entities.CommonResult;
import top.xiesen.springcloud.common.entities.Payment;

import javax.annotation.Resource;

/**
 * @Description
 * @className top.xiesen.springcloud.consul.controller.OrderConsulCOntroller
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/24 22:53
 */
@RestController
public class OrderConsulController {
    public static final String PAYMENT_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public CommonResult paymentInfo() {
        String result = restTemplate.getForObject(PAYMENT_URL + "/payment/consul", String.class);
        return new CommonResult(200, result);
    }

}
