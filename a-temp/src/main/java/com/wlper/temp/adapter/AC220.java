package com.wlper.temp.adapter;

// 适配者 220V电压
public class AC220 implements Power {
    @Override
    public int output() {
        System.out.println("输出220V交流电");
        return 220;
    }
}
