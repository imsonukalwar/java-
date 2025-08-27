
public class custum_class{
    static class employee{  //if we not write static then you uncomment
    int id;
    String employe_name;
    int roll_n;
    }
    public static void main(String[] args) {
        // custum_class outer=new custum_class();
        // employee name=outer.new employee();
        employee name=new employee();
        name.id=176;
        name.roll_n=13;
        name.employe_name="sonu";
        System.out.println(name.id);
        System.out.println(name.employe_name);
        System.out.println(name.roll_n);
    }
}