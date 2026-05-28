public class BBabstractInterface {
    int a = 10;
}
class testing extends BBabstractInterface{
    {
        this.a = 20;
    }
}
class testing2 extends BBabstractInterface{

}
interface Polygon{
    int getTotalSides();
}
interface Quadrilatral{
    float lenght();
    float bredth();
}
class Rectangle implements Quadrilatral ,Polygon{
    @Override
    public int getTotalSides() {
        return 4;
    }

    @Override
    public float bredth() {
        return 0;
    }

    @Override
    public float lenght() {
        return 0;
    }
}
class Main{
    public static void main(String[] args) {
        testing2 obj = new testing2();
        testing obj2 = new testing();// jab tak testing ka object nahi banega tab tak 'a' ke liye joki ek variable hai, uske liye memory allot nahi hogi.[Objects hi memory allocate krte hai]
        System.out.println(obj2.a);

    }
}
