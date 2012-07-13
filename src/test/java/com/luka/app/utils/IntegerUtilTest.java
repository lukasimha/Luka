package com.luka.app.utils;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class IntegerUtilTest {

    @Test
    public void parseAValidInteger() {
        int actualInteger = IntegerUtil.safeParseInt("1");

        assertEquals(1, actualInteger);
    }

    @Test
    public void parseAnInvalidInteger() {
        int actualInteger = IntegerUtil.safeParseInt("a");

        assertEquals(0, actualInteger);
    }
}
