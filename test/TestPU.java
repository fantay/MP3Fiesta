/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.persistence.Persistence;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Laurent-LIM
 */
public class TestPU {

    @Before
    public void avant() {

        Persistence.createEntityManagerFactory("PU");

    }

    @Test
    public void test() {
    }

}
