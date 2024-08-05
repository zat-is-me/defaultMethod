package defaultMethod;

/**
 * @author Tatek Ahmed on 2/16/2022
 **/

public interface Right {
    default void m(){
        System.out.println("From right");
        System.out.println("This is from right branch!");
        
        System.out.println("Right branch version 10!");
                
    }
}
