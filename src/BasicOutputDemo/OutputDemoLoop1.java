package BasicOutputDemo;

public class OutputDemoLoop1 {
    public static void main(String[] args) {
//        demo1();
//          demo2();
//        demo3();
        demo4();

    }

    /**
     *Output Result:
     * 20
     * */
    static  void demo1(){
        int i;
        for(i=5;i>10;i++)
            System.out.println(i);
            System.out.println(i*4);
    }
    /**
     *Output Result:
     * 42
     * */
    static void demo2(){
        int i;
        for(i=5;i>=1;i--){
            if(i%2==1)
                continue;
            System.out.print(i);
        }
    }
    /**
     *Output Result:
     * 10
     * 8
     * 6
     * 4
     * 2
     * */
    static void demo3(){
        int i=10;
        for(;;){
            System.out.println(i);
            i-=2;
            if(i<=0)
                break;;
        }
    }

    /**
     *Output Result:
     * All examples are running infinite loop
     * */
    static void demo4(){
        int i =1;
        while (true){
            i++;
        }
//        boolean result = true;
//        int f;
//        while(result){
//            f=1;
//        }
//        for(;;){
//
//        }

//        int y,x=0;
//        do{
//            y=x;
//        }while(x==0);
    }
}
