package staff.management;

import com.codebase.staff.management.Manager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Lucinda", "HN123098C", 38500, "Human Resources");
    }

    @Test
    public void canGetName() {
        assertEquals("Lucinda", manager.getName());
    }
    @Test
    public void canGetNINumber() {
        assertEquals("HN123098C", manager.getNinumber() );
    }

    @Test
    public void canGetSalary() {
        assertEquals(38500D, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Human Resources", manager.getDeptName());
    }

    @Test
    public void canPayBonus() {
        assertEquals(385, manager.payBonus(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(500);
        assertEquals(39000, manager.getSalary(), 0.0);
    }
}
