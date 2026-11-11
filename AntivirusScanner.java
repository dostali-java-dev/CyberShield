// Project: CyberShield - Network Security System

// Inheritance: AntivirusScanner bhi SecurityNode ki properties hasil kar raha hai
public class AntivirusScanner extends SecurityNode {
    private int filesScanned;
    private int threatsFound;

    // Constructor
    public AntivirusScanner(String deviceName, String ipAddress, boolean isSecure, int filesScanned, int threatsFound) {
        super(deviceName, ipAddress, isSecure);
        this.filesScanned = filesScanned;
        this.threatsFound = threatsFound;
    }

    // Threat clean karne ka method (Encapsulation ke setter ko use karte hue)
    public void cleanThreats() {
        if (threatsFound > 0) {
            System.out.println(">>> Cleaning " + threatsFound + " malware threat(s) on " + getDeviceName() + "...");
            threatsFound = 0;
            setSecure(true); // Parent class ka setter call karke status SAFE kar diya
            System.out.println(">>> SUCCESS: " + getDeviceName() + " is now 100% SECURE!");
        } else {
            System.out.println(">>> " + getDeviceName() + " is already clean and safe.");
        }
    }

    // Polymorphism (Method Overriding): Antivirus ke hisab se apni report dikhayega
    @Override
    public void runSecurityCheck() {
        System.out.println("[Antivirus] Device: " + getDeviceName() + " | IP: " + getIpAddress() 
            + " | Files Scanned: " + filesScanned + " | Threats: " + threatsFound 
            + " | Status: " + (isSecure() ? "CLEAN" : "INFECTED (AT RISK)"));
    }
}