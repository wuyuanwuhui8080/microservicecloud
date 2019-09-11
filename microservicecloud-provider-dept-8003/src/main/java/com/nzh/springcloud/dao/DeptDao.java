package com.nzh.springcloud.dao;

import com.nzh.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 牛自豪
 * @className DeptDao
 * @description 这个类的作用
 * @date 2019/9/10 13:51
 */
@Mapper
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();

}
