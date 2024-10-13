import java.util.Scanner;

class AMSJ001{

    static int Roll;
    static String name1 = "Saksham Pandey";
    static String name2 = "Vansh Saxena";
    static String name3 = "Utkarsh Shrivas";
    static String name4 = "Shivam Yadav";
    static String name5 = "Satyam Upadhyay";

    static int total_classes = 30;

    
    static int saksham_present = 15, saksham_absent = 15, saksham_attendance = 50;
    static int vansh_present = 18, vansh_absent = 12, vansh_attendance = 60;
    static int utkarsh_present = 15, utkarsh_absent = 15, utkarsh_attendance = 50;
    static int shivam_present = 20, shivam_absent = 10, shivam_attendance = 66;
    static int satyam_present = 16, satyam_absent = 14, satyam_attendance = 53;

    static int ATTENDANCE;
    static String Mark_Attendance;
    static String again = "C";  
    
    public static void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ATTENDANCE MANAGEMENT SYSTEM");
        System.out.print("Enter the Student Roll NO: ");
        Roll = sc.nextInt();
    }

    public static void ROLL_NUM() {
        if (Roll == 117) {
            System.out.println("Welcome! " + name1);
        } else if (Roll == 145) {
            System.out.println("Welcome! " + name3);
        } else if (Roll == 147) {
            System.out.println("Welcome! " + name2);
        } else if (Roll == 138) {
            System.out.println("Welcome! " + name4);
        } else if (Roll == 136) {
            System.out.println("Welcome! " + name5);
        } else {
            System.out.println("Roll No. is not Available!");
        }
    }

    public static void View_Attendance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to View ATTENDANCE");
        System.out.println("Press 2 to Mark ATTENDANCE");
        ATTENDANCE = sc.nextInt();

        if (ATTENDANCE == 1) {
            if (Roll == 117) {
                System.out.println("Total Classes Held: " + total_classes);
                System.out.println("Present: " + saksham_present);
                System.out.println("Absent: " + saksham_absent);
                System.out.println("ATTENDANCE: " + saksham_attendance + "%");
            } else if (Roll == 147) {
                System.out.println("Total Classes Held: " + total_classes);
                System.out.println("Present: " + vansh_present);
                System.out.println("Absent: " + vansh_absent);
                System.out.println("ATTENDANCE: " + vansh_attendance + "%");
            } else if (Roll == 145) {
                System.out.println("Total Classes Held: " + total_classes);
                System.out.println("Present: " + utkarsh_present);
                System.out.println("Absent: " + utkarsh_absent);
                System.out.println("ATTENDANCE: " + utkarsh_attendance + "%");
            } else if (Roll == 138) {
                System.out.println("Total Classes Held: " + total_classes);
                System.out.println("Present: " + shivam_present);
                System.out.println("Absent: " + shivam_absent);
                System.out.println("ATTENDANCE: " + shivam_attendance + "%");
            } else if (Roll == 136) {
                System.out.println("Total Classes Held: " + total_classes);
                System.out.println("Present: " + satyam_present);
                System.out.println("Absent: " + satyam_absent);
                System.out.println("ATTENDANCE: " + satyam_attendance + "%");
            }
        }
    }

    public static void Mark_Attendance() {
        Scanner sc = new Scanner(System.in);

        if (ATTENDANCE == 2) {
            System.out.println("Press P for Present");
            System.out.println("Press A for Absent");

            if (Roll == 117) {
                markIndividualAttendance("Saksham", saksham_present, saksham_absent);
            } else if (Roll == 147) {
                markIndividualAttendance("Vansh", vansh_present, vansh_absent);
            } else if (Roll == 145) {
                markIndividualAttendance("Utkarsh", utkarsh_present, utkarsh_absent);
            } else if (Roll == 138) {
                markIndividualAttendance("Shivam", shivam_present, shivam_absent);
            } else if (Roll == 136) {
                markIndividualAttendance("Satyam", satyam_present, satyam_absent);
            }
        }

        
        System.out.print("Press C to CONTINUE or any other key to EXIT: ");
        again = sc.next();  // Update the `again` variable for the loop
    }

    
    public static void markIndividualAttendance(String studentName, int present, int absent) {
        Scanner sc = new Scanner(System.in);
        int present_count = 0;
        int absent_count = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Class " + i);
            Mark_Attendance = sc.next();
            if (Mark_Attendance.equalsIgnoreCase("P")) {
                present_count++;
            } else if (Mark_Attendance.equalsIgnoreCase("A")) {
                absent_count++;
            }
        }

        
        int update_present = present + present_count;
        int update_absent = absent + absent_count;
        int update_total_class = total_classes + present_count + absent_count;
        double update_ATTENDANCE = (((double) update_present) / update_total_class) * 100;

        
        System.out.println("Press 0 to View UPDATED ATTENDANCE");
        int View_update_ATTENDANCE = sc.nextInt();
        if (View_update_ATTENDANCE == 0) {
            System.out.println("TOTAL CLASS HELD: " + update_total_class);
            System.out.println("Present: " + update_present);
            System.out.println("Absent: " + update_absent);
            System.out.println("ATTENDANCE: " + update_ATTENDANCE + "%");
        }

       
        switch (studentName) {
            case "Saksham":
                saksham_present = update_present;
                saksham_absent = update_absent;
                saksham_attendance = (int) update_ATTENDANCE;
                break;
            case "Vansh":
                vansh_present = update_present;
                vansh_absent = update_absent;
                vansh_attendance = (int) update_ATTENDANCE;
                break;
            case "Utkarsh":
                utkarsh_present = update_present;
                utkarsh_absent = update_absent;
                utkarsh_attendance = (int) update_ATTENDANCE;
                break;
            case "Shivam":
                shivam_present = update_present;
                shivam_absent = update_absent;
                shivam_attendance = (int) update_ATTENDANCE;
                break;
            case "Satyam":
                satyam_present = update_present;
                satyam_absent = update_absent;
                satyam_attendance = (int) update_ATTENDANCE;
                break;
        }
    }

    public static void main(String[] args) {
        do {
            display();
            ROLL_NUM();
            View_Attendance();
            Mark_Attendance();
        } while (again.equalsIgnoreCase("C"));  // Continue if the user presses 'C'
    }
}


