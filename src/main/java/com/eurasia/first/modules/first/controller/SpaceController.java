package com.eurasia.first.modules.first.controller;

import com.eurasia.first.common.utils.PageUtils;
import com.eurasia.first.common.utils.R;
import com.eurasia.first.modules.first.entity.SpaceEntity;
import com.eurasia.first.modules.first.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@RestController
public class SpaceController {
    @Autowired
    private SpaceService spaceService;
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = spaceService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(SpaceEntity spaceEntity) {
        spaceService.insert(spaceEntity);

        return R.ok();
    }
    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(Integer[] id) {
        spaceService.deleteBatchIds(Arrays.asList(id));

        return R.ok();
    }
}
