public class Main {
    public static void main(String[] args) {
        /*
            We have bunnies standing in a line, numbered 1, 2, ...
            The odd bunnies (1, 3, ..) have the normal 2 ears.
            The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
            Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
         */
    }

    public static int bunnyEars2(int bunnies) {
        // odd numbered bunnies (1, 3, 5, ..) -> 2 ears
        // even numbered bunnies (2, 4, 6, ..) -> 3 ears
        /*
            bunny(0) -> 0
            bunny(1) -> 2
            bunny(2) -> 5
            bunny(3) -> 7
            bunny(4) -> 10
         */

        if (bunnies == 0)
            return 0;
        if(bunnies % 2 == 0)
            return 3;
        else
            return 2;

        // step1: function bunnyEars2(n) should return the number of ears of the in the bunny line n
        //      bunnyEars2(n) -> returns bunnyEars2(0) + bunnyEars2(1) + ... + bunnyEars(n)

        // step2: Picking a subproblem, assuming the function works already
        //      bunnyEars2(n-1)

        // step3: Use the solution of the subproblem to solve the origin problem
        return bunnyEars2(bunnies-1) + bunnyEars2(bunnies);

        // step4: Base case: the easiest case that requires no extra calculation



    }

}
