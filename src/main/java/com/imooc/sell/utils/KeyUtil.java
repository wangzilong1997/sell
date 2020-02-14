package com.imooc.sell.utils;

import java.util.Random;

/**
 * @author wangzilong
 * @date 2020/2/14 19:33
 */
public class KeyUtil {

    /**
     * 生成唯一主键
     * 格式时间+随机数
     * synchronized 多线程
     * */
    public static synchronized String genUniqueKey(){
        Random random = new Random();

        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
