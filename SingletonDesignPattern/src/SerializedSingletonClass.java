import java.io.Serializable;

public class SerializedSingletonClass implements Serializable {

    String name = "Naveed";

    private SerializedSingletonClass(){

    }

//    static SingletonClass s = new SingletonClass(); Eager Loading

    static SerializedSingletonClass s = null;

    static SerializedSingletonClass getInstance(){
        if(s == null){
            s = new SerializedSingletonClass();
        }
        return s;
    }

    //This can fix the problem of singleton behaviour
    protected Object readResolve() {
        return getInstance();
    }
}
