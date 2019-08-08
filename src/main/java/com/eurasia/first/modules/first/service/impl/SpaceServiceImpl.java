package com.eurasia.first.modules.first.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eurasia.first.common.utils.PageUtils;
import com.eurasia.first.common.utils.Query;
import com.eurasia.first.modules.first.dao.SpaceDao;
import com.eurasia.first.modules.first.entity.SpaceEntity;
import com.eurasia.first.modules.first.service.SpaceService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("SpaceService")
public class SpaceServiceImpl  extends ServiceImpl<SpaceDao, SpaceEntity> implements SpaceService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SpaceEntity> page = this.selectPage(
                new Query<SpaceEntity>(params).getPage(),
                new EntityWrapper<SpaceEntity>()
        );

        return new PageUtils(page);
    }
}
