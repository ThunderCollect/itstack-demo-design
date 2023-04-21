package com.wlper.temp.adapter;

/**
 * @ClassName: AC380
 * @Package: com.xjidp.hrsaas.temp.adapter
 * @Description: 适配380V
 * @Author: Thunder
 * @Date: Created in 2023-04-11 18:24
 * @Version: V1.0.0
 */
public class AC380 implements Power{
    @Override
    public int output() {
        System.out.println("输出380V交流电");
        return 380;
    }
}
