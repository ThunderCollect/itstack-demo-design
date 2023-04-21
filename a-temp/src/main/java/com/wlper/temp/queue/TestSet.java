package com.wlper.temp.queue;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @ClassName: TestSet
 * @Package: com.xjidp.hrsaas.temp.queue
 * @Description: TODO
 * @Author: Thunder
 * @Date: Created in 2023-04-13 13:36
 * @Version: V1.0.0
 */
public class TestSet {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("Hello");
        strings.add("wanglei");
        strings.add("zhongguo");
        strings.add("beijing");
        strings.add("haerbin");
        for (String s: strings) {
            System.out.println(s);
        }
        System.out.println("==========");
        LinkedHashSet<String> lset = new LinkedHashSet<>();
        lset.add("Hello");
        lset.add("wanglei");
        lset.add("zhongguo");
        lset.add("beijing");
        lset.add("haerbin");
        for (String s: lset) {
            System.out.println(s);
        }
    }
}
