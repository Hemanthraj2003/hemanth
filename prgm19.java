import java.io.*;

public class prgm19 {
    public void printFileName(File[] a, int i, int lvl) {
        if (i == a.length)
            return;
        for (int j = 0; j < lvl; j++) {
            System.out.println("\t");
            if (a[i].isFile())
                System.out.println(a[i].getName() + " is file");
            else if (a[i].isDirectory())
                System.out.println("[" + a[i].getName() + "]" + " isdirectory");
        }
        printFileName(a, i + 1, lvl);
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\monis\\Desktop\\OLD pgcet guide";
        File fobj = new File(path);
        prgm19 obj = new prgm19();
        if (fobj.exists() && fobj.isDirectory()) {
            File[] a = fobj.listFiles();
            System.out.println("Displaying the files in thedirectory:" + fobj);
            obj.printFileName(a, 0, 1);
        } else {
            System.out.println(fobj + " is not directory");
        }
    }
}