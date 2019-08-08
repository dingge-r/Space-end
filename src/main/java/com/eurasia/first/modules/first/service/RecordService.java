package com.eurasia.first.modules.first.service;

import com.baomidou.mybatisplus.service.IService;
import com.eurasia.first.common.utils.PageUtils;
import com.eurasia.first.modules.first.entity.RecordEntity;

import java.util.Map;

public interface RecordService extends IService<RecordEntity> {
    PageUtils queryPage(Map<String, Object> params);
}
