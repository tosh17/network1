/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.network1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shcherbakov
 */
public class NetDeviceTest {
    

    @Test
    public void testGetName() {
        System.out.println("getName");
        NetDevice instance = new NetDevice("test",34);
        String expResult = "test";
        String result = instance.getName();
        assertEquals(expResult, result);
     }

    
}
