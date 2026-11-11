import java.util.Scanner;

/**
 * Project: CyberShield - Network Security Management System
 * Course: Object-Oriented Programming (Java) - 2nd Semester
 * Developed by: Dost Ali & [Dost Ka Naam]
 */

public class CyberShieldMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Teeno classes ke Objects bana rahe hain (Constructors use ho rahe hain)
        SecurityNode serverNode = new SecurityNode("University_Main_Server", "192.168.1.1", true);
        FirewallSystem officeFirewall = new FirewallSystem("Department_Router", "192.168.1.10", true, 42);
        AntivirusScanner adminPC = new AntivirusScanner("Admin_Lab_PC", "192.168.1.25", false, 1540, 2);

        System.out.println("=======================================================");
        System.out.println("       CYBERSHIELD - NETWORK SECURITY SYSTEM           ");
        System.out.println("       Developed by: Dost Ali & [ Alone boy ]          ");
        System.out.println("=======================================================");

        int choice = 0;
        while (choice != 5) {
            System.out.println("\n--- SECURITY CONTROL PANEL ---");
            System.out.println("1. View All Network Devices (Polymorphism Demo)");
            System.out.println("2. Simulate Cyber Attack on Firewall");
            System.out.println("3. Clean Malware Threats on Infected PC");
            System.out.println("4. Add New Custom Device Node");
            System.out.println("5. Exit CyberShield");
            System.out.print("Enter your choice (1-5): ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.println("\n--- Live Network Security Report ---");
                    // Polymorphism: Ek hi method 'runSecurityCheck()' har class ke mutabiq alag output dega
                    serverNode.runSecurityCheck();
                    officeFirewall.runSecurityCheck();
                    adminPC.runSecurityCheck();
                    break;

                case 2:
                    officeFirewall.blockNewThreat();
                    break;

                case 3:
                    adminPC.cleanThreats();
                    break;

                case 4:
                    System.out.print("Enter New Device Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Device IP Address: ");
                    String ip = scanner.nextLine();
                    SecurityNode customNode = new SecurityNode(name, ip, true);
                    System.out.println(">>> New Device Added Successfully!");
                    customNode.runSecurityCheck();
                    break;

                case 5:
                    System.out.println("\nShutting down CyberShield... Stay Safe! Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice! Please select between 1 and 5.");
            }
        }
        scanner.close();
    }
}