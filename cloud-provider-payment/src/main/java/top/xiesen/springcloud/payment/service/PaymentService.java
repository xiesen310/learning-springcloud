package top.xiesen.springcloud.payment.service;

import org.apache.ibatis.annotations.Param;
import top.xiesen.springcloud.common.entities.Payment;

/**
 * @Description
 * @className top.xiesen.springcloud.payment.service.PaymentService
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/21 23:41
 */
public interface PaymentService {
    /**
     * 创建
     *
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据 ID 查询
     *
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
