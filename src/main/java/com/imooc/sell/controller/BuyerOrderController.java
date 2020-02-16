package com.imooc.sell.controller;

import com.imooc.sell.VO.ResultVO;
import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.enums.ResultEnum;
import com.imooc.sell.exception.SellException;
import com.imooc.sell.form.OrderForm;
import com.imooc.sell.service.OrderService;
import com.imooc.sell.service.impl.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

/**
 * @author wangzilong
 * @date 2020/2/16 12:49
 */

@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerOrderController {
    private final Logger logger = LoggerFactory.getLogger(BuyerOrderController.class);

    @Autowired
    private OrderService orderService;
    //创建订单
    public ResultVO<Map<String,String>> create(@Valid OrderForm orderForm, BindingResult bindingResult){


        //表单校验
        if (bindingResult.hasErrors()){
            logger.error("【创建订单】参数不正确，orderForm={}",orderForm);
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),bindingResult.getFieldError().getDefaultMessage());
        }
        //对象的转化
        OrderDTO orderDTO = new OrderDTO

    }

    //订单列表

    //查看单个订单

    //取消订单




}
