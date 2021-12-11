package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaceOrderControllerTest {

    PlaceOrderController placeOrderController;

    @BeforeEach
    void setUp() throws Exception {
        placeOrderController = new PlaceOrderController();
    }

    @Test
    public void nameTest() {
        String name = "Nguyen Nang Son";
        boolean isValid = placeOrderController.validateName(name);
        assertEquals(true, isValid);
    }

    @Test
    public void addressTest() {
        String address = "So 1 Dai Co Viet";
        boolean isValid = placeOrderController.validateAddress(address);
        assertEquals(true, isValid);
    }

}