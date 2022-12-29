public class AdvancedRemote extends Remote {

    AdvancedRemote(Device device) {
        super(device);
    }
    
    void mute() {
        this.Device.setVolume(0);
    }   
}
