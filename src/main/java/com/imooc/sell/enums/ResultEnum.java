package com.imooc.sell.enums;

/**
 * @author wangzilong
 * @date 2020/2/14 19:18
 */
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10,"商品不存在"),

    ;

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
