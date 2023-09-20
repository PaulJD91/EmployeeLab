package staff.techStaff;

import com.codebase.staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Axel", "RE666000U", 50000);
    }

    @Test
    public void canGetName() {
        assertEquals("Axel", databaseAdmin.getName());
    }
    @Test
    public void canGetNINumber() {
        assertEquals("RE666000U", databaseAdmin.getNinumber() );
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(500, databaseAdmin.payBonus(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(500);
        assertEquals(50500, databaseAdmin.getSalary(), 0.0);
    }
}
