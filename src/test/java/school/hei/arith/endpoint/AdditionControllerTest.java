package school.hei.arith.endpoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionControllerTest {
    private final AdditionController subject = new AdditionController();
@Test
    void testAdd() {
        assertEquals(3,subject.addition(1,2));
    }
}