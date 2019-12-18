package pl.pk.alhorithms.patterns.builder;

import org.junit.Assert;
import org.junit.Test;
import pl.pk.algorithms.patterns.builder.House;

public class BuilderTestSuite {

    @Test
    public void testHouseBuilderConstructor() {

        //Given
        House house = new House.HouseBuilder()
                .setWindows(5)
                .setDoors(2)
                .setCapacity(130)
                .setRooms(6)
                .build();

        //When
        boolean isHouse = (house instanceof House);
        int windows = house.getWindows();
        int doors = house.getDoors();

        Assert.assertTrue(isHouse);
        Assert.assertEquals(5, windows);
        Assert.assertEquals(2, doors);

    }
}
