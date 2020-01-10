import java.util.Scanner;

public class Main {

    public static int[] multiply(int c1, int z1, int c2, int z2) {
        c1 *= c2;
        z1 *= z2;
        return new int[]{c1, z1};

    }

    public static int[] plus(int c1, int z1, int c2, int z2) {
        c1 = c1 * z2;
        c2 = c2 * z1;
        z1 *= z2;
        c1 += c2;
        return new int[]{c1, z1}
    }

    public static int[] minus(int c1, int z1, int c2, int z2){
        c1 = c1 * z2;
        c2 = c2 * z1;
        z1 *= z2;
        c1 -= c2;
        return new int[]{c1, z1}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chisl1 = sc.nextInt();
        int znam1 = sc.nextInt();
        int chisl2 = sc.nextInt();
        int znam2 = sc.nextInt();
        int command = sc.nextInt();
        if (command == 1) {

        } else if (command == 2) {

        } else if (command == 3) {

        } else {
            System.out.println("Нет такой команды");
        }
    }
}
