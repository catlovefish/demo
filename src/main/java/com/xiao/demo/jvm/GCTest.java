package com.xiao.demo.jvm;

public class GCTest {
    //-Xms45M -Xmx45M -XX:+PrintGCDetails
    public static void main(String[] args) throws InterruptedException {
        byte[] allocation1, allocation2/*, allocation3, allocation4, allocation5, allocation6*/;
        allocation1 = new byte[6000*1024];

        //allocation2 = new byte[3000*1024];

      /*allocation3 = new byte[1000*1024];
     allocation4 = new byte[1000*1024];
     allocation5 = new byte[1000*1024];
     allocation6 = new byte[1000*1024];*/
    }
}
