package staff.techStaff;

import com.codebase.staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DeveloperTest {

    Developer Developer;

    @Before
    public void before() {
        Developer = new Developer("Bertha", "GF447700Y", 80000);
    }

    @Test
    public void canGetName() {
        assertEquals("Bertha", Developer.getName());
    }
    @Test
    public void canGetNINumber() {
        assertEquals("GF447700Y", Developer.getNinumber() );
    }

    @Test
    public void canGetSalary() {
        assertEquals(80000, Developer.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(800, Developer.payBonus(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        Developer.raiseSalary(500);
        assertEquals(80500, Developer.getSalary(), 0.0);
    }
}
