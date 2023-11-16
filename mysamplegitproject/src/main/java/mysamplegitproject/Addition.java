package mysamplegitproject;

public class Addition{
    String College="JCET";//to print instance variable
    public  void addTwoNumber(){
        int a=20,b=30;
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String args[]){
        Addition a =new Addition(); //created object//
        a.addTwoNumber();//calling method
        System.out.println(a.College);
    }
}
