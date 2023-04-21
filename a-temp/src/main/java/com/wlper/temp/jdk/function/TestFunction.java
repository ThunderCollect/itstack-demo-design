package com.wlper.temp.jdk.function;

/**
 * @ClassName: TestFunction
 * @Package: com.xjidp.hrsaas.temp.jdk.function
 * @Description: 函数式接口
 * @Author: Thunder
 * @Date: Created in 2023-04-13 10:20
 * @Version: V1.0.0
 */
public class TestFunction {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        // 123
        System.out.println(converted);

    }
}
