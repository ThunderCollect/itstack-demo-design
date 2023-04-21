package com.wlper.temp.base;

class RecordExample {
    int a = 0;
    boolean flag = false;

    public void write() {
        a = 1;                 //步骤1
        flag = true;        //步骤2
    }

    public void reader() {
        if (flag) {              //步骤3
            int i = a * a;   //步骤4
        }


    }

}