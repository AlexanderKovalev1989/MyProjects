import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GarageAirCompanyTest {

    private static final List<PlaneObject> listOfPlanesTest = new ArrayList<PlaneObject>();

    {
        listOfPlanesTest.add(new PlaneObject("Boing - 747", 1, "Plane", 5000, 10000));
        listOfPlanesTest.add(new PlaneObject("Boing - 747", 2, "Plane", 5000, 10000));
    }

    private GarageAirCompany garageAirCompany;

    @Before
    public void beforeStatement() {
        garageAirCompany = new GarageAirCompany();

    }

    @Test
    public void calculateDistance() throws Exception {


        int actual = garageAirCompany.calculateDistance(listOfPlanesTest);

        int result = 20000;

        assertTrue(actual == result);


    }

    @Before
    public void beforeStatementFalse() {
        garageAirCompany = new GarageAirCompany();

    }

    @Test
    public void calculateDistanceFalse() throws Exception {


        int actual = garageAirCompany.calculateDistance(listOfPlanesTest);

        int result = 10000;

        assertFalse(actual == result);


    }

}