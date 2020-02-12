package com.imooc.sell.repository;


import com.imooc.sell.dataobject.ProductCategory;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;


/**
 * @author wangzilong
 * @date 2020/2/12 9:59
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductCategoryServiceRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findById(1).get();
        System.out.println(productCategory.toString());
    }
    /*
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
    }*/
    @Test
    public void dataTest(){
        ProductCategory productCategory = repository.findById(2).get();
        productCategory.setCategoryType(11);

        repository.save(productCategory);
    }

    @Test
    /*立马回滚*/
    @Transactional
    public void gouzaoTest(){
        ProductCategory productCategory = new ProductCategory("女生最爱",3);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2,3,11);

        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }
}