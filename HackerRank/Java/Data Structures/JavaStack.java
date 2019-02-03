import java.util.*;
import java.io.*;

class JavaStack {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while(scanner.hasNext()) {
      String bracketString = scanner.nextLine();
      System.out.println(paranthesisMatcher(bracketString));
    }
  }

  static boolean paranthesisMatcher(String s) {
    Stack<Character> bracketStack = new Stack<Character>();

    for (int i = 0; i < s.length(); i++) {
      char thisChar = s.charAt(i);
      if (thisChar == '{' || thisChar == '(' || thisChar == '[') bracketStack.push(thisChar);
      else {
        if (bracketStack.empty()) return false;
        else if(
          (thisChar == '}' && bracketStack.peek() == '{') ||
          (thisChar == ')' && bracketStack.peek() == '(') ||
          thisChar == ']' && bracketStack.peek() == '[') {
            bracketStack.pop();
          }
        else return false;
      }
    }

    if (bracketStack.empty()) return true;
    else return false;
  }
}
