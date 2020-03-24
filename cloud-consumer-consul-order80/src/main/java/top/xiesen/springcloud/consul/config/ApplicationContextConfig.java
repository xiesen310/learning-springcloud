package top.xiesen.springcloud.consul.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @className top.xiesen.springcloud.consul.config.ApplicationContextConfig
 * @Author 谢森
 * @Email xiesen@zork.com.cn
 * @Date 2020/3/24 22:52
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
