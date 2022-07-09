public class Main {
    public static void main(String[] args) {

    }

    public int firstBadVersion(int n) {
        int head = 1, tail = n;
        while(head<tail){
            int mid = head + (tail - head)/2;
            if(isBadVersion(mid)){
                tail = mid;
            }
            else{
                if(isBadVersion(mid+1)){
                    return mid+1;
                }
                head = mid;
            }

        }
        if(head == tail)
            return head;
        return 1;
    }
}
