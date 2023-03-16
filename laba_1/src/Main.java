import java.util.Scanner;
import java.util.*;
import static java.util.Collections.*;
public class Main {
    /*
    public static void main(String[] args) {
        //2.Отобразить в окне консоли аргументы командной строки в обратном порядке
        Scanner in = new Scanner(System.in);
        StringBuffer stroka =  new StringBuffer(in.nextLine());

        stroka.reverse();
        System.out.println(stroka.toString());

    }
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Предполагаемое количество чисел: ");
        int n = sc.nextInt();
        String palindromes= null;
        System.out.println("Введите числа: ");
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            String s1 = Integer.toString(a[i]);
            if (s1.length() > 1 && isPalindrome(s1)) {
                palindromes += ("  "+ s1 + "  ");
            }
        }

        if (palindromes != null) {
            System.out.println("Числа палиндромы: " + palindromes);
        } else {
            System.out.println("Среди указанных чисел палиндром не обнаружен");
        }
    }
    static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }

        }
        return true;
    }




}