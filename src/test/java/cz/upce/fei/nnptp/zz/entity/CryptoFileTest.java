/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.upce.fei.inptp.zz.entity;

import java.io.File;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Roman
 */
public class CryptoFileTest {
    
    public CryptoFileTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of readFile method, of class CryptoFile.
     */
    @Test
    public void testReadFile() {
        System.out.println("readFile");
        File file = null;
        String password = "";
        String expResult = "";
        String result = ""; //CryptoFile.readFile(file, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of writeFile method, of class CryptoFile.
     */
    @Test
    public void testWriteFile() {
        System.out.println("writeFile");
        File file = null;
        String password = "";
        String cnt = "";
        //CryptoFile.writeFile(file, password, cnt);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}