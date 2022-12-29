public class Main {
    public static void main(String[] args){
        TV tv = new TV();
        Remote remote = new Remote(tv);
        remote.togglePower();
        
        Radio radio = new Radio();
        Remote remote2 = new AdvancedRemote(radio);
    }
}
