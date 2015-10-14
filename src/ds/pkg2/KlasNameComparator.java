/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import java.util.Comparator;

/**
 *
 * @author Omer
 */
public class KlasNameComparator implements Comparator<Klas> {

            @Override
            public int compare(Klas k1, Klas k2) {
                if ( k1.getNaam().compareTo( k2.getNaam() ) < 0) {
                    return -1;
                }
                if ( k1.getNaam().compareTo( k2.getNaam() ) > 0 ) {
                    return +1;
                } else {
                    return 0;
                }
            }

    }
