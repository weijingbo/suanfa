package chapter08;

import java.io.File;
import java.io.IOException;

public class Java01_IO {
    public static void main(String[] args) throws IOException {
        //TODO Java数据流操作
        // TODO IO，输入输出
        // TODO File对象，属于java.io
        //创建文件对象，使用文件路径关联系统文件
        String filePath = "D:\\dev\\suanfa\\java-algorithm\\src\\main\\data\\world.txt";
        File file = new File(filePath);
        //判断关联的文件是文件还是文件夹
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        //文件是否存在
        if(file.exists()){
            System.out.println("文件关联对象存在");
            if(file.isFile()){
                file.getName();
                file.length();
                file.lastModified();
                file.getAbsolutePath();
            }else if(file.isDirectory()){
                System.out.println("文件对象关联的是一个文件夹");
                System.out.println(file.getName());
                String[] list = file.list();
                for (String s : list) {
                    System.out.println(s);
                }
                File[] files = file.listFiles();//得到文件对象
            }

        }else {
            System.out.println("文件路径不存在");
            file.mkdirs(); //创建文件目录
            file.createNewFile();//创建新文件
        }
        System.out.println(file);
    }
}
