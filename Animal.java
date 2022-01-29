package krishna;
public class Animal {
void drink(){System.out.println("drink");}
}
class Cat extends Animal{
void walk(){System.out.println("walk");}
}
class BabyCat extends Cat{
void eat(){System.out.println("eat");}
}
class TestInheritance2{
public static void main(String args[]){
BabyCat c=new BabyCat();
c.drink();
c.walk();
c.eat();
}
}