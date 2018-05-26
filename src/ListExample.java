import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static  void main(String[] args) {
        List myList = new ArrayList();

        myList.add("Ele1");
        myList.add("Ele2");
        myList.add("Ele3");
        //Important to note that elements are stored in the order they are added Ele1->Ele2->Ele3 ect

        for(Object next : myList){
            //use a forloop for each element in the list will be bound to the "next" variable
            System.out.println(next);
        }









    }

}
