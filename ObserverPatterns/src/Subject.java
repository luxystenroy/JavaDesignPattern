import java.util.ArrayList;
import java.util.List;

/**
 * Created by luisgonzalezmac on 22-06-17.
 */
public class Subject implements ISubject{

    List<IObserver> observerList = new ArrayList<>();

    private int flag;


    @Override
    public void register(IObserver ob) {

        observerList.add(ob);

    }

    @Override
    public void unregister(IObserver ob) {

        observerList.remove(ob);

    }

    @Override
    public void notifyObservers() {

        for(IObserver ob : observerList){

            ob.update(this.flag);

        }

    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        notifyObservers();
    }
}
