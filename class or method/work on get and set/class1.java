public class class1 {
    static class employee{
        int salry;
        String name;
        public  int get_sallary(int salary){
            return salary;
        }
        public  String getName(){
            return name;
        }
        public void setname(String n){
            name=n;
        }
    }
    public static void main(String[] args) {
        employee e1=new employee();
        e1.setname("sonu");
        e1.salry=343545;
        e1.setname("sonu");
        System.out.println(e1.getName());
        System.out.println(e1.get_sallary(e1.salry));
    }
}
