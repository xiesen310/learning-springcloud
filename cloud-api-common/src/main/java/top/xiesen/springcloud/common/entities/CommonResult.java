package top.xiesen.springcloud.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description CommonResult 结果集封装
 * @className top.xiesen.springcloud.payment.entities.CommonResult
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/21 23:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}

