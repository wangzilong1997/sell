package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * @author wangzilong
 * @date 2020/2/20 14:58
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);

}
