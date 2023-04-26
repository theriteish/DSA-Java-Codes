public class InnerClasses {
   static public class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        InnerClasses a = new InnerClasses();
        Test b = new Test("ritesh");

    }
}
