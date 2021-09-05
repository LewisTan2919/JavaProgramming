package CreationalPattern.Singleton.SingleThread;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.lang.reflect.InvocationTargetException;

public class run {
    public static void main(String[] args) {
        RunSingleThread();
        RunMultiThread();
    }

    public static void RunSingleThread(){
        Singleton pre=Singleton.getInstance();
        for(int i=0;i<5;i++){
            Singleton cur=Singleton.getInstance();
            if(!pre.equals(cur)){
                System.out.println("singleton doesn't work");
                return;
            }
        }
        System.out.println("Singleton work");
    }

    public static void RunMultiThread(){
        Thread[] threads=new Thread[10000];
        for(int i=0;i<10000;i++){
            threads[i]=new Thread(()->{
               Singleton cur=Singleton.getInstance();
               System.out.println(cur.hashCode());
            });
        }
        for(int i=0;i<10000;i++){
            threads[i].start();
        }
    }


}
