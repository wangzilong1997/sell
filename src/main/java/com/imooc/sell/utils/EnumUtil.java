package com.imooc.sell.utils;

import com.imooc.sell.enums.CodeEnum;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author wangzilong
 * @date 2020/2/21 10:25
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
