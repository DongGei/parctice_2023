package test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        // 主线程
        // 下面的代码解释：等够了7个就发车 触发线程，召唤神龙
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7,() -> {
            System.out.println("召唤神龙");
        });

        for (int i = 1; i <= 7; i++) {
            // 子线程
            int finalI = i;
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "收集了第" + finalI + "颗龙珠");
                try {
                    cyclicBarrier.await(); // 加法计数+1 等待
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": 我们通过栅栏了" );
            }).start();
        }
    }
}
//Thread-4收集了第5颗龙珠
//Thread-0收集了第1颗龙珠
//Thread-5收集了第6颗龙珠
//Thread-6收集了第7颗龙珠
//Thread-2收集了第3颗龙珠
//Thread-3收集了第4颗龙珠
//Thread-1收集了第2颗龙珠
//召唤神龙
//Thread-2: 我们通过栅栏了
//Thread-6: 我们通过栅栏了
//Thread-5: 我们通过栅栏了
//Thread-0: 我们通过栅栏了
//Thread-4: 我们通过栅栏了
//Thread-1: 我们通过栅栏了
//Thread-3: 我们通过栅栏了
//
//Process finished with exit code 0