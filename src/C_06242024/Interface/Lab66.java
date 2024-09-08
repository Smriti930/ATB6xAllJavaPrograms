package C_06242024.Interface;

public class Lab66 {

}
interface I1{

        }

        interface I2{

        }
class A{}
class B{}
abstract class C{}
class Test1 extends A{}//Single Inheritance
class Test2 extends B{}
//class Test3 extends A,B{}//multiple inheritance is not allowed
class Test4 implements I1,I2{}
class Test5 extends A implements I1,I2{}
//class  Test6 implements I1 extends A{}
//interface  I3 extends  A{}
//interface  I4 implements A{}
//interface  I5 extends  A,B{}
interface I6 extends I1,I2{}




