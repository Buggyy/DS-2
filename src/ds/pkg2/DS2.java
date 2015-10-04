/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Omer Z 500.. & Stefan Lobato [IS204] 500707274
 */
public class DS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        for (int i = 0; i < 20; i++) {
//            Student n = new Student();
//            System.out.println(n.generateCijfer());
//        }

        Handler handler = new Handler();

        handler.createStudents(10);

        ArrayList allStudents = handler.getStudents();

        for (int i = 0; i < allStudents.size(); i++) {
            System.out.println(allStudents.get(i).toString());
        }

    }

}
