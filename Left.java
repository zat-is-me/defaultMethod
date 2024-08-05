package defaultMethod;

/**
 * @author Tatek Ahmed on 2/16/2022
 **/

public interface Left {
    default void m(){
        System.out.println("From left");
        System.out.println("Commiting from third branch: ");
        System.out.println("This is from left editted by second branch");
        System.out.println("The confilict between the branch has been resolved! ");
        System.out.println("This is from left branch! ");

        System.out.println("Left branch version 10!");
        System.out.println("Left branch version 11!");
        System.out.println("Left branch version 12!");
        System.out.println("Left branch version 13!");
    }
}
