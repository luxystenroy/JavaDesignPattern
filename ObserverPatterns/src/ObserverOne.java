/**
 * Created by luisgonzalezmac on 22-06-17.
 */
public class ObserverOne implements IObserver {


    @Override
    public void update(int i) {

        System.out.println("ObserverOne: myValue is subject is now: " + i);

    }
}
