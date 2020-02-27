package com.imooc.sell.enums;

/**
 * 商品状态
 * @author wangzilong
 * @date 2020/2/12 19:41
 */
public enum ProductStatusEnum implements CodeEnum{
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;
    private String message;
    public String getMessage() {
        return message;
    }
    public Integer getCode() {
        return code;
    }



    ProductStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

}
