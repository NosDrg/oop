package src;
public class UseThree {
    /**
     * Prints a greeting to three people whose names are provided as command-line arguments.
     * @param args Command-line arguments where args[0], args[1], and args[2] are the names of the people to greet.
     */
    public static void main(String[] args) {
        System.out.print("Hi, ");
        System.out.print(args[2]);
        System.out.print(", ");
        System.out.print(args[1]);
        System.out.print(", and ");
        System.out.print(args[0]);
        System.out.println(".");
    }
}
