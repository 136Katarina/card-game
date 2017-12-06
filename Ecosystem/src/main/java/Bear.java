import java.util.ArrayList;

public class Bear {

    private String name;
    private ArrayList<Salmon> belly;

    public Bear(String inputName){
        this.name = inputName;
        this.belly = new ArrayList<>();
    }

    public int foodCount() {
        return this.belly.size();
    }

    public void eat(River river1) {
        Salmon salmon1 = river1.removeSalmon();
        this.belly.add(salmon1);
;    }

    public void sleep(){
        this.belly.clear();
    }
}
