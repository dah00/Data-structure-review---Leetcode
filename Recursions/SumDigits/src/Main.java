public class Main {
    public static void main(String[] args) {


    }

    /*
        Given a non-negative int n, return the sum of its digits recursively (no loops).
        Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
        while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

        sumDigits(126) → 9
        sumDigits(49) → 13
        sumDigits(12) → 3
     */

    /* Steps1: Know what the function should do
        -> Return the sum of each digits in n
        -> sumDigits(n) = (n%10) + ((n/10) % 10) + ((n/10) % 10) + ... + 0
        -> sumDigits(1234) = 4 + 3 + 2 + 1

       Step2: Consider a subproblem and solve it, assuming that the function works already
        -> sumDigits(123) = (123 % 10) + sumDigits(123/10);

       Step3: Solve the original problem using the solution of the subproblem
        -> sumDigits(1234) = (1234 % 10) + sumDigits(1234/10);

       Step4: Base case
        -> if(n == 0) return 0;

     */

    public static int sumDigits(int n) {
        if(n == 0) return 0;
        return (n%10) + sumDigits(n/10);
    }

}
