// Project: CyberShield - Network Security System

public class SecurityNode {
    // Encapsulation: Private attributes taake bahar se direct change na ho sakein
    private String deviceName;
    private String ipAddress;
    private boolean isSecure;

    // Constructor: Jab bhi naya device/node banega, yeh values set karega
    public SecurityNode(String deviceName, String ipAddress, boolean isSecure) {
        this.deviceName = deviceName;
        this.ipAddress = ipAddress;
        this.isSecure = isSecure;
    }

    // Getters & Setters (Encapsulation)
    public String getDeviceName() {
        return deviceName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public boolean isSecure() {
        return isSecure;
    }

    public void setSecure(boolean secure) {
        this.isSecure = secure;
    }

    // Method jo aage Child Classes mein Override hoga (Polymorphism)
    public void runSecurityCheck() {
        System.out.println("[Node] Device: " + deviceName + " | IP: " + ipAddress + " | Status: " + (isSecure ? "SECURE" : "AT RISK"));
    }
}