import java.util.ArrayList;

public class River {

    private String name;
    private ArrayList<Salmon>river;

    public River(String InputName) {
        this.name = InputName;
        this.river = new ArrayList<>();
    }



    public int getSalmonCount() {
        return this.river.size();
    }


    public void addSalmon(Salmon mySalmon) {
        this.river.add(mySalmon);
    }

//    River myRiver = new River("My river name");
//
//    Salmon myTestSalmon = new Salmon("jn")
//    myRiver.addSalmon(SmyTestSalmon)


    public Salmon removeSalmon() {
        return this.river.remove(0);
    }


}
