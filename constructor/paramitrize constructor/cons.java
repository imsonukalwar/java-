
    class cl{
        public cl(String name){
            System.out.println(name);
        }
        public cl(int n){//here we are doing constructor overloading with diff arguement
            System.out.println(n);
        }
        public cl(char t){
            System.out.println(t);
        }
    }
    public class cons{
    public static void main(String[] args) {
        cl c=new cl("sonu");
        cl c2=new cl('t');
        cl c3=new cl(3);


    }
}