package com.wlper.temp.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName: TestQueue
 * @Package: com.xjidp.hrsaas.temp.queue
 * @Description: 测试java队列
 * @Author: Thunder
 * @Date: Created in 2023-04-12 18:21
 * @Version: V1.0.0
 */
public class TestQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> strings = new ArrayBlockingQueue<>(10);
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        System.out.println(strings);
        String poll = strings.poll();
        System.out.println(poll);
        System.out.println(strings);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("123","456");
    }
}
