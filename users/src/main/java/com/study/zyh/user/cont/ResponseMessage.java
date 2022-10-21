package com.study.zyh.user.cont;

import com.study.zyh.user.enums.ResponseCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ResponseMessage<T> {

    private T data;

    private Integer code;

    private String msg;

    public  ResponseMessage<T> success(T data){
        return new ResponseMessage<>(data, ResponseCodeEnum.SUCCESS.getCode(),ResponseCodeEnum.SUCCESS.getMsg());
    }
}
