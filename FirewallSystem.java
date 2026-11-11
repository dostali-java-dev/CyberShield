// Project: CyberShield - Network Security System

// Inheritance: FirewallSystem ne SecurityNode ki properties hasil ki hain
public class FirewallSystem extends SecurityNode {
    private int blockedAttacks;

    // Constructor: 'super' keyword Parent class (SecurityNode) ke constructor ko call karta hai
    public FirewallSystem(String deviceName, String ipAddress, boolean isSecure, int blockedAttacks) {
        super(deviceName, ipAddress, isSecure);
        this.blockedAttacks = blockedAttacks;
    }

    public int getBlockedAttacks() {
        return blockedAttacks;
    }

    public void blockNewThreat() {
        blockedAttacks++;
        System.out.println(">>> Firewall Alert: Unauthorized attack blocked on " + getDeviceName() + "!");
    }

    // Polymorphism (Method Overriding)
    @Override
    public void runSecurityCheck() {
        System.out.println("[Firewall] Device: " + getDeviceName() + " | IP: " + getIpAddress() 
            + " | Blocked Attacks: " + blockedAttacks + " | Status: " + (isSecure() ? "ACTIVE & SAFE" : "BREACHED"));
    }
}