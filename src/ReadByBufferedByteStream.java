import java.io.*;

public class ReadByBufferedByteStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("1.mp4");
            BufferedInputStream bis = new BufferedInputStream(fis,100000);
            FileOutputStream fos = new FileOutputStream("1_new.mp4");
            BufferedOutputStream bos = new BufferedOutputStream(fos,1000000);

            byte input[] = new byte[100000];
            int count = 0;
            long before = System.currentTimeMillis();
            while(bis.read(input)!=-1) {
                bos.write(input);
                count++;
            }

            //关闭流
            bis.close();
            fis.close();
            bos.close();
            fos.close();
            System.out.println(System.currentTimeMillis() - before + "ms");
            System.out.println("读取了：" + count + "次");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
