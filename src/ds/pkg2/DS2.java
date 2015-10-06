/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class DS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //  Create new KlasHandler & StudentHandler
        KlasHandler klasHandler = new KlasHandler();
        StudentHandler studendHandler = new StudentHandler();

        //  Create students
        studendHandler.createStudents(10);
        //  Retrieve array with students
        //  At this point we only got an array with studentnumbers
        ArrayList allStudents = studendHandler.getStudents();

        //  
        klasHandler.calculateClass(allStudents);

        klasHandler.getAllClasses();
        studendHandler.getAllStudents();

    }

}
