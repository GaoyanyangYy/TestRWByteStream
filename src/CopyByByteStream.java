import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyByByteStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("可爱.jpg");
            FileOutputStream fos = new FileOutputStream("可爱_new.jpg");

            //将文件读取到数组中
            byte input[] = new byte[50];
            while (fis.read(input) != -1) {
                fos.write(input);
            }

            fis.close();
            fos.close();
            System.out.println("done");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
