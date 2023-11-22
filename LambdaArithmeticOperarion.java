package com.cg.lambda;

@java.lang.FunctionalInterface
interface Lambda{

    double operation(int a,int b);
}
public class LambdaArithmeticOperarion {

    Lambda lambda1 = (int a, int b) -> {

        return a+b;

    };
    Lambda lambda2 =(int a,int b) ->{

        return a-b;
    };
    Lambda lambda3 =(int a,int b) ->{

        return a*b;
    };
    Lambda lambda4 = (int a,int b) ->{

        return a/b;
    };
    public static void main(String[] args) {

        LambdaArithmeticOperarion la=new LambdaArithmeticOperarion();
        System.out.println(la.lambda1.operation(5,6));
        System.out.println(la.lambda2.operation(9,54));
        System.out.println(la.lambda3.operation(78,5));
        System.out.println(la.lambda4.operation(50,8));
    }
}

