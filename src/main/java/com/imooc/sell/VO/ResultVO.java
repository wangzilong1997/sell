package com.imooc.sell.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author wangzilong
 * @date 2020/2/13 11:15
 */
@Data
public class ResultVO<T> {

    /**提示码*/
    private Integer code;
    /**提示信息*/
    private String msg;
    /**具体信息*/
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
