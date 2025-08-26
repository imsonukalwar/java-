public class example {
    static class animal{
        String name;
        String color;
        public void property(String n,String c){
            name=n;
            color=c;
        }
        public void display(){
            System.out.println("animal name is-"+name);
            System.out.println(name+" color is-"+color);
        }
    }
    public static void main(String[] args) {
        animal buzzo=new animal();
        buzzo.name="dog";
        buzzo.color="red";
        buzzo.display();
    }
}
