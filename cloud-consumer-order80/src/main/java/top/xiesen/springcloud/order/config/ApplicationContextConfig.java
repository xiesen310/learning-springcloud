package top.xiesen.springcloud.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @className top.xiesen.springcloud.order.config.ApplicationContextConfig
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/22 0:25
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
