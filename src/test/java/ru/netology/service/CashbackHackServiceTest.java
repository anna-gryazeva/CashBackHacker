package ru.netology.service;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test
    public void remainWithCb() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

}
