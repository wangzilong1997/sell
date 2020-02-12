package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wangzilong
 * @date 2020/2/12 9:57
 */
public interface ProductCatagoryRepository extends JpaRepository<ProductCategory,Integer> {
}
