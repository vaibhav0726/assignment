// Accept a integer number as Command line argument from the program and when the program is executed
// print the binary, octal and hexadecimal equivalent of the given number.
import java.util.*;
public class assignment2 {
    public static void main(String[] args) {
        System.out.println("Binary equilvalent= "+Integer.toBinaryString(Integer.parseInt(args[0])));
        System.out.println("Octal equilvalent= "+Integer.toOctalString(Integer.parseInt(args[0])));
        System.out.println("Hexadecimal equilvalent= "+Integer.toHexString(Integer.parseInt(args[0])));
    }
}
