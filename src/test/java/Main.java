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
        LibTool libTool = new LibTool("a074ea580fb9ff84bc43eeaefcab4f63");

        libTool.addSeat("11251","37","8")
                .setDate("2022-01-01 17:15:59.000")
                .start();
        System.out.println("111");
    }
}
