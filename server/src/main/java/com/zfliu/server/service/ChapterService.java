package com.zfliu.server.service;


import com.zfliu.server.domain.Chapter;
import com.zfliu.server.domain.ChapterExample;
import com.zfliu.server.mapper.ChapterMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    /**
     * 列表查询
     */
    public List<Chapter> list() {
        ChapterExample chapterExample = new ChapterExample();
        List<Chapter> chapterList = chapterMapper.selectByExample(chapterExample);
        return chapterList;
    }

}
