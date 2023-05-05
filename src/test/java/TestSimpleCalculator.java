import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestSimpleCalculator {
    public static SimpleCalculator calc;

    @BeforeClass
    public static void oneTimeSetup() {
        System.out.println("Start");
    }

    @Before
    public void setup() {
        calc = new SimpleCalculator();
    }

    @After
    public void tearDown() {
        calc = null;
    }

    @AfterClass
    public static void oneTimeTearDown() {
        System.out.println("Quit");
    }
    @Test
    public void testMainConstructor() {
        assertNotEquals(calc, null);
    }

    @Test
    public void testAdd() {
        assertEquals( 4, calc.add(2,2));
        assertEquals( 10, calc.add(6,4));
        assertEquals( 10, calc.add(4,6));
        assertEquals( 100, calc.add(41,59));
        assertEquals( -10, calc.add(-4,-6));
        assertEquals( -4, calc.add(2,-6));
    }

    @Test
    public void testSub() {
        assertEquals( 0, calc.sub(2,2));
        assertEquals( -6, calc.sub(2,8));
        assertEquals( 6, calc.sub(10,4));
        assertEquals( -4, calc.sub(-2,2));
        assertEquals( 0, calc.sub(-2,-2));
    }

    @Test
    public void testMul() {
        assertEquals( 4, calc.mul(2,2));
        assertEquals( 15, calc.mul(5,3));
        assertEquals( -15, calc.mul(5, -3));
        assertEquals( 12, calc.mul(-3,-4));
        assertEquals( 0, calc.mul(5,0));
    }

    @Test
    public void testDiv() {
        assertEquals( 1, calc.div(2,2));
        assertEquals( 2, calc.div(10,5));
        assertEquals( -2, calc.div(-10,5));
        assertEquals( -2, calc.div(10,-5));
        assertEquals( 10, calc.div(-100,-10));
    }

    @Test
    public void testIntegration() {
        int result = calc.add(calc.sub(10, 5), calc.mul(2, calc.div(10, 2)));
        assertEquals(15, result);

        result = calc.sub(calc.add(10, 5), calc.mul(2, calc.div(10, 2)));
        assertEquals(5, result);

        result = calc.mul(calc.sub(10, 5), calc.add(2, calc.div(10, 2)));
        assertEquals(35, result);
    }
}
