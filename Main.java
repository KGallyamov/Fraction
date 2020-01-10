import java.util.Scanner;

public class Main {
    public static void print(int[] a){
        int chisl = a[0];
        int znam = a[1];
        int c = chisl, d = znam;

        // упрощение дроби
        while(c != 0 && d != 0){
            if(c > d){
                c %= d;
            }else{
                d %= c;
            }
        }
        int gcd = c + d;
        chisl /= gcd;
        znam /= gcd;

        // вывод
        System.out.println(" " + chisl + " " + "\n" + "----" + "\n" +  " " + znam + " ");
    }

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
        return new int[]{c1, z1};
    }
    public static int[] minus(int c1, int z1, int c2, int z2){
        c1 = c1 * z2;
        c2 = c2 * z1;
        z1 *= z2;
        c1 -= c2;
        return new int[]{c1, z1};
    }
    public static int[] stepen(int c1, int z1, int s1){
        int t = c1;
        for (int i = 1; i < s1; i++) {
            c1 *= t;
        }
        t = z1;
        for (int i = 1; i < s1; i++) {
            s1 *= t;
        }
        return int[]{c1, z1};
    }
    public static int[] divide(int c1, int z1, int c2, int z2) {
        if(c2 != 0){
            c1 /= c2;
            z1 /= z2;
            return new int[]{c1, z1};
        }else{
            return new int[]{0, -1}
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int command = sc.nextInt();
        int chisl1 = sc.nextInt();
        int znam1 = sc.nextInt();
        if(command == 1){ // сложение
            int chisl2 = sc.nextInt();
            int znam2 = sc.nextInt();
            print(plus(chisl1, znam1, chisl2, znam2));
        }else if(command == 2){ // умножение
            int chisl2 = sc.nextInt();
            int znam2 = sc.nextInt();
            print(multiply(chisl1, znam1, chisl2, znam2));
        }else if(command == 3){ // деление
            int chisl2 = sc.nextInt();
            int znam2 = sc.nextInt();

        }else if(command == 5){
            int step = sc.nextInt();
            print(stepen(chisl1, znam1 , step));
        } else{
            System.out.println("Нет такой команды");

        }
    }
}
