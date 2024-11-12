public class Sample3_9 {
    public static void main(String[] args) {
        Car9 car1;
        car1 = new Car9();

        car1.num = 1234;
        car1.gas = -10;

        car1.show();
    }
}

class Car9 {
    int num;
    double gas;

    void show() {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }
}
