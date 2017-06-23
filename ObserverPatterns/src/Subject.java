import java.util.ArrayList;
import java.util.List;

/**
 * Created by luisgonzalezmac on 22-06-17.
 */
public class Subject implements ISubject{

    List<Observer> observerList = new ArrayList<>();

    private int flag;


    @Override
    public void register(Observer ob) {

        observerList.add(ob);

    }

    @Override
    public void unregister(Observer ob) {

        observerList.remove(ob);

    }

    @Override
    public void notifyObservers() {

        for(Observer ob : observerList){

            ob.update();

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
