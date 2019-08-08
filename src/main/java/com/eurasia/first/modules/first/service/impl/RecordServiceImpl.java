package com.eurasia.first.modules.first.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eurasia.first.common.utils.PageUtils;
import com.eurasia.first.common.utils.Query;
import com.eurasia.first.modules.first.dao.RecordDao;
import com.eurasia.first.modules.first.entity.RecordEntity;
import com.eurasia.first.modules.first.service.RecordService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("RecordService")
public class RecordServiceImpl extends ServiceImpl<RecordDao, RecordEntity> implements RecordService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RecordEntity> page = this.selectPage(
                new Query<RecordEntity>(params).getPage(),
                new EntityWrapper<RecordEntity>()
        );

        return new PageUtils(page);
    }
}
