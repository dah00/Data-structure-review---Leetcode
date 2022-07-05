public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Obeda");
        System.out.println(stringBuilder);
    }
}

class Node {
    public  int frequency; // the frequency of this tree
    public  char data;
    public  Node left, right;


    private static void decode(String s, Node root){
        /*
            s = "1001011"
            On the tree: Read until null or until no matching character found.
                1 -> null : read 1
                0 -> 0 -> null : read 00
                1 -> null: read 1
                0 -> 1 -> null: read 01
                1 -> null: read 1

                s = "1001011"
                1:
         */
        StringBuilder stringBuilder = new StringBuilder();
        Node current = root;
        for(int i=0; i<s.length(); i++){
            int chr = Integer.parseInt(String.valueOf(s.charAt(i)));
            if(chr == 0 && current.left!=null){
                current = current.left;
            }
            else if(chr == 1 && current.right!= null){
                current = current.right;
            }
            else{
                i--;
                stringBuilder.append(current.data);
                current = root;
            }
            if(i == s.length()-1)
                stringBuilder.append(current.data);
        }

        System.out.println(stringBuilder);

    }
}