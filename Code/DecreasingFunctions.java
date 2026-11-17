
public class DecreasingFunctions {

    // Function 1: T(n) = T(n - 1) + 1
    public static void fun1(int n) {
        if (n > 0) {
            System.out.println(n);
            fun1(n - 1);
        }
    }

    // Function 2: T(n) = T(n - 1) + n
    public static void fun2(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println(n);
            }
            fun2(n - 1);
        }
    }

    // Function 3: T(n) = T(n - 1) + log n
    public static void fun3(int n) {
        if (n > 0) {
            for (int i = 1; i < n; i *= 2) {
                System.out.println(n);
            }
            fun3(n - 1);
        }
    }

    // Function 4: T(n) = 2T(n - 1) + 1
    public static void fun4(int n) {
        if (n > 0) {
            System.out.println(n);
            fun4(n - 1);
            fun4(n - 1);
        }
    }

    public static void main(String[] args) {

        int n = 4;

        System.out.println("Function 1:");
        fun1(n);

        System.out.println("\nFunction 2:");
        fun2(n);

        System.out.println("\nFunction 3:");
        fun3(n);

        System.out.println("\nFunction 4:");
        fun4(n);
    }
}
