import java.io.*;

public class aaaatest {
    public static void main(String args[]) {
        File f;
        String s[];
        int i;
        try {
            f = new File("c:\\wamp64\\"); // To print whole location
            s = f.list();
            if (s != null) {
                for (i = 0; i < s.length; i++) {
                    File ff = new File("c:\\wamp64\\" + s[i]);
                    if (ff.isDirectory()) {
                        System.out.println("c:\\wamp64\\" + s[i]); // Prints only when it is a directory.
                        displaySubDirectories(ff); // Recursively display subdirectories
                    }
                }
            } else {
                System.out.println("No subdirectories found.");
            }
        } catch (Exception e) {
            System.out.println("\nError :" + e);
        }
    }

    // Recursive method to display subdirectories
    public static void displaySubDirectories(File directory) {
        String[] subDirs = directory.list();
        if (subDirs != null) {
            for (String subDir : subDirs) {
                File subFile = new File(directory, subDir);
                if (subFile.isDirectory()) {
                    System.out.println(subFile.getPath());
                    displaySubDirectories(subFile); // Recursively display subdirectories
                }
            }
        }
    }
}
