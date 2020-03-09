package Test;



public class Test10String {
    public static void main(String[] args){
        String string1 = "first string";
        String string2 = "second string";
        String string3 = string1+ string2;
        System.out.println("length of string1 :"+string1.length());
        System.out.println("Char of 3 string 1"+string1.charAt(3));
        if(string1.equals(string2))
            System.out.println("str1 == str2");
        else
            System.out.println("str1 != str2");
        if(string1.equals(string3))
            System.out.println("str1 == str3");
        else
            System.out.println("string1 != str3");

        int n1[] = {15};
        int n2[] = {1,2,45};
        int n3[] = { };
        Test10array t1 = new Test10array();
        t1.vaTest10(n1);
        t1.vaTest10(n2);
        t1.vaTest10(n3);
    }
}
class Test10array{
    public static void vaTest10(int v[]){
        System.out.println("Количество аргументов: "+ v.length+ " Содержимое");
        for(int x:v)
            System.out.println(x+" ");
            System.out.println();
    }
}
