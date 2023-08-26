import java.util.*;

public class Stacks {
    // Stack stores objects into a sort of "vertical tower"
    // LIFO data structure means Last In First Out..
    // ++ LIFO = the bottom of the stack is the first one to be added, but the top object will be the first one to get removed
    // ++ to access objects on the bottom, you need to remove the objects at the top using stack.pop(object)

    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();

        // stack.push(object) is used to add or push an object into the top of the stack
        stack.push("Minecraft"); // first one added, means this will be at the bottom of the stack
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        /*/ here's the current stack arrangement:

         ----------------
        |     FFVII      |
        |   Borderlands  |
        |     DOOM       |
        |     Skyrim     |
        |   Minecraft    |
         ----------------

        */

        // stack.empty() is to check if the stack is empty
        System.out.println("Is the stack empty? " + stack.empty());

        // prints all the stack that you added and created in an order from bottom (minecraft) to top (FFVII)
        System.out.println("This is the current stack: " + stack);

        /*/ you dont have to write the object inside () of stack.pop() because it will always remove the top first (LIFO)
        stack.pop(); // remove FFVII first
        stack.pop(); // then Borderlands
        stack.pop(); // then DOOM
        stack.pop(); // then Skyrim
        stack.pop(); // Lastly, Minecraft
         */

        String convertThePoppedOutStackIntoString = stack.pop(); // converts the popped out/removed object into string and assigns it to the convertThePoppedOutStackIntoString variable
        System.out.println("This is the removed/popped Stack: " + convertThePoppedOutStackIntoString); // this will print the object that was popped out from the stack
        System.out.println("This is the updated stack: " + stack);

        // stack.peek() to check or see what the topmost object is without removing it
        System.out.println("This is the current object on the top of the stack: " + stack.peek());

        // stack.search() is to search for an object within the stack and check what is the object's order in number
        System.out.println("Which stack is \"Skyrim\" located? " + stack.search("Skyrim"));

        /*/
        Note: It is possible to run out of memory in stacks

        Uses of Stacks:
        - Undo/Redo features in text editors
        - Moving back/forward through browser history
        - Backtracking algorithms (maze, file directories)
        - Calling functions (call stack)
         */


    }
}
