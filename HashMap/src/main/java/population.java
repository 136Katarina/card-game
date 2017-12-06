import java.util.HashMap;
import java.util.Set;


public class population {

    public static void main(String[] args) {
        HashMap<String, Integer> countries = new HashMap<>();

        countries.put("UK", 64100000);
        countries.put("Germany", 80620000);
        countries.put("France", 66030000);
        countries.put("Japan", 127300000);

        System.out.println(countries.get("Japan"));
        System.out.println(countries.containsValue(66030000));
        System.out.println(countries.values());


        Set keyset=countries.keySet();

        System.out.println("Key set values are: " + keyset);
    }

}
