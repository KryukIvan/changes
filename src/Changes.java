import java.util.Scanner;

public class Changes {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        float x = in.nextFloat();
        if (x > 0) {
            System.out.print("Количество рублей: ");
            int y = in.nextInt();
            if (y > 0) {
                float z = x * y;
                System.out.printf("Итого: %.2f", z);
            }
            else {System.out.print("Сумма не может быть нулем или меньше");}
        }
        else {System.out.print("Курс не может быть нулем или меньше");}

    }
}
