import java.util.*;
import java.io.*;

class JavaMap {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();

    HashMap<String, Integer> phoneDirectory = new HashMap<String, Integer>();

    // Taking input to the hashmap
    while (n-- > 0) {
      String name = scanner.nextLine();
      int number = scanner.nextInt();
      phoneDirectory.put(name, number);
      scanner.nextLine();
    }


    // Printing the phone number from hashmap for every query. If found.
    while(scanner.hasNext()) {
      String queryName = scanner.nextLine();
      if (phoneDirectory.containsKey(queryName))
        System.out.println(String.format("%s=%s", queryName, phoneDirectory.get(queryName)));
      else
        System.out.println("Not found");
    }
  }
}
