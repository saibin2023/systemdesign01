import java.util.Scanner;

public class E018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("月を入力してください：");
        int month = scan.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("月の範囲エラー");
        } else {
            int days;
            switch (month) {
                case 2:
                days = 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                default:
                    days = 31;
                    break;
            }
            System.out.println(month + "月は" + days + "まであります");
        }
        scan.close();
    }
}
