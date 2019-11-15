import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("101.txt"));
        HashTable table = new HashTable(101);
        while(sc.hasNext())
        {
            int key = sc.nextInt();
            String val = sc.next()+ " " + sc.next();
            table.put(key,val);
        }
        System.out.println(table);

    }
}
