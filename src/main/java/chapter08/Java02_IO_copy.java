package chapter08;

import java.io.*;

public class Java02_IO_copy {
    public static void main(String[] args) {
        //TODO Java IO 文件复制
        // TODO 数据源文件对象
        File srcFile = new File("D:\\dev\\suanfa\\java-algorithm\\src\\main\\data\\world.txt");
        // TODO 数据目的地文件对象(自动生成)
        File desFile = new File("D:\\dev\\suanfa\\java-algorithm\\src\\main\\data\\world_copy.txt");
        //TODO 文件输入流
        FileInputStream in = null;
        //TODO 文件输出流
        FileOutputStream out = null;

        //TODO 缓冲区
        byte[] cathe = new byte[1024];

        BufferedInputStream buffIn = null;
        BufferedOutputStream buffOut = null;
        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(desFile);
            buffIn = new BufferedInputStream(in);
            buffOut = new BufferedOutputStream(out);

//            //TODO 打开阀门，流转数据
//            int data = in.read();
//            //TODO 打开阀门，流转数据
//            out.write(data);
            int data =-1;
            while ((data = buffIn.read(cathe)) != -1) {
                buffOut.write(cathe,0,data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (buffIn != null) {
                try {
                    buffIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (buffOut != null) {
                try {
                    buffOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
