package com.ixaut.JunitMaven;

import org.junit.jupiter.api.Test;

public class Maintest
{
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
}
