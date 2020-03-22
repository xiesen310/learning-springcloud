package top.xiesen.springcloud.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description Payment
 * @className top.xiesen.springcloud.payment.entities.Payment
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/21 23:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Long id;
    private String serial;
}
