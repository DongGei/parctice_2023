package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @className: t1
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2023/2/28
 **/
public class t1 {


        public static void main(String[] args) {
            Object object = new MThread();
            MThread mythread = new MThread("mythread ", object);
            mythread.start();
            //synchronized (mythread)
            synchronized (object) {
                System.out.println("mythread = " + mythread.hashCode());
                for (int i = 0; i < 100; i++) {
                    if (i == 20) {
                        try {
                            System.out.println("开始join");
                            mythread.join();//main主线程让出CPU执行权，让mythread子线程优先执行
                            System.out.println("结束join");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() +"==" + i);
                }
            }
            System.out.println("main方法执行完毕");
        }
    }

    class MThread extends Thread {
        private String name;
        private Object object;
        public MThread() {
        }
        public MThread(String name, Object obj) {
            this.name = name;
            this.object = obj;
        }
        @Override
        public void run() {
            synchronized (object) { //this
                System.out.println("this = " + this.hashCode());
                for (int i = 0; i < 100; i++) {
                    System.out.println(name + i);
                }
            }
        }


}
