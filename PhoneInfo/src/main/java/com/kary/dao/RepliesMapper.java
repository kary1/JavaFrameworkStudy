package com.kary.dao;

import java.util.List;

import com.kary.entitys.Replies;

public interface RepliesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Replies record);

    int insertSelective(Replies record);

    Replies selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Replies record);

    int updateByPrimaryKey(Replies record);

	List<Replies> selectByInfoid(Integer id);

	Replies selectByInfoidAndContent(Replies replies);
	
}