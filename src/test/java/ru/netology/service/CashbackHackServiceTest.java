package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void remainWithCb() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void boundaryValueCb1(){
        CashbackHackService service = new CashbackHackService();

        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual,expected);
    }
    @Test
    public void boundaryValueCb2() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @Test
    public void boundaryValueCb3() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }
}
