/*Method --> Any task or activity if we want to perform then we use method.
    1. It has name 
    2. It has body 
    3. It has parameters
    4. It has return type


Main Method -  public static void main(String[] args) Main method is a starting point of the program. JVM is coded such a way that when it 
           start execution first it will search main only. 
main --> It is a name and jvm search for this name only           
void --> It is a return type (Java main method not return anything)
static --> To make the method is accessible without creating an object.
public --> It is an access modifier, to increase visibility of the method across the project.
(String[]  args) --> It is a paramter in java for the purpose of receive command line arguments (data/information) during the execution
                     from the commandprompts. Whether we pass argument or not pass argument we must write it parameters are compulsary.
                     Inside String[] we can pass any type of data but internally it will be stored as string only.
 */

public class Launch{
    public static void main(String[] args){
        System.out.println("INeuron");
        System.out.println(args[0]);
        System.out.println(args[1]);


    }
}