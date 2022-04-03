package devoxxuk2022;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    void testWithoutParameter() {
        HelloWorld.main(new String[]{});
    }

    @Test
    void testWithParameter() {
        HelloWorld.main(new String[]{"Devoxx UK"});
    }


    @Test
    void testWithParameterIBM() {
        HelloWorld.main(new String[]{"IBM"});
    }


}