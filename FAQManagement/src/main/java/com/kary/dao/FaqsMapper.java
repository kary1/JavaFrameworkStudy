package com.kary.dao;

import java.util.List;

import com.kary.entitys.Faqs;

public interface FaqsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Faqs record);

    int insertSelective(Faqs record);

    Faqs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Faqs record);

    int updateByPrimaryKey(Faqs record);
    
    List<Faqs> findAll();

	List<Faqs> search(String key);
}