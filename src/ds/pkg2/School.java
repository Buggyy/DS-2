package ds.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class School {

    ArrayList<Klas> school = new ArrayList<>();

    public School() { }

    public ArrayList<Klas> getSchool() {
        return school;
    }

    public void addKlas(Klas klas) {
        this.school.add(klas);
    }

}
