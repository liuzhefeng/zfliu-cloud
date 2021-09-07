package com.zfliu.business.controller.admin;


import com.zfliu.server.domain.Chapter;
import com.zfliu.server.service.ChapterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {

    private static final Logger LOG = LoggerFactory.getLogger(ChapterController.class);
    public static final String BUSINESS_NAME = "大章";

    @Resource
    private ChapterService chapterService;

    /**
     * 列表查询
     */
    @GetMapping("/list")
    public List<Chapter> list() {
        return chapterService.list();
    }

}
