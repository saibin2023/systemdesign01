import java.util.Scanner;

public class E020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cap = 10;
        int curr = 0;
        while (true) {
            System.out.print("入場者数入力：");
            int entry = scan.nextInt();
            if (entry < 0) {
                System.out.println("入場者数:" + curr + "名で閉め切りました。");
                break;
            }
            if (curr + entry > cap) {
                if (curr == cap) {
                    System.out.println("入場者数:" + curr + "名で閉め切りました。");

                } else {
                    System.out.println("最後の" + entry + "名は入場できません。");
                    System.out.println("入場者数:" + curr + "名で閉め切りました。");
                }
                break;
            }
            curr = curr + entry;
            System.out.println("現在入場者数:" + curr + "名");
            if (curr == cap) {
                System.out.println("入場者数:" + curr + "名で閉め切りました。");
                break;
            }

        }
        scan.close();
    }
}
