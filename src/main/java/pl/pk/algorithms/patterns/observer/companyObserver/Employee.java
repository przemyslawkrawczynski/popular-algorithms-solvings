package pl.pk.algorithms.patterns.observer.companyObserver;


public class Employee implements Observer {

    private String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void update(String bossRecommendation) {
        System.out.println("[" + this.employeeName + "] has understood this order: " + bossRecommendation);
    }
}
