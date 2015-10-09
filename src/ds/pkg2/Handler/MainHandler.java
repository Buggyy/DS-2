package ds.pkg2.Handler;

import ds.pkg2.Klas;
import ds.pkg2.Student;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Stefan Lobato [IS204] 500707274
 */
public class MainHandler {

    private final ArrayList<Klas> filled = new ArrayList<>();

    /**
     *
     * Fill Klas object with students
     *
     * @param studArr
     * @param klasArr
     * @return
     */
    public ArrayList<Klas> studentInKlas(ArrayList<Student> studArr,
            ArrayList<Klas> klasArr) {

        int counter = 0;

        for (Student studArrObject : studArr) {
            if (counter < klasArr.size()) {
                studArrObject.setKlas(klasArr.get(counter));
                klasArr.get(counter).addStudent(studArrObject);

                counter++;

                if (counter == klasArr.size()) {
                    counter = 0;
                }
            }
        }

        for (int i = 0; i < klasArr.size(); i++) {
            filled.add(klasArr.get(counter));

        }

        return klasArr;
    }

    public ArrayList<Klas> getFilled() {
        return filled;
    }

    private static final Logger LOG = Logger.getLogger(MainHandler.class.getName());

}
