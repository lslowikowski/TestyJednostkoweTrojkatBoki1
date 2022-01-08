package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TrojkatBokiTest {

    @Test
    void bokANieMozeBycUjemny() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(3, 4, 5);
        trojkatBoki.setBokA(-3);
        Assertions.assertEquals(3, trojkatBoki.getBokA());
    }

    @Test
    void bokBNieMozeBycUjemny() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(3, 4, 5);
        trojkatBoki.setBokB(-4);
        Assertions.assertEquals(4, trojkatBoki.getBokB());
    }

    @Test
    void bokCNieMozeBycUjemny() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(3, 4, 5);
        trojkatBoki.setBokC(-5);
        Assertions.assertEquals(5, trojkatBoki.getBokC());
    }

    @Test
    void wartosciWKonstruktorzeNieMogaBycUjemne() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(-3, -4, -5);
        Assertions.assertEquals(3, trojkatBoki.getBokA());
        Assertions.assertEquals(4, trojkatBoki.getBokB());
        Assertions.assertEquals(5, trojkatBoki.getBokC());
    }

    @Test
    void poprawneObliczenieObwodu() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(-3, 4, -5);
        Assertions.assertEquals(12, trojkatBoki.obliczObwod());
    }

    @Test
    void poprawneObliczeniePola() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(3, -5, -4);
        Assertions.assertEquals(6, trojkatBoki.obliczPole());
    }
}