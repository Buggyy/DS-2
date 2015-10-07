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

        for (Student studArr1 : studArr) {
            if (counter < klasArr.size()) {
                studArr1.setKlas(klasArr.get(counter));
                klasArr.get(counter).addStudent(studArr1);
                counter++;
                if (counter == klasArr.size()) {
                    counter = 0;
                }
            }
        }

        return klasArr;
    }
    private static final Logger LOG = Logger.getLogger(MainHandler.class.getName());

}
