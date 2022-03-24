package com.xyy.socket.service;

import com.xyy.socket.dao.pojo.WebTest;

import java.util.List;
import java.util.Map;

/**
 * @author: zyf
 * @create: 2022-03-24 15:50
 **/
public interface WebSocketService {
    /**
     * 获取全部数据
     * @return
     */
    List<WebTest> getAll();
}
