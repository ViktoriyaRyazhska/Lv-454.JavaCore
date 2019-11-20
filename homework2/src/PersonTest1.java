import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest1 {

    @Test
    public void getAge() {
        Person p = new Person();
        p.setBirthYear(2000);
        assertTrue(p.getAge() == 19);
    }
}