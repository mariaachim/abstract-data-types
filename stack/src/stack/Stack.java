package stack;

import java.util.Objects;
import java.util.ArrayList;

public class Stack {

    private static ArrayList<String> stack = new ArrayList<String>(); // STACK IS DYNAMIC
    private static Integer pointer;

    public Stack() {
        pointer = 0;
    }

    public static void push(String item) throws Exception {
        if (pointer == stack.size()) {
            System.out.println("Stack overflow error");
        } else {
            stack.set(pointer, item);
            pointer++;
        }
    }

    public static String pop() throws Exception {
        if (pointer == 0) {
            System.out.println("Stack underflow error");
            return null;
        } else {
            pointer--;
            return stack.get(pointer);
        }
    }

    public static String peek() throws Exception {
        if (pointer == 0) {
            System.out.println("Stack underflow error");
            return null;
        } else {
            return stack.get(pointer - 1);
        }
    }

    public static Integer size() throws Exception {
        Integer count = 0;
        for (Integer i = 0; i < stack.size(); i++) {
            if (!Objects.isNull(stack.get(i))) {
                count++;
            }
        }
        return count;
    }

    public static void duplicate() throws Exception {
        if (pointer == 0) {
            System.out.println("Stack underflow error");
        } else {
            String item = pop();
            push(item);
        }
    }

    public static void swap() throws Exception {
        String temp = stack.get(pointer - 1);
        stack.set((pointer - 1), stack.get(pointer - 2));
        stack.set((pointer - 2), temp);
    }

    public static void right_rotate(Integer n) throws Exception {
        String[] temp = new String[n];

        for (Integer i = 0; i < n; i++) {
            temp[i] = stack.get(pointer - i - 1);
        }

        for (Integer i = 0; i < n; i++) {
            if (i - 1 < 0) {             
                stack.set((pointer - i - 1), temp[n - 1]);
            } else {
                stack.set((pointer - i - 1), temp[i - 1]);
            }
        }
    }

    public static void left_rotate(Integer n) throws Exception {
        String[] temp = new String[n];

        for (Integer i = 0; i < n; i++) {
            temp[i] = stack.get(pointer - i - 1);
        }

        for (Integer i = 0; i < n; i++) {
            if (i + 1 >= n) {             
                stack.set((pointer - n), temp[0]);
            } else {
                stack.set((pointer - i - 1), temp[i + 1]);
            }
        }
    }

    public static void print_stack() throws Exception { // not standard stack subroutine, but added for debugging purposes
        for (Integer i = 0; i < stack.size(); i++) {
            if (!Objects.isNull(stack.get(i))) {
                System.out.println(stack.get(i));
            }
        }
    }
}
