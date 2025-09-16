import java.util.Scanner;

public class Main {

  // Initialized with STDIN
  static Scanner userinput = new Scanner(System.in);

  public static void main(String[] args) {
    // Changed to integer instead of string for arithmetic
    int s;

    // Added trailing space for nicer user input
    System.out.print("How old are you? ");

    // Changed to `nextInt` to accommodate line 10
    s = userinput.nextInt();

    // Flush newline
    userinput.nextLine();

    // Removed self-assignment to avoid messing up calculation on line 28
    // If I would have left it, I would have needed to change `s + 5 = s` to
    // `s = s + 5` because `s + 5` is an rvalue, not an lvalue.
    System.out.println("In 5 years you will be " + (s + 5) + " years old.");

    // Added parenthesis for grouping and fixed faulty logic (changed or to and)
    System.out.println(
      "It is " + ((s < 20) && (s > 12)) + " that you are a teenager."
    );

    System.out.println("I am such a smart computer.");
  }
}
