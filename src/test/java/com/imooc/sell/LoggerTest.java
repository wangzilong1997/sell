package com.imooc.sell;



import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author wangzilong
 * @date 2020/2/11 17:52
 */

@SpringBootTest
@Slf4j
public class LoggerTest {

    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        logger.debug("debug...");
        logger.info("info....");
        logger.error("error...");
    }
}
