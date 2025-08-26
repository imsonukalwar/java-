
//let's see how constructor is benefiaceal to us


// public class contructor {
//    static class employee{
//     String name;
//     int id;
//     }
//     public static void main(String[] args) {
//         employee e1=new employee();
//         employee e2=new employee();
//         e1.name="sonu";//1
//         e1.id=1234;//2
//         e2.name="aashish";//3
//         e2.id=1543;//4
//         System.out.println("employee -"+e1.name+" id is-"+e1.name);
//         System.out.println("employee -"+e2.name+" id is-"+e2.name);
//     }
// }
//we are writting 1,2,3,4 these line is extra line 
//if we don't want to write extra line 1234 use constructor
//let's check example

public class contructor{
    static class employee{
        String name;
        int id;
        public employee(String n,int i){
            name=n;
            id=i;
            System.out.println(name);
            System.out.println(id);
        }
    }
    public static void main(String[] args) {
        employee e1=new employee("sonu", 1234);
        employee e2=new employee("aashish", 64532);
    }
}
