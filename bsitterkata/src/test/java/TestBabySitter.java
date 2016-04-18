package test.java;

/**
 * Created by matthewhouse on 4/14/16.
 */
public class TestBabySitter {

    @Test
    public void babySitterExists() {
        BabySitter babySitter = new BabySitter();
        assertTrue(babySitter);
    }
}
