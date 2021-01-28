import java.util.Scanner; // 引入输入模块

public class d5 {
    public static void main(String[] args) {
        // 输入年龄
        Scanner s = new Scanner(System.in);
        System.out.print("请输入年龄：");
        int age = s.nextInt();
        if (age > 12) {
            System.out.println("可以骑车");
            if (age > 16) {
                System.out.println("可以骑电动车");
            }
        } else {
            System.out.println("不可以骑车");
        }
    }
}
