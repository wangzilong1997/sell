package com.imooc.sell.service;

import com.imooc.sell.dataobject.SellerInfo;

/**
 * 买家端
 * @author wangzilong
 * @date 2020/3/5 19:40
 */
public interface SellerService {

    /**
     * 通过openid查询买家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
