import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
  private ArrayList<Integer> stack;
  
  public Stack() {
    stack = new ArrayList<>();
  }
  
  public void push(int item) {
    stack.add(item);
  }
  
  public int pop() {
    if (!isEmpty()) {
      return stack.remove(stack.size() - 1);
    }
    return -1;
  }
  public int peek() {
    if (!isEmpty()) {
      return stack.get(stack.size() - 1);
    }
    return -1;
  }
  public boolean isEmpty() {
    return stack.isEmpty();
  }
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack myStack = new Stack();

        int choice = 0;
        while (choice!=5) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display stack");
            System.out.println("5. Quit");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = input.nextInt();
                    myStack.push(element);
                    System.out.println("Element pushed onto stack.");
                    break;

                case 2:
                    int poppedElement = myStack.pop();
                    if (poppedElement != -1) {
                        System.out.println("Popped element: " + poppedElement);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;

                case 3:
                    int topElement = myStack.peek();
                    if (topElement != -1) {
                        System.out.println("Top element: " + topElement);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;

                case 4:
                    System.out.println("Elements in the stack:");
                    ArrayList<Integer> tempStack = new ArrayList<>();
                    while (!myStack.isEmpty()) {
                        int stackElement = myStack.pop();
                        System.out.println(stackElement);
                        tempStack.add(stackElement);
                    }
                    for (int i = tempStack.size() - 1; i >= 0; i--) {
                        myStack.push(tempStack.get(i));
                    }
                    break;

                case 5:
                    System.out.println("Quitting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
}
