package com.eurasia.first.modules.first.service;

import com.baomidou.mybatisplus.service.IService;
import com.eurasia.first.common.utils.PageUtils;
import com.eurasia.first.modules.first.entity.SpaceEntity;

import java.util.Map;

public interface SpaceService extends IService<SpaceEntity> {
    PageUtils queryPage(Map<String, Object> params);
}
