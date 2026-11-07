public class Assignment01Q03 {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int numOdd = 1;
        int prev1 = 1;
        int prev2 = 0;
        System.out.print("1 ");
        for (int i = 1; i < x; i++) {
            int curr = prev1+prev2;
            System.out.print(curr);
            prev2 = prev1;
            prev1 = curr;
            if ((curr % 2) == 1)
                numOdd += 1;
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
