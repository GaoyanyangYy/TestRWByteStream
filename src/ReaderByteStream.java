import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReaderByteStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("text.txt");
            byte input[] = new byte[31];
            fis.read(input);

            String inputString = new String(input);
            System.out.println(inputString);
            //关闭流
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
