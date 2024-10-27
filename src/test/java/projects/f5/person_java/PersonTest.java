package projects.f5.person_java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void testPersonAttributes() {
        Person person = new Person("Nadiia", "Alaieva", "FD12334", 1989);
        assertEquals("Nadiia", person.getFirstName());
        assertEquals("Alaieva", person.getLastName());
        assertEquals("FD12334", person.getIdNumber());
        assertEquals(1989, person.getBirthYear());
    }

}
