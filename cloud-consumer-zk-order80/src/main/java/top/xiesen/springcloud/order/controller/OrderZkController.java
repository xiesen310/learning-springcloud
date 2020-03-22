package top.xiesen.springcloud.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.xiesen.springcloud.common.entities.CommonResult;

import javax.annotation.Resource;

/**
 * @Description
 * @className top.xiesen.springcloud.order.controller.OrderZkController
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/22 21:43
 */
@RestController
@Slf4j
public class OrderZkController {
    public static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public CommonResult paymentInfo() {
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
        return new CommonResult(200, result);
    }
}
