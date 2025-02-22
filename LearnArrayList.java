import java.util.List;
import java.util.ArrayList;
public class LearnArrayList {
    public static void main(String[] args){
          /* List<String> list = new ArrayList<String>();
           list.add("Delhi");
           list.add("Mumbai");
           list.add( "Pune");
        System.out.println(list);
        list.add(3, "Chennai");
        System.out.println(list);
         List<String> newlist = new ArrayList<String>();
         newlist.add("Sonam");
         newlist.add("Anshika");
        System.out.println(list.addAll(newlist));*/

        // Duplicates values are Allowed in Arraylist and list
        List<Integer> li = new ArrayList<>();
        li.add(101);
        li.add(102);
        li.add(105);
        for(int i = 0 ; i < li.size(); i++){
            System.out.println("the element is " + li.get(i));
        }

        System.out.println(li);
        li.remove(Integer.valueOf(101));
        System.out.println(li);
       // li.clear();
        System.out.println(li);
        li.set(0,1000);
        System.out.println(li);
        System.out.println(li.get(0));


    }
}
