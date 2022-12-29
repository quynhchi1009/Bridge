public class Remote{
    protected Device Device;

    Remote(Device device) {
        this.Device = device;
    }

    void togglePower() {
        if (this.Device.isEnabled()) {
            this.Device.disable();
        } else {
            this.Device.enable();
        }
    }

    void volumeDown() {
        this.Device.setVolume(this.Device.getVolume() - 10);
    }

    void volumeUp() {
        this.Device.setVolume(this.Device.getVolume() + 10);
    }

    void channelUp() {
        this.Device.setChannel(this.Device.getChannel() + 1);
    }

    void channelDown() {
        this.Device.setChannel(this.Device.getChannel() - 1);
    }
}