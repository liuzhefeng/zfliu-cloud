package com.zfliu.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;


/**
 * 网关：限流、重试、跨域、路由、鉴权
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {

    private static final Logger LOG = LoggerFactory.getLogger(GatewayApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(GatewayApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("Gateway地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

    /**
     * 配置跨域
     * @return
     */
//	@Bean
//	public CorsWebFilter corsFilter() {
//		CorsConfiguration config = new CorsConfiguration();
//
//		config.setAllowCredentials(Boolean.TRUE);
//		config.addAllowedMethod("*");
//		config.addAllowedOrigin("*");
//		config.addAllowedHeader("*");
//		config.setMaxAge(3600L);
//
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource(new PathPatternParser());
//		source.registerCorsConfiguration("/**", config);
//
//		return new CorsWebFilter(source);
//	}

}
