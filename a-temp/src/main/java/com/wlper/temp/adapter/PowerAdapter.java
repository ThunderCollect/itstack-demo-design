package com.wlper.temp.adapter;

import lombok.AllArgsConstructor;

/**
 * @ClassName: PowerAdapter
 * @Package: com.xjidp.hrsaas.temp.adapter
 * @Description: TODO
 * @Author: Thunder
 * @Date: Created in 2023-04-11 17:55
 * @Version: V1.0.0
 */
@AllArgsConstructor
public class PowerAdapter implements DC5 {

    // 适配者
    private Power power;

    @Override
    public int output5() {
        int output220 = power.output();
        int output5 = output220 / 44;
        System.out.println(output220 + "V适配转换成" + output5 + "V");
        return output5;
    }
}


