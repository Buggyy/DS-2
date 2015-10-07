package ds.pkg2;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class School {

    ArrayList<Klas> school = new ArrayList<>();

    /**
     *
     */
    public School() { }

    /**
     *
     * @return
     */
    public ArrayList<Klas> getSchool() {
        return school;
    }

    /**
     *
     * @param klas
     */
    public void addKlas(Klas klas) {
        this.school.add(klas);
    }
    
    private static final Logger LOG = Logger.getLogger(School.class.getName());

}
