package projects.f5.person_java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PersonTest {
    @Test
    public void testPersonAttributes() {
        Person person = new Person("Nadiia", "Alaieva", "FD12334", 1989, "Ukraine", 'F');
        assertEquals("Nadiia", person.getFirstName());
        assertEquals("Alaieva", person.getLastName());
        assertEquals("FD12334", person.getIdNumber());
        assertEquals(1989, person.getBirthYear());
        assertEquals("Ukraine", person.getCountryOfBirth());
        assertEquals('F', person.getGender());
    }

    @Test
    public void testPrintDetails() {
        Person person = new Person("Nadiia", "Alaieva", "FD12334", 1989, "Ukraine", 'F');
        String expectedOutput = "Name: Nadiia Alaieva\n" +
                "ID Number: FD12334\n" +
                "Birth Year: 1989\n" +
                "Country of Birth: Ukraine\n" +
                "Gender: F\n";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            person.printDetails();
        } finally {
            System.setOut(originalOut);
        }

        String output = outputStream.toString();

        assertEquals(expectedOutput, output);
    }

}
