package aimrez.method;

public class A {

int age;
String name;
int height;

public A(String name, int age){
    this.name=name;
    this.age=age;
    name = this.name;
    height =6;
}
    public static int sum(int a,int b) {
        return a+b;
    }
    public void persion(){
        System.out.println("Hello"+name + age);
    }
}


