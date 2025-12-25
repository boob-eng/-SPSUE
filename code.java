import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        // Считывание четырех целых чисел a,b,c,d из консоли
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        // Определение минимального числа
        int min = Math.min(Math.min(a,b),Math.min(c,d));
        //создадим переменную с заведомо большим числом
        int ans = (1 << 31)-1;
        //Если число не минимально,то запихиваем ее в переменную.
        //Сделав так с каждым числом,в итоге получим минимальное из оставшихся трех
        if (a != min) {
            ans=Math.min(a, ans);
        }
        if (b!=min){
            ans=Math.min(b,ans);
        }
        if (c!=min){
            ans=Math.min(c,ans);
        }
        if (d!=min){
            ans=Math.min(d,ans);
        }
        out.println(ans);
    }
}
