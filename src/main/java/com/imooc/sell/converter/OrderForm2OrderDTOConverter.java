package com.imooc.sell.converter;

import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.form.OrderForm;

/**
 * @author wangzilong
 * @date 2020/2/16 13:11
 */
public class OrderForm2OrderDTOConverter {

    private static OrderDTO convert(OrderForm orderForm){
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());


    }
}
