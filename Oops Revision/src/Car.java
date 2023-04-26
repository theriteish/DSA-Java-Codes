public class Car {
    //Static -> it belongs to Class not to object
    String color;
    int modelNum;
    static String car_company = "Mahindra";
    static int count = 0;

    public Car(){
        count++;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "blue";

        Car c2 = new Car();
        c2.color = "Silver dust";

        System.out.println(c1.car_company);
        System.out.println(c2.car_company);
    }
}


