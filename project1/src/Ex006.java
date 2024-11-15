public class Ex006 {
    public static void main(String[] args) {
        int student = 46;
        int goodStudent = 3;
        double rate = (double)goodStudent / student + 0.000005;
        double rate1 = rate * 100000;
        System.out.println("クラス人数" + student + "人の中で出席率が１００％の学生" + goodStudent + "人は全体の" + (int)rate1/1000.0  + " %です！");
    }
}
