package com.ixaut.JunitMaven;

import org.junit.jupiter.api.*;

//JUnit 5

public class Maintest
{
    @BeforeAll
    public static void begin()
    {
        System.out.println("BeforeALL...");
    }

    @BeforeEach
    public void be()
    {
        System.out.println("BeforeEach...");
    }

    @Test
    public void testAdd1()
    {
        assert(2 == new Main().add(1,1));
    }

    @Test
    public void testSub()
    {
        assert(1 == new Main().sub(2,1));
    }

    @AfterEach
    public void en1()
    {
        System.out.println("AfterEach...");
    }

    @AfterAll
    public static void end()
    {
        System.out.println("AfterALL...");
    }
}
