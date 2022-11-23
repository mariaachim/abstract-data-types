import stack.Stack;

class Test {
  public static void main(String[] args) {
    System.out.println("Hello world");
    Stack test = new Stack();
    try {
      test.push("5");
      test.push("7");
      test.push("8");
      test.push("4");
      test.push("10");
      test.print_stack();
      test.left_rotate(3);
      test.print_stack();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}