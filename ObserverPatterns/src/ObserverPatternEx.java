/**
 * Created by luisgonzalezmac on 22-06-17.
 */
public class ObserverPatternEx {

    public static void main(String agrs[]){

        System.out.println("***ObserverOne Pattern Demo***\n");
        ObserverOne oBOne = new ObserverOne();
        ObserverTwo oBTwo = new ObserverTwo();
        Subject oSub = new Subject();

        oSub.register(oBOne);
        oSub.register(oBTwo);
        
        System.out.println("Setting flag = 10");
        oSub.setFlag(10);

        System.out.println("Setting flag = 20");
        oSub.setFlag(10);

        oSub.unregister(oBOne);

        //No notification this time

        System.out.println("Setting flag = 50");




    }
}
