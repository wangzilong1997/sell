package com.imooc.sell.repository;


import com.imooc.sell.dataobject.ProductCategory;
import com.sun.xml.bind.v2.model.core.ID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author wangzilong
 * @date 2020/2/12 9:59
 */
@SpringBootTest
class ProductCatagoryRepositoryTest {

    @Autowired
    private ProductCatagoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findById(1).get();
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategory_name("女生最爱");
        productCategory.setCategory_type(3);
        repository.save(productCategory);
    }
    @Test
    public void saveNTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategory_id(2);
        productCategory.setCategory_name("男生最爱");
        productCategory.setCategory_type(3);
        repository.save(productCategory);
    }
    @Test
    public void dataTest(){
        ProductCategory productCategory = repository.findById(2).get();
        productCategory.setCategory_type(11);

        repository.save(productCategory);
    }
}