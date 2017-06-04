package com.tonyge;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * MockTool
 *
 * @author TonyGe
 * @date 2017/6/4
 */


@RestController
//@EnableAutoConfiguration
public class MockTool {

    private static final ResponseModel responseModel;
    static {
        responseModel = new ResponseModel();
        responseModel.setCode("500");
        responseModel.setMessage("系统维护中");
        responseModel.setData(new HashMap<Object, Object>());
        responseModel.setTraceId("deea306683004151c7b755e94bec0ffcc1543d8d");
    }


    @RequestMapping("/**")
    ResponseModel order() {
        return responseModel;
    }

}