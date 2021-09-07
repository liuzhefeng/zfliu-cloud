package com.zfliu.server.service;

import com.zfliu.server.domain.Test;
import com.zfliu.server.domain.TestExample;
import com.zfliu.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Desc
 *
 * @author zfliu
 * @version 1.0
 * @date 2021/09/07 12:38:59
 */
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> all() {
        TestExample testExample = new TestExample();
        List<Test> list = testMapper.selectByExample(testExample);
        return list;
    }
}
