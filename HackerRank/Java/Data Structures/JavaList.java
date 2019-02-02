import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i<n; i++) {
            myList.add(scanner.nextInt());
        }

        int queries = scanner.nextInt();
        scanner.nextLine();

        while(queries-- > 0) {
          String query = scanner.nextLine();
          switch(query) {
            case "Insert":
              String[] indexAndValue = scanner.nextLine().split(" ");
              int index, value;
              index = Integer.parseInt(indexAndValue[0]);
              value = Integer.parseInt(indexAndValue[1]);

              if (index > myList.size())
                myList.add(value);
              else
                myList.add(index, value);
              break;

            case "Delete":
              int removeIndex = Integer.parseInt(scanner.nextLine());

              myList.remove(removeIndex);
              break;

            default:
              break;

          }
        }

        Iterator<Integer> itr = myList.iterator();
        while(itr.hasNext()) {
          System.out.print(itr.next() + " ");
        }
    }
}
