package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("cat")
    private Animal animal;

    @Autowired
    private MyTimer myTimer;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(myTimer.getTime());
        System.out.println("________________________");
    }

    public MyTimer getTimer() {
        if (myTimer == null) {
            myTimer = new MyTimer();
        }
        return myTimer;
    }
}
