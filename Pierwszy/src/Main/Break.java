package Main;

public class Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i >= 5) {
                break;
            }
            System.out.println(i);
        }
    }
}

/*
SPOSÓB 1
int[] array1 = new int[10];
SPOSÓB 2
long[] array2 = new long[0]
SPOSÓB 3
double array3[] = new double[2]
SPOSÓB 4
int[] array4 = new int[] {1, 2, 3}
 */

/*
CASE
String v = "a";
switch (v) {
    case "a":
    case "b":
    case "c":
        break;
        }
 */

