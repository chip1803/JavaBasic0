package LAtester.com.javabasic.valiable;

public class LearningValiable {
 static   int age = 24; //biến toàn cục
    static int number = 20;
    public static void sayHello() {
        int n = 10;      // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
    }
    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(number);
    //Cách1:
        LearningValiable abc = new LearningValiable();
        abc.sayHello();
        //Cách2:
        sayHello();
    }
}
