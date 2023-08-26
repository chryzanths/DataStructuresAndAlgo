import java.util.LinkedList;

public class LinkedLists
{
    public static void main(String[] args){

       /*


        */

        //name of our doubly LinkedList is "thisList"
        LinkedList<String> thisList = new LinkedList<String>();

        // thisList.push() is to add elements or data to our LinkedList
        thisList.push("A"); // [A]
        thisList.push("B"); // [B, A]
        thisList.push("C"); // [C, B, A]
        thisList.push("D"); // [D, C, B, A]
        thisList.push("F"); // [F, D, C, B, A]

        /*
        Current arrangement of elements:

        [F, D, C, B, A]

        */

        System.out.println("Current elements in the LinkedList: " + thisList);

    }
}
