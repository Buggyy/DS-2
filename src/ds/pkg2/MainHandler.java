/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Stefan Lobato [IS204] 500707274
 */
public class MainHandler {

    /**
     *
     * Give student a class
     *
     * @param studArr
     * @param klasArr
     */
    public void studentInKlas(ArrayList<Student> studArr,
            ArrayList<Klas> klasArr) {

        for (int i = 0; i < klasArr.size(); i++) {
            studArr.get(i).setKlas(klasArr.get(i));

        }

    }

}
