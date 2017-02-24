package com.kary.dao;

import java.util.List;

import com.kary.entitys.Informations;

public interface InformationsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Informations record);

    int insertSelective(Informations record);

    Informations selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Informations record);

    int updateByPrimaryKey(Informations record);

    List<Informations> selectAll();
    
    int updateViewCount(Integer id);
}