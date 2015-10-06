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

        //  Create students with an amount
        studendHandler.createStudents(10);

        ArrayList allStudents = studendHandler.getStudents();

        
        for (int i = 0; i < 20; i++) {
            Klas k = new Klas("T", i);
            System.out.println(k.toString());
        }
        
        klasHandler.calculateClass(allStudents);
        
        klasHandler.printAllClasses();
        
    }

}
