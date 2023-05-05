package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void groupedAssertions() {
    //Given
        Person person = new Person(1l,"Tony","Mcguill");
        //When

        //Then
        assertAll("Test Proper Set",
                () -> assertEquals(person.getFirstName(),"Tony"),
                () -> assertEquals(person.getLastName(),"Mcguill")
                );
    }
    @Test
    void groupedAssertionsMsgs() {
    //Given
        Person person = new Person(1l,"Tony","Mcguill");
        //When

        //Then
        assertAll("Test Proper Set",
                () -> assertEquals(person.getFirstName(),"Sam" , "Name provided is not correct"),
                () -> assertEquals(person.getLastName(),"Doe" , "Lastname provided is not correct")
                );
    }
}