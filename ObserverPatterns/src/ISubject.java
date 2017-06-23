/**
 * Created by luisgonzalezmac on 22-06-17.
 */
public interface ISubject {

    public void register(IObserver ob);
    public void unregister(IObserver ob);
    public void notifyObservers();
}
