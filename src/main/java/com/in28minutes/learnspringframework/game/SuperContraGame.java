package src.main.java.com.in28minutes.learnspringframework.game;

public class SuperContraGame implements GamingConsole{
    public void up(){
        System.out.println("up");
    }

    public void down(){
        System.out.println("Sit douwn");
    }

    public void left(){
        System.out.println("Go back");
    }

    public void right(){
        System.out.println("Shoot a bullet");
    }
}
