package Test;
class Test8returnA{
    public  static void main(String[] args){
        Test8 obj = new Test8(10);
        Test8 obj1;
        obj1 = obj.ickremA(11);
        System.out.println("obj.a: "+obj.a);
        System.out.println("obj1.a: "+obj1.a);
        obj1 = obj1.ickremA(11);
        System.out.println("obj1.a: "+obj1.a);

    }
}

public class Test8 {
    int a;

    Test8(int itsA){
        this.a=itsA;
    }
    Test8 ickremA(int temp){
        Test8 test = new Test8(a+temp);
        temp = 11;
        return test;
    }
}
