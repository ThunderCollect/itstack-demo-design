package com.wlper.temp.base;

import com.xjidp.hrsaas.modular.enterprise.entity.EnterpriseInfo;
import com.xjidp.hrsaas.modular.koiJob.entity.KoiJob;
import com.xjidp.hrsaas.modular.koiJob.model.params.Position;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName: TestOom
 * @Package: com.xjidp.hrsaas.temp.base
 * @Description: TODO
 * @Author: Thunder
 * @Date: Created in 2023-04-14 09:31
 * @Version: V1.0.0
 */
public class TestOom {
    private static final int _1MB = 1024 * 1024;

    /*** VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails - XX:SurvivorRatio=8 */
    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
        // 出现一次Minor GC
    }

    public static void testPretenureSizeThreshold() {
        byte[] allocation;
        allocation = new byte[5 * _1MB];
        //直接分配在老年代中
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

//        testPretenureSizeThreshold();
//        testAllocation();
        EnterpriseInfo e1 = new EnterpriseInfo();
        EnterpriseInfo e2 = new EnterpriseInfo();
        e1.setEnterpriseName("企业名");
        e2.setEnterpriseName("企业名");
        System.out.println(e1.equals(e2));
        Position position = new Position();
        position.setName("企业名");
        KoiJob koiJob = new KoiJob();
        koiJob.setEnterpriseName("企业名");
        System.out.println(e1.equals(koiJob));
        new ConcurrentHashMap<String,KoiJob>();
    }

}
