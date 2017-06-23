/**
 * Created by luisgonzalezmac on 22-06-17.
 */
public class ObserverTwo implements IObserver {


    @Override
    public void update(int i) {
        System.out.println("ObserverTwo: myValue is subject is now: " + i);
    }
}
