package Base.JVM;

public class demo {
    public static void main(String[] args) {
        new Thread(()->{

        },"my thread name").start();
    }

    //native:凡是带了native 关键字的，说明java的作用范围打不到了，回去调用c语言的库！
    //会进入本地方法栈 JNI
    //JNI作用：扩展Java的使用，融合不同的编程语言为Java所用！ 最初:C,C++
    //他在内存区域中专门开辟了一块标记区域：Native Method stack，登记 native 方法
    // 在最终执行的时候，加载本地方法库中的方法通过JNI

    // Java程序驱动打印机，管理系统，掌握即可
    private native void start0();
}
