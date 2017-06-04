package com.tonyge;

import lombok.Data;

import java.util.Map;

/**
 * ResponseModel
 *
 * @author TonyGe
 * @date 2017/6/4
 */
@Data
public class ResponseModel {

    /***
     {
     "code" : "0",
     "message" : "success",
     "data" : {
     "refund_no" : "801100015535382"
     },
     "traceId" : "deea306683004151c7b755e94bec0ffcc1543d8d"
     }
     */


    private String code;
    private String message;
    private Map<Object, Object> data;
    private String traceId;

}