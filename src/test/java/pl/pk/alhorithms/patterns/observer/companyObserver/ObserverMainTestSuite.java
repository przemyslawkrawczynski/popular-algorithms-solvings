package pl.pk.alhorithms.patterns.observer.companyObserver;

import org.junit.Assert;
import org.junit.Test;
import pl.pk.algorithms.patterns.observer.companyObserver.Boss;
import pl.pk.algorithms.patterns.observer.companyObserver.Employee;

public class ObserverMainTestSuite {

    @Test
    public void testObserverAdd() {
        //Given
        Boss boss = new Boss("John Doe");
        Employee e1 = new Employee("Jane Pane");
        Employee e2 = new Employee("Max Smith");

        //When
        boss.registerObserver(e1);
        boss.registerObserver(e2);

        int sizeOfEmployess = boss.getEmployess().size();

        //Then
        Assert.assertEquals(2, 2);
    }

    @Test
    public void testObserverRemove() {

        //Given
        Boss boss = new Boss("John Doe");
        Employee e1 = new Employee("Jane Pane");
        Employee e2 = new Employee("Max Smith");
        boss.registerObserver(e1);
        boss.registerObserver(e2);

        //When
        int actualEmployessListSize = boss.getEmployess().size();
        boss.removeObserver(e1);
        int afterRemoveEmployessListSize = boss.getEmployess().size();

        //Then
        Assert.assertEquals(afterRemoveEmployessListSize, actualEmployessListSize -1 );

    }

    @Test
    public void testNotifyObservers() {
        //Given
        Boss boss = new Boss("John Doe");
        Employee e1 = new Employee("Jane Pane");
        Employee e2 = new Employee("Max Smith");
        boss.registerObserver(e1);
        boss.registerObserver(e2);

        //When
        boss.setNewRecommendationToEmployess("You have free time to next week!");

        //Then
        //Void expectations

    }
}
