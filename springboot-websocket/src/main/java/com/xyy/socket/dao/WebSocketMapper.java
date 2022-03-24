package com.xyy.socket.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xyy.socket.dao.pojo.WebTest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: zyf
 * @create: 2022-03-24 15:55
 **/
@Mapper
@Repository
public interface WebSocketMapper extends BaseMapper<WebTest> {
}
