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
        int index = 0;
        int chr = Integer.parseInt(String.valueOf(s.charAt(index)));
        while(index < s.length()){
            Node current = root;
            while(index < s.length() && (chr == 0 && current.left != null) || (chr == 1 && current.right != null)) {
                if (chr == 0)
                    current = current.left;
                else
                    current = current.right;
                chr = Integer.parseInt(String.valueOf(s.charAt(++index)));

            }
            stringBuilder.append(current.data);

        }

        System.out.println(stringBuilder);

    }
}