package CreationalPattern.Singleton.MultiThread;

public class Singleton {

    /**
     * need volatile to make this atomic
     * when initialize a instance:
     * 1: create memory
     * 2: initialize the instance with memory
     * 3: point the reference to the instance
     *
     * Since the order is not atomic, order could be shuffled
     * then reference might not point to the right instance
     * */
    private static volatile Singleton instance=null;

    private Singleton(){

    }

    public Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }

}
