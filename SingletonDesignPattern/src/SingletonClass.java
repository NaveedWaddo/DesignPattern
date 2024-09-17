

public class SingletonClass {

    private SingletonClass(){

    }

//    static SingletonClass s = new SingletonClass(); Eager Loading

    static SingletonClass s = null;

     static SingletonClass getInstance(){
        if(s == null){
            s = new SingletonClass();
        }
        return s;
    }
}
