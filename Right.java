package defaultMethod;

/**
 * @author Tatek Ahmed on 2/16/2022
 **/

public interface Right {
    default void m(){
        System.out.println("This is from right");
    }
}
