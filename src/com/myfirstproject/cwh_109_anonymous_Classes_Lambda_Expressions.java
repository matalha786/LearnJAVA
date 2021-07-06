package com.myfirstproject;
@FunctionalInterface
interface DemoAno{
    void meth1(int a,int b);
//    void meth2();
}
@FunctionalInterface
interface  ifdeemo2{
     void meth1();
}

interface  ifdeemo{
    public void meth1();
    public void meth2();
}

class  ifdem implements ifdeemo2{

    @Override
    public void meth1() {
        System.out.println("I am method 1");
    }
}
public class cwh_109_anonymous_Classes_Lambda_Expressions {
    public static void main(String[] args) {
        // Anonymous  Class
        ifdeemo ifd = new ifdeemo() {
            @Override
            public void meth1() {
                System.out.println("I am meth 1");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth 2");
            }
        };
        ifd.meth1();
        ifd.meth2();
    // Lambda Expression
        ifdeemo2 ifd2 = new ifdem();
//        ifdem ifd3 = new ifdeemo2(); --> // Not Allowed
        ifd2.meth1();

        // 2nd Method which is  Lambda Expression
        ifdeemo2 ifd3= () ->{ System.out.println("I am method 2  2nd Method which is  Lambda Expression"); };
        ifd3.meth1();
        DemoAno obj = (a,b)->{System.out.println("I am method 1 from this lambda " + a+b);};
            obj.meth1(3,7);




    }

}
