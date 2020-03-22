package top.xiesen.springcloud.payment.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.xiesen.springcloud.common.entities.Payment;

/**
 * @Description PaymentDao
 * @className top.xiesen.springcloud.payment.dao.PaymentDao
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/21 23:32
 */
@Mapper
public interface PaymentDao {

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
