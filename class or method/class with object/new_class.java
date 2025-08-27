public class new_class {
    static class employee{
        String name;
        int id;
        int salary;
        String branch;
    
    public void see_detail(){
        System.out.println("empolyee namr is--"+name);
        System.out.println("employee "+name+" id is--"+id);
        System.out.println("employee  "+name+" his branch is--"+branch);
    }
    public int getsalary(int salary){
        return salary;
    }
}

    public static void main(String[] args) {
        employee e1=new employee();
        employee e2=new employee();
        e1.name="sonu kalwar";
        e1.id=1234;
        e1.branch="mnc_A";
        e1.salary=80998;
        e2.name="Aashish kumar";
        e2.id=1268;
        e2.branch="mnc_B";
        e2.salary=70998;
        e1.see_detail();
        System.out.println("sallary of sonu -"+e1.getsalary(e1.salary));
        System.out.println();
        e2.see_detail();
        System.out.println("sallary of aashish -"+e2.getsalary(e2.salary));
    }
}
