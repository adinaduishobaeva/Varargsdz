public class Main {
    public static void main(String[] args) {
        System.out.println(Marlen(1, 23, 4, 5, 6, 7, 8, 78));


    }
    static int Marlen(int...var) {
        int summa=0;
        for (int i = 0; i < var.length; i++) {
            summa+=var[i];


        } return summa;
    }
}