/**
 * Created by luisgonzalezmac on 22-06-17.
 */
public interface ISubject {

    public void register(Observer ob);
    public void unregister(Observer ob);
    public void notifyObservers();
}
