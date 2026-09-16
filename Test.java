public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        if(a == 1){
            System.out.println("hello");
        }
        //重复代码 sonarCloud会检出重复
        if(a == 1){
            System.out.println("hello");
        }
        int unusedVar = 999; //未使用变量，代码异味
    }
}
