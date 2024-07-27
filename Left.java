package defaultMethod;

/**
 * @author Tatek Ahmed on 2/16/2022
 **/

public interface Left {
    default void m(){
        System.out.println("This is from left editted by second branch");
    }
}
