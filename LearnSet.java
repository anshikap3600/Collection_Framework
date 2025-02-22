import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        // Set does not contain Duplicate values and do not need to maintain order of elements
        Set<Integer> set = new HashSet<Integer>();
        set.add(456);
        set.add(467);
        set.add(199);
        set.add(345);
        System.out.println(set);

        Set<String> st = new LinkedHashSet<>();
        st.add("Anshika");
        st.add("Pawar");
        st.add("Raksha");
        st.add("Pawar");
        System.out.println(st);
        st.remove("Pawar");
        System.out.println(st);

        Set<Integer> s = new TreeSet<>();
        s.add(23);
        s.add(20);
        s.add(45);
        s.add(11);
        System.out.println(s.contains(20));
        for(Integer e : s) {
            System.out.println("the element is : "+e);
        }
    }
}
