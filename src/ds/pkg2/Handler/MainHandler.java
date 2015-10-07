package ds.pkg2.Handler;

import ds.pkg2.Klas;
import ds.pkg2.Student;
import java.util.ArrayList;

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

        for (int i = 0; i < studArr.size(); i++) {
            if (counter < klasArr.size()) {
                studArr.get(i).setKlas(klasArr.get(counter));
                klasArr.get(counter).addStudent(studArr.get(i));

                counter++;
                if (counter == klasArr.size()) {
                    counter = 0;
                }
            }

        }

        return klasArr;
    }

}
