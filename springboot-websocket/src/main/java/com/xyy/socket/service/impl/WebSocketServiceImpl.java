package com.xyy.socket.service.impl;

import com.xyy.socket.dao.WebSocketMapper;
import com.xyy.socket.dao.pojo.WebTest;
import com.xyy.socket.service.WebSocketService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: zyf
 * @create: 2022-03-24 15:51
 **/
@Service
public class WebSocketServiceImpl implements WebSocketService {

    private final WebSocketMapper webSocketMapper;

    public WebSocketServiceImpl(WebSocketMapper webSocketMapper) {
        this.webSocketMapper = webSocketMapper;
    }


    @Override
    public List<WebTest>  getAll() {
        List<WebTest> maps = webSocketMapper.selectList(null);
        return maps;
    }
}
