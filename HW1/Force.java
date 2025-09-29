import edu.princeton.cs.algs4.StdIn;

public class Force {
    public static void main(String[] args) {
        double mass1 = StdIn.readDouble();
        double mass2 = StdIn.readDouble();
        double r = StdIn.readDouble();

        final double G = 6.67430e-11;

        double force = G * mass1 * mass2 / (r * r);
        System.out.println(force);
    }
}