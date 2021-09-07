package com.zfliu.system.controller;

import com.zfliu.server.domain.Test;
import com.zfliu.server.dto.PageDto;
import com.zfliu.server.dto.ResponseDto;
import com.zfliu.server.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Desc
 *
 * @author zfliu
 * @version 1.0
 * @date 2021/09/07 12:37:41
 */
@RestController
@RequestMapping("/test")
public class TestController {
    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @Resource
    private TestService testService;

    @GetMapping("/list")
    public ResponseDto list() {
        ResponseDto responseDto = new ResponseDto();
        List<Test> testList = testService.all();
        responseDto.setContent(testList);
        return responseDto;
    }

}
