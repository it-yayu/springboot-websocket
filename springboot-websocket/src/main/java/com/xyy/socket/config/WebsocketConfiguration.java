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
public class WebsocketConfiguration {

    @Autowired
    public void webSocketService(WebSocketService webSocketService) {
        WebSocketServer.webSocketService = webSocketService;
    }

}