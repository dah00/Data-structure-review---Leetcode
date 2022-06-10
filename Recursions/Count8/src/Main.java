public class Main {
    public static void main(String[] args) {

    }

    public static int count8(int n){
        /*
            Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
            except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
            Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
            while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

            count8(8) → 1
            count8(818) → 2
            count8(8818) → 4
         */

        /*
            Step1:
            count8(n) -> return the number of occurrences of 8 as a digit
                         ** Note that 8 has another 8 to its immediate left counts as 2
            count8(88818) = 1 + 2 + 2 + 1 = 6

            Step2:
            count8(8818) = 1 + 2 + 1 = 4
            /For n = 8818/
            if(n%10 == 8){
                if((n/10) % 10 == 8)  return 2 + count8(n/10)
                else return 1 + count8(n/10)
            }
            else return count8(n/10);

            Step3:
            Step4:
            if(n == 0) return 0;
         */

        if(n == 0)
            return 0;
        if(n%10 == 8){
            if((n/10) % 10  == 8)
                return 2 + count8(n/10);
            else
                return 1 + count8(n/10);
        }
        else
            return count8(n/10);

    }
}
