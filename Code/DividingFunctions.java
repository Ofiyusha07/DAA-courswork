
public class DividingFunctions {

    // Function 1: T(n) = T(n / 2) + 1
    public static void fun1(int n) {
        if (n > 1) {
            System.out.println(n);
            fun1(n / 2);
        }
    }

    // Function 2: T(n) = T(n / 2) + n
    public static void fun2(int n) {
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                System.out.println(n);
            }
            fun2(n / 2);
        }
    }

    // Function 3: T(n) = 2T(n / 2) + n
    public static void fun3(int n) {
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                System.out.println(n);
            }
            fun3(n / 2);
            fun3(n / 2);
        }
    }

    public static void main(String[] args) {

        int n = 8;

        System.out.println("Function 1:");
        fun1(n);

        System.out.println("\nFunction 2:");
        fun2(n);

        System.out.println("\nFunction 3:");
        fun3(n);
    }
}
