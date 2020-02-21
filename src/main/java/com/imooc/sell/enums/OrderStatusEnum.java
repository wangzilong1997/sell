package com.imooc.sell.enums;

/**
 * @author wangzilong
 * @date 2020/2/13 19:59
 */
public enum OrderStatusEnum implements CodeEnum{
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消")
    ;

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    OrderStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
    public static OrderStatusEnum getOrderStatusEnum(Integer code){
        for (OrderStatusEnum orderStatusEnum:OrderStatusEnum.values()){
            if (orderStatusEnum.getCode().equals(code)){
                return orderStatusEnum;
            }
        }
        return null;
    }
}
