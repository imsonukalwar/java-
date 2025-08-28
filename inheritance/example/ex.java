public class ex {
    public class Animal {
        private String name;
        private String color;
        public String getName() {
            return name;
        }
        public void setName(String n) {
            this.name = n;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String c) {
            this.color = c;
        }
    }
    public class Animal2 extends Animal {
        public String displayInfo() {
            return "Name: " + this.getName() + ", Color: " + this.getColor();
        }
    }
    public static void main(String[] args) {
        ex ex = new ex();
        Animal2 obj = ex.new Animal2();//if you not want to create main class object then simly make othe class -->static class
        obj.setName("Dog");
        obj.setColor("Brown");
        System.out.println(obj.displayInfo());
    }
}
