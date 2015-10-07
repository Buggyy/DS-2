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

//        for (int i = 0; i < studArr.size(); i++) {
//            studArr.get(i).setKlas(klasArr.get(i));
//
//        }
        for (int i = 0; i < klasArr.size(); i++) {
            klasArr.get(i).addStudent(studArr.get(i));
            klasArr.get(i).addStudent(studArr.get(i + 1));
        }

        return klasArr;
    }

}
