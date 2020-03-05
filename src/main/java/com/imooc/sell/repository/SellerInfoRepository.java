package com.imooc.sell.repository;

import com.imooc.sell.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wangzilong
 * @date 2020/3/3 22:13
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo,String> {
    SellerInfo findByOpenid(String openid);
}
