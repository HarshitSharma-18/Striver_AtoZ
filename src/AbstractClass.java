abstract class Abstractclass {

    abstract void show();
    abstract int show2();
}
abstract class Childclass extends Abstractclass{
    @Override
    public void show() {

    }
}
class Anotherchildclass extends Childclass{ //if we are extending the class which has 3 abstract methods then the 3 abstract method should be implemented in every child class.
    @Override
    public int show2(){
        return 9;
    }
}
//Real world example of abstract class
abstract class Vehicle{
    int a = 10;
    abstract int noofwheels();
}
class Bus extends Vehicle{
    {
       a = 20;
    }

    int noofwheels(){
        return 6;
    }
}
class Mercedes extends Vehicle{
    int noofwheels(){
        return 4;
    }
}
class Auto extends Vehicle{
    int noofwheels(){
        return 3;
    }
}
public class AbstractClass{
    public static void main(String[] args) {
        Bus obj = new Bus();
        Mercedes M = new Mercedes();
        System.out.println(M.noofwheels());
        System.out.println(obj.a);
    }
}