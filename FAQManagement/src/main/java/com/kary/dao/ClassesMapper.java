package com.kary.dao;

import java.util.List;

import com.kary.entitys.Classes;

public interface ClassesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Classes record);

    int insertSelective(Classes record);

    Classes selectByPrimaryKey(Integer id);
    
    Classes selectByCname(String cname);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);
    
    List<Classes> findAll();
}