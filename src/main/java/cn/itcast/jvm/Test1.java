package cn.itcast.jvm;

public class Test1 {

    public int add(){
        int a = 1;
        int b = 2;
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        int result = test1.add();
        System.out.println(result);
    }

}
