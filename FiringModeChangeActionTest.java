package megamek.common.actions;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FiringModeChangeActionTest</code> contains tests for the class <code>{@link FiringModeChangeAction}</code>.
 *
 * @generatedBy CodePro at 5/16/16 4:11 PM
 * @author vadesa1
 * @version $Revision: 1.0 $
 */
public class FiringModeChangeActionTest {
	/**
	 * Run the FiringModeChangeAction(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 4:11 PM
	 */
	@Test
	public void testFiringModeChangeAction_1()
		throws Exception {
		int entityId = 1;
		int equipmentId = 1;

		FiringModeChangeAction result = new FiringModeChangeAction(entityId, equipmentId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getEquipmentId());
		assertEquals(1, result.getEntityId());
	}

	/**
	 * Run the int getEquipmentId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 4:11 PM
	 */
	@Test
	public void testGetEquipmentId_1()
		throws Exception {
		FiringModeChangeAction fixture = new FiringModeChangeAction(1, 1);

		int result = fixture.getEquipmentId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setEquipmentId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 4:11 PM
	 */
	@Test
	public void testSetEquipmentId_1()
		throws Exception {
		FiringModeChangeAction fixture = new FiringModeChangeAction(1, 1);
		int equipmentId = 1;

		fixture.setEquipmentId(equipmentId);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/16/16 4:11 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/16/16 4:11 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/16/16 4:11 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FiringModeChangeActionTest.class);
	}
}