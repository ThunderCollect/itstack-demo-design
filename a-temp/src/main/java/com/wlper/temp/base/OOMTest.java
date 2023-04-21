package com.wlper.temp.base;

public class OOMTest {

    /**
     * @Description: StackOverflowError
     * @Param: []
     * @Return: void
     * @Author: wanglei
     * @Date: Created in 2023/4/14 14:18
     * @Version: V1.0.0
     */
    public void stackOverFlowMethod() {
        stackOverFlowMethod();
    }

    public static void main(String... args) {
//        OOMTest oom = new OOMTest();
//        oom.stackOverFlowMethod();

        /**
         * OOM    -verbose:gc -Xmn10M -Xms20M -Xmx20M -XX:+PrintGC
         *
         * OutOfMemoryError: Java heap space
         */
//        List<byte[]> buffer = new ArrayList<byte[]>();
//        buffer.add(new byte[10 * 1024 * 1024]);


        /**
         * -verbose:gc -Xmn5M -Xms10M -Xmx10M -XX:MaxPermSize=1M -XX:+PrintGC
         *
         * OutOfMemoryError: GC overhead limit exceeded
         */
//        List<String> list = new ArrayList<String>();
//        while (true) {
//            list.add(UUID.randomUUID().toString().intern());
//        }
//        int i1 = 128;
//        int i2 = 128;
//        System.out.println(i1 == i2);
//        ArrayList<String> strings = new ArrayList<>();
//        String[] str = new String[10];
//        List<String> list = Arrays.asList(str);

        byte a = 127;
        byte b = 127;
        //b = a + b; // 报编译错误:cannot convert from int to byte
        b += a;
        System.out.println(b);
        Class<Integer> type = Integer.TYPE;

    }
}