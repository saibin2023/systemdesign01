import java.util.Scanner;
public class Ex007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int student = scan.nextInt();
        System.out.println("クラスの人数を入力してください！");
        int goodStudent = scan.nextInt();
        System.out.println("出席率が１００％の学生の人数を入力してください！");
        
        double rate = (double)goodStudent / student;
        System.out.println("クラス人数" + student + "人の中で出席率が１００％の学生" + goodStudent + "人は全体の" + rate + " %です！");
        scan.close();
    }
}
