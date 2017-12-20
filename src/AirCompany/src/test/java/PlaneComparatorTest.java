import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlaneComparatorTest {


    private static final PlaneObject planeObject1 = new PlaneObject("Boing - 747", 1, "Plane", 5000, 10000);
    private static final PlaneObject planeObject2 = new PlaneObject("IL", 8, "Plane", 500, 1000);


    @Before
    public void beforeStatement() {
        GarageAirCompany.PlaneComparator planeComparator = new GarageAirCompany.PlaneComparator();


    }

    @Test
    public void successfulAuthCompare() throws Exception {

        GarageAirCompany.PlaneComparator planeComparator = new GarageAirCompany.PlaneComparator();

        int actual = planeComparator.compare(planeObject1, planeObject2);


        assertTrue(actual == 1);


    }

    @Test
    public void failAuthCompare() throws Exception {
        GarageAirCompany.PlaneComparator planeComparator = new GarageAirCompany.PlaneComparator();

        int actual = planeComparator.compare(planeObject1, planeObject2);

        assertFalse(actual != 1);


    }

}