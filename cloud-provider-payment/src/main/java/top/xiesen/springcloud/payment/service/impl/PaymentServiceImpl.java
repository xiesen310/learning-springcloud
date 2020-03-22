package top.xiesen.springcloud.payment.service.impl;

import org.springframework.stereotype.Service;
import top.xiesen.springcloud.common.entities.Payment;
import top.xiesen.springcloud.payment.dao.PaymentDao;
import top.xiesen.springcloud.payment.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Description
 * @className top.xiesen.springcloud.payment.service.impl.PaymentServiceImpl
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/21 23:42
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
