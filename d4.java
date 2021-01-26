import java.util.Scanner; // 引入输入模块

public class d4 {
    public static void main(String[] args) {
        /*数组操作*/ 
        String[] a = new String[3]; // 定义一个长度为3的字符串数组
        a[0] = "mum"; // 第一个
        a[1] = "dad"; // 第二个
        a[2] = "me"; // 第三个
        System.out.println(a[2]); // 打印出索引为二对应的字符
        System.out.println(a.length); // 打印数组长度

        /*输入输出*/ 
        System.out.println("你好" + "世界"); // 输出
        Scanner sc = new Scanner(System.in); // 创建一个输出
        System.out.print("请输入英文名："); // 提示词
        String name = sc.nextLine(); // 读取输入
        System.out.println("你好," + name); // 打印输入
    }
}
