public class Main {
    public static void main(String[] args) {

    }

    public static int triangle(int rows) {
        /*
        We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.


        triangle(0) → 0
        triangle(1) → 1
        triangle(2) → 3
         */

        // Step1: Know what the function should do
        //      -> Return the number of block for the given row
        //      -> triangle(3) = triangle(2) + 3

        // Step2: Take a subproblem and solve
        //      -> triangle(rows-1) = triangle(rows-2) + (rows-1)

        // Step3: Use the solution of subproblem to solve the original problem
        //      -> triangle(rows) = triangle(rows-1) + (rows)

        // Step4: Base case
        //      -> if(rows == 0) return 0;

        if(rows == 0)
            return 0;
        return triangle(rows-1) + rows;
    }

}
