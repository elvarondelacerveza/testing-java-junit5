package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
    controller = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", controller.index());
        assertEquals("index", controller.index() , "Wrong View Returned");

        assertThat(controller.index()).isEqualTo("index");
    }

    @Test
    @DisplayName("Test exception")
    void oupsHandler() {
        assertThrows(ValueNotFoundException.class, ()->{
            controller.oupsHandler();
        });
    }

    @Disabled("Demo of Time out")
    @Test
    void testTimeOut(){
        assertTimeout(Duration.ofMillis(100),()->{
            Thread.sleep(2000);
            System.out.println("I got here");
        });
    }

    @Disabled("Demo of Time out")
    @Test
    void testTimeOutPrempt(){
        assertTimeoutPreemptively(Duration.ofMillis(100),()->{
            Thread.sleep(2000);
            System.out.println("I got here  2347923");
        });
    }

    @Test
    void testassumpitonTrue() {
    assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
    }
    @Test
    void testassumpitonTrueValid() {
    assumeTrue("GURU".equalsIgnoreCase("GURU"));
    }
}