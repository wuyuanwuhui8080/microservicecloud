package com.nzh.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author 牛自豪
 * @className Dept
 * @description 这个类的作用
 * @date 2019/9/10 12:46
 */
//每个属性都有get/set
@Data
//全参构造函数
//@AllArgsConstructor
//空参构造函数
@NoArgsConstructor
//链式风格访问
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno; // 主键
    private String dname; // 部门名称
    private String db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    Dept(String dname) {
        this.dname = dname;
    }

}
