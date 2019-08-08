package com.eurasia.first.modules.first.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.eurasia.first.modules.first.entity.RecordEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecordDao extends BaseMapper<RecordEntity> {
}
