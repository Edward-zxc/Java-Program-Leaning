package finalJavaPredict;

import java.util.Scanner;

/**
 * @author 33133
 * @see 2..在以下Test类中添加一个main方法，在其中通过键盘输入获取用户输入的一个整数，
 * 并使用switch-case语句按以下对应关系输出结果。
 * 输入0:不满意
 * 输入1:十分满意
 * 输入2:满意
 * 输入3:基本满意
 * 输入其他:我要投诉!
 */
public class SwitchCaseWithBreak {
    public static void main(String[] args) {
        System.out.println("Please input an integer number :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String str;
        switch(number){
            case 0:
            str = "不满意";
            break;
            case 1:
            str = "十分满意";
            break;
            case 2:
            str = "满意";
            case 3:
            str = "基本满意";
            default:
            str = "我要投诉";
        }
        System.out.println(str);
        scanner.close();
    }
}
