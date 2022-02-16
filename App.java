package defaultMethod;

/**
 * @author Tatek Ahmed on 2/16/2022
 **/

public class App implements Left,Right{

    //ways of calling default method
//    @Override
//    public void m() {
//       System.out.println("from override");
//    }
//    @Override
//    public void m() {
//        Left.super.m();
//    }
    @Override
    public void m() {
        Right.super.m();
    }

    public static void main(String[] args) {
        App app = new App();
        app.m();
    }
}
