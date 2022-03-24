package com.xyy.socket.config;

import com.xyy.socket.controller.WebSocketServer;
import com.xyy.socket.service.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @author: zyf
 * @create: 2022-03-24 15:20
 **/
@Configuration
public class WebSocketConfig {
    /**
     * 给spring容器注入这个ServerEndpointExporter对象
     * 相当于xml：
     * <beans>
     * <bean/>
     * </beans>
     * <p>
     * 检测所有带有@serverEndpoint注解的bean并注册他们。
     *
     * @return
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        System.out.println("我被注入了");
        return new ServerEndpointExporter();
    }


    @Autowired
    public static void setWebSocketService(WebSocketService webSocketService) {
        WebSocketServer.webSocketService = webSocketService;
    }

}