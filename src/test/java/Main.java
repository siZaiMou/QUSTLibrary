import fun.liutong.LibTool;

/**
 * @ClassName: Main
 * @Description: 测试
 * @Author: 刘通
 * @Date: 2020/1/29 15:21
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        LibTool libTool = new LibTool("44fbed26fc5592a8e285ad5a80fb1370");

        libTool.addSeat("11251","37","10")
                .setDate("2022-01-01 18:45:59.000")
                .start();
        System.out.println("111");
    }
}
