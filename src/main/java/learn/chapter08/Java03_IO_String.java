package learn.chapter08;

import java.io.*;

public class Java03_IO_String {
    public static void main(String[] args) {
        //TODO Java IO 文件复制
        // TODO 数据源文件对象
        File srcFile = new File("D:\\dev\\suanfa\\java-algorithm\\src\\main\\data\\world.txt");
        // TODO 数据目的地文件对象(自动生成)
        File desFile = new File("D:\\dev\\suanfa\\java-algorithm\\src\\main\\data\\world_copy.txt");
        //TODO 字符输入流
        BufferedReader reader = null;
        //TODO 字符输出流
        PrintWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(srcFile));
            writer = new PrintWriter(desFile);

//            //TODO 打开阀门，流转数据
//            int data = in.read();
//            //TODO 打开阀门，流转数据
//            out.write(data);
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.println(line);
            }
            //刷写数据
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (writer != null) {
                writer.close();
            }
        }


    }
}
