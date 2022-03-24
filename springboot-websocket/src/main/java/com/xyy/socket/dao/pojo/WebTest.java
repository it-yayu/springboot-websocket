package com.xyy.socket.dao.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: zyf
 * @create: 2022-03-24 15:54
 **/
@Data
@TableName
public class WebTest {

    private Integer id;

    private String name;
}
