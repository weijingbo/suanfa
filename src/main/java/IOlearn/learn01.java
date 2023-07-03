package IOlearn;

import java.io.*;

public class learn01 {
    public static void main(String[] args) throws IOException {
//       try(InputStream fis = new FileInputStream("input.txt")) {
//           System.out.println("Number of remaining bytes:"
//                                + fis.available());
//           int content;
//           long skip = fis.skip(2);
//           System.out.println("The actual number of bytes skipped:" + skip);
//           System.out.print("The content read from file:");
//           while ((content=fis.read())!=-1){
//               System.out.print((char)content);
//           }
//       }catch (IOException e){
//           e.printStackTrace();
//       }

        // 新建一个 BufferedInputStream 对象
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("input.txt"));
        // 读取文件的内容并复制到 String 对象中
        String result = new String(bufferedInputStream.readAllBytes());
        System.out.println(result);

    }



}
