
public class inheritance {
    public class Animal{
        void eat(){
            System.out.println("Animal is eating-->");
        }
    }
     public class iherite extends Animal{
       public  void barck(){
            System.out.println("dog is barcking");
        }
    }
    public static void main(String[] args) {
        inheritance obj=new inheritance();
        // iherite obj=new iherite();//if you crete a static class then there is no need to make object of maim class (as reference)
        // obj.eat();
        // obj.barck();
        iherite ob2=obj.new iherite();
        ob2.eat();
        ob2.barck();
    }
}
