package com.pvt;

import static com.pvt.App.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import org.junit.jupiter.api.Test;
public class AppTest{
   @Test
    public void getTypeLineTest() {

        assertAll("typeLineTest",
                () -> assertEquals("Строка-номер телефона", getTypeLine("213-12-22")),
                () -> assertEquals("Строка-email", getTypeLine("alexey022@mail.ru")),
                () -> assertEquals("Строка-номер", getTypeLine("131231")),
                () -> assertEquals("Строка-фамилия", getTypeLine("Yemelyanov")),
                () -> assertEquals("Строка не подпала ни под один образец", getTypeLine("yemelddf123423423yanov")),
                () -> assertEquals("Строка по умолчанию", getTypeLine("")));
    }
}
