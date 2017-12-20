import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class GarageAirCompanyTest {

    private static final List<PlaneObject> listOfPlanesTest = new ArrayList<PlaneObject>();

    {
        listOfPlanesTest.add(new PlaneObject("Boing - 747", 1, "Plane", 5000, 10000));
        listOfPlanesTest.add(new PlaneObject("Boing - 747", 2, "Plane", 5000, 10000));
    }


    @Before
    public void beforeStatement() {
        GarageAirCompany garageAirCompany = new GarageAirCompany();

    }

    @Test
    public void calculateDistance() throws Exception {
        GarageAirCompany garageAirCompany = new GarageAirCompany();

        int actual = garageAirCompany.calculateDistance(listOfPlanesTest);

        int result = 20000;

        assertTrue(actual == result);


    }

}