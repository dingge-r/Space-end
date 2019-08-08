package com.eurasia.first.modules.first.controller;

import com.eurasia.first.common.utils.PageUtils;
import com.eurasia.first.common.utils.R;
import com.eurasia.first.modules.first.entity.RecordEntity;
import com.eurasia.first.modules.first.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@RestController
public class RecordController {
    @Autowired
    private RecordService recordService;
    @RequestMapping("/recordlist")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = recordService.queryPage(params);

        return R.ok().put("page", page);
    }
    /**
     * 删除
     */
    @RequestMapping("/recorddelete")
    public R delete(Integer[] id) {
        recordService.deleteBatchIds(Arrays.asList(id));

        return R.ok();
    }
    /**
     *
     * 保存
     */
    @RequestMapping("/recordsave")


    public R save(RecordEntity recordEntity) {
        recordService.insert(recordEntity);

        return R.ok();
    }

}
