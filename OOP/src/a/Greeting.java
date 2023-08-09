package a;
import mypack.*; // importing the package: mypack  using packagename.*;
import a.n.UsingDot; // importing the packae a.n.UsingDot using .ClassName;
public class Greeting {
    public static void main(String[] args) {
         // Making the object of the GreetingA
       GreetingA greet = new GreetingA();
       greet.Msg();

       //Making the object of the UsingDot class
        UsingDot msg = new UsingDot();
       msg.GreetingB();

    }
}
