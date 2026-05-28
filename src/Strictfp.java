
//strictfp keyword is applicable to classes , methods , interfaces , abstract classes,we can also apply strictfp to a class that contains an abstract method in Java.
//classes and methods
//public strictfp class Strictfp {
//    public static void main(String[] args) {
//        show();
//    }
//    public static strictfp void show (){
//        System.out.println("Hello ");
//    }
//}
////abstract classes
//abstract class Abc{
//    public static strictfp void show(){
//
//    }
//    public static void main(String [] args){
//        show();
//    }
//}
////interfaces
//interface Xyz{
//    static void show(){
//
//    }
//    public static void main(String [] args){
//        show();
//    }
//}
////we can also apply strictfp to a class that contains an abstract method in Java.
//strictfp abstract class StrictFp {
//    public static void main(String[] args) {
//        show();
//    }
//    public static strictfp void show (){
//        System.out.println("Hello ");
//    }
//    public abstract void showw(); //we cannot create abstract method without abstract class
//}
//
//
//// but cannot be applied to constructor , abstract methods , variables
////abstract method
//abstract class Abcd{
//    public abstract strictfp void show(); //abstract and static illegal combination
//
//    public static void main(String [] args){
//       strictfp int x = 10;
//    }
//    strictfp Abcd(){ //no return type in constructor
//
//    }
//}
//interface Wxyz{
//    static void show(){
//
//    }
//    public static void main(String [] args){
//        show();
//    }
//}
