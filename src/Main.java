import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        reverseAnyWord(array);


    }

    public static void reverseAnyWord(int[] siuu) {
        StringBuilder tr = new StringBuilder();
        for (int i : siuu) {
            tr.append(i);
        }
        // int to string -> String.valueOf();
        // string to int -> Integer.parseInt();
        System.out.println("original array");
        System.out.println(Arrays.toString(siuu));
        System.out.println("array after operation");
        int f = Integer.parseInt(String.valueOf(tr));
        System.out.println(f);
        System.out.println("array after operation reverse");
        int f1 = Integer.parseInt(String.valueOf(tr.reverse()));
        System.out.println(f1);
        System.out.println("total");
        System.out.println(f+f1);


    }


}



