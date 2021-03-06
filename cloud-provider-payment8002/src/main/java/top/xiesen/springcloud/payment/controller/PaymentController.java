package top.xiesen.springcloud.payment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import top.xiesen.springcloud.common.entities.CommonResult;
import top.xiesen.springcloud.common.entities.Payment;
import top.xiesen.springcloud.payment.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Description
 * @className top.xiesen.springcloud.payment.controller.PaymentController
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/21 23:44
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果: {}", result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,serverPort:" + serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> create(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("插入结果: {}", payment);
        if (null != payment) {
            return new CommonResult(200, "查询数据库成功,serverPort:" + serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询ID: " + id);
        }
    }
}
