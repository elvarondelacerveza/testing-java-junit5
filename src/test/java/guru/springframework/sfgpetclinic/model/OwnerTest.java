package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @DisplayName("All the Properties Tested for Owner and Person might be match ")
    @Test
    void dependentAssertions() {

        Owner owner = new Owner(1l,"Joe","Petter");
        owner.setCity("Aguascalientes");
        owner.setTelephone("4492550227");

        assertAll("Properties Test",
            ()->assertAll("Person Properties",
                    ()->assertEquals("Joes",owner.getFirstName(),"Name is not Corresponding"),
                    ()->assertEquals("Petter",owner.getLastName())),
            ()->assertAll("Owner Properties",
                    ()->assertEquals("Joes",owner.getFirstName()),
                    ()->assertEquals("Petter",owner.getLastName())
            ));
        assertThat();
    }
}