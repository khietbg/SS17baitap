package bai2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap duong dan  source");
            String src = scanner.nextLine();
        System.out.println("nhap duong dan des");
        String des = scanner.nextLine();
        File source = new File(src);
        File dest = new File(des);
        copyFile(source,dest);
    }
    public static void copyFile(File src, File des){
        try {
            InputStream is = new FileInputStream(src);
            OutputStream os = new FileOutputStream(des);
            byte[] buf = new byte[1024];
            int length;
            while ((length = is.read(buf)) > 0) {
                os.write(buf, 0, length);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
