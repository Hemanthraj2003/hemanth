import java.io.*;

class prgm18 {
    public static void main(String args[]) throws FileNotFoundException {
        int i;
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\monis\\Desktop\\C\\C programs\\internals.txt");
            do {
                i = fis.read();
                if (i != 1)
                    System.out.print((char) i);
            } while (i != -1);
            fis.close();
            FileOutputStream fos = new FileOutputStream("C:\\Users\\monis\\Desktop\\C\\C programs\\internals.txt");
            String txt = "hello";
            char ch[] = txt.toCharArray();
            for (i = 0; i < ch.length; i++) {
                fos.write(ch[i]);
            }
            fos.close();
        } catch (Exception e) {
            System.out.println("File not found!");
        }
    }
}