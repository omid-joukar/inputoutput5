import java.io.File;

/**
 * Created by KPS on 7/20/2020.
 */
public class Main {
    public static void main(String[] args) {
        File path = new File("d:\\employee.txt");
        if (path.isDirectory()){
            System.out.println("Directory");
        }else {
            System.out.println("File");
        }
    }
}
