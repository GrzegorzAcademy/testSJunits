package com.isa.geometry;

import org.junit.jupiter.api.*;

import java.util.logging.Logger;

public class PointTest {
    private static final Logger logger = Logger.getLogger(Point.class.getName());

    @Test
    public void testIfPointCreated() {
        logger.info("inside method testIfPointCreated");
        Point point = new Point(3.5, 6.8);
    }

    @Test
    public void testIfDistanceIsCorrect() {
        logger.info("inside method testIfDistanceIsCorrect ");
        Point point = new Point(2.0, 5.0);
        Assertions.assertEquals(4.123105625617661, point.distance(new Point(6.0, 4.0)));
    }

    @BeforeAll
    public static void BaforeAll() {
        logger.info("Inside BeforeAll");

    }

    @BeforeEach
    public void BeforeEach() {
        logger.info("Inside method BeforeEach");

    }

    @AfterAll
    public static  void AfterAll() {
        logger.info("Inside method AfterAll");
    }

    @AfterEach
    public void AfterEach() {
        logger.info("Inside method AfterEach");
    }
}
