import java.io.*;

public class RWByCharStream {
    public static void main(String[] args) {
        try {
            File file = new File("java.txt");
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
            char input[] = new char[100];
            while (isr.read(input) !=-1) {
                System.out.println(input);
            }
            isr.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }


    }
}
