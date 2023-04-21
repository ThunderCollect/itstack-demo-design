package com.wlper.temp.adapter;

/**
 * @ClassName: TestAdapter
 * @Package: com.xjidp.hrsaas.temp.adapter
 * @Description: 测试对象代理模式
 * @Author: Thunder
 * @Date: Created in 2023-04-11 17:56
 * @Version: V1.0.0
 */
public class TestAdapter {
    // 测试
    public static void main(String[] args) {
        DC5 powerAdapter = new PowerAdapter(new AC220());
        // 输出220V交流电
        // 220V适配转换成5V
        powerAdapter.output5();

        powerAdapter = new PowerAdapter(new AC380());
        powerAdapter.output5();
    }
}
