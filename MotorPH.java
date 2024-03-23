import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayrollMotorPH {
    private int employeeNumber;
    private String lastName;
    private String firstName;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String sssNumber;
    private String philhealthNumber;
    private String tinNumber;
    private String pagibigNumber;
    private String status;
    private String position;
    private String immediateSupervisor;
    private double basicSalary;
    private double riceSubsidy;
    private double phoneAllowance;
    private double clothingAllowance;
    private double grossSemiMonthlyRate;
    private double hourlyRate;

    public PayrollMotorPH(int employeeNumber, String lastName, String firstName, String birthday, String address, String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber, String pagibigNumber, String status, String position, String immediateSupervisor, double basicSalary, double riceSubsidy, double phoneAllowance, double clothingAllowance, double grossSemiMonthlyRate, double hourlyRate) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sssNumber = sssNumber;
        this.philhealthNumber = philhealthNumber;
        this.tinNumber = tinNumber;
        this.pagibigNumber = pagibigNumber;
        this.status = status;
        this.position = position;
        this.immediateSupervisor = immediateSupervisor;
        this.basicSalary = basicSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.grossSemiMonthlyRate = grossSemiMonthlyRate;
        this.hourlyRate = hourlyRate;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getRiceSubsidy() {
        return riceSubsidy;
    }

    public double getPhoneAllowance() {
        return phoneAllowance;
    }

    public double getClothingAllowance() {
        return clothingAllowance;
    }

    // Getter methods for other attributes

    public static void main(String[] args) {
        // Create a list to store employees
        List<PayrollMotorPH> employees = new ArrayList<>();

        // Sample employee data
        employees.add(new PayrollMotorPH(1, "Garcia", "Manuel III", "10/11/1983", "Valero Carpark Building Valero Street 1227, Makati City", "966-860-270", "44-4506057-3", "820126853951", "442-605-657-000", "691295330870", "Regular", "Chief Executive Officer", "N/A", 90000, 1500, 2000, 1000, 45000, 535.71));
        employees.add(new PayrollMotorPH(2, "Lim", "Antonio", "06/19/1988", "San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite", "171-867-411", "52-2061274-9", "331735646338", "683-102-776-000", "663904995411", "Regular", "Chief Operating Officer", "Garcia, Manuel III", 60000, 1500, 2000, 1000, 30000, 357.14));
        employees.add(new PayrollMotorPH(3, "Aquino", "Bianca Sofia", "08/04/1989", "Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City", "966-889-370", "30-8870406-2", "177451189665", "971-711-280-000", "171519773969", "Regular", "Chief Finance Officer", "Garcia, Manuel III", 60000, 1500, 2000, 1000, 30000, 357.14));
        employees.add(new PayrollMotorPH(4, "Reyes", "Isabella", "06/16/1994", "460 Solanda Street Intramuros 1000, Manila", "786-868-477", "40-2511815-0", "341911411254", "876-809-437-000", "416946776041", "Regular", "Chief Marketing Officer", "Garcia, Manuel III", 60000, 1500, 2000, 1000, 30000, 357.14));
        employees.add(new PayrollMotorPH(5, "Hernandez", "Eduard", "09/23/1989", "National Highway, Gingoog, Misamis Occidental", "088-861-012", "50-5577638-1", "957436191812", "031-702-374-000", "952347222457", "Regular", "IT Operations and Systems", "Lim, Antonio", 52670, 1500, 1000, 1000, 26335, 313.51));
        employees.add(new PayrollMotorPH(6, "Villanueva", "Andrea Mae", "02/14/1988", "17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands", "918-621-603", "49-1632020-8", "382189453145", "317-674-022-000", "441093369646", "Regular", "HR Manager", "Lim, Antonio", 52670, 1500, 1000, 1000, 26335, 313.51));
        employees.add(new PayrollMotorPH(7, "San Jose", "Brad", "03/15/1996", "99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi", "797-009-261", "40-2400714-1", "239192926939", "672-474-690-000", "210850209964", "Regular", "HR Team Leader", "Villanueva, Andrea Mae", 42975, 1500, 800, 800, 21488, 255.80));
        employees.add(new PayrollMotorPH(8, "Romualdez", "Alice", "05/14/1992", "12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte", "983-606-799", "55-4476527-2", "545652640232", "888-572-294-000", "211385556888", "Regular", "HR Rank and File", "San, Jose Brad", 22500, 1500, 500, 500, 11250, 133.93));
        employees.add(new PayrollMotorPH(9, "Atienza", "Rosie", "09/24/1948", "90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte", "266-036-427", "41-0644692-3", "708988234853", "604-997-793-000", "260107732354", "Regular", "HR Rank and File", "San, Jose Brad", 22500, 1500, 500, 500, 11250, 133.93));
        employees.add(new PayrollMotorPH(10, "Alvaro", "Roderick", "03/30/1988", "#284 T. Morato corner, Scout Rallos Street, Quezon City", "053-381-386", "64-7605054-4", "578114853194", "525-420-419-000", "799254095212", "Regular", "Accounting Head", "Aquino, Bianca Sofia", 52670, 1500, 1000, 1000, 26335, 313.51));
        employees.add(new PayrollMotorPH(11, "Salcedo", "Anthony", "09/14/1993", "93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate", "070-766-300", "26-9647608-3", "126445315651", "210-805-911-000", "218002473454", "Regular", "Payroll Manager", "Alvaro, Roderick", 50825, 1500, 1000, 1000, 25413, 302.53));
        employees.add(new PayrollMotorPH(12, "Lopez", "Josie", "01/14/1987", "49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro", "478-355-427", "44-8563448-3", "431709011012", "218-489-737-000", "113071293354", "Regular", "Payroll Team Leader", "Salcedo, Anthony", 38475, 1500, 800, 800, 19238, 229.02));
        employees.add(new PayrollMotorPH(13, "Farala", "Martha", "01/11/1942", "42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte", "329-034-366", "45-5656375-0", "233693897247", "210-835-851-000", "631130283546", "Regular", "Payroll Rank and File", "Salcedo, Anthony", 24000, 1500, 500, 500, 12000, 142.86));
        employees.add(new PayrollMotorPH(14, "Martinez", "Leila", "07/11/1970", "37/46 Kulas Roads, Maragondon 0962 Quirino", "877-110-749", "27-2090996-4", "515741057496", "275-792-513-000", "101205445886", "Regular", "Payroll Rank and File", "Salcedo, Anthony", 24000, 1500, 500, 500, 12000, 142.86));
        employees.add(new PayrollMotorPH(15, "Romualdez", "Fredrick", "03/10/1985", "22A/52 Lubowitz Meadows, Pililla 4895 Zambales", "023-079-009", "26-8768374-1", "308366860059", "598-065-761-000", "223057707853", "Regular", "Account Manager", "Lim, Antonio", 53500, 1500, 1000, 1000, 26750, 318.45));
        employees.add(new PayrollMotorPH(16, "Mata", "Christian", "10/21/1987", "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu", "783-776-744", "49-2959312-6", "824187961962", "103-100-522-000", "631052853464", "Regular", "Account Team Leader", "Romualdez, Fredrick", 42975, 1500, 800, 800, 21488, 255.80));
        employees.add(new PayrollMotorPH(17, "De Leon", "Selena", "02/20/1975", "89A Armstrong Trace, Compostela 7874 Maguindanao", "975-432-139", "27-2090208-8", "587272469938", "482-259-498-000", "719007608464", "Regular", "Account Team Leader", "Romualdez, Fredrick", 41850, 1500, 800, 800, 20925, 249.11));
        employees.add(new PayrollMotorPH(18, "San Jose", "Allison", "06/24/1986", "08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union", "179-075-129", "45-3251383-0", "745148459521", "121-203-336-000", "114901859343", "Regular", "Account Rank and File", "Mata, Christian", 22500, 1500, 500, 500, 11250, 133.93));
        employees.add(new PayrollMotorPH(19, "Rosario", "Cydney", "10/06/1996", "93A/21 Berge Points, Tapaz 2180 Quezon", "868-819-912", "49-1629900-2", "579253435499", "122-244-511-000", "265104358643", "Regular", "Account Rank and File", "Mata, Christian", 22500, 1500, 500, 500, 11250, 133.93));
        employees.add(new PayrollMotorPH(20, "Bautista", "Mark", "02/12/1991", "65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino", "683-725-348", "49-1647342-5", "399665157135", "273-970-941-000", "260054585575", "Regular", "Account Rank and File", "Mata, Christian", 23250, 1500, 500, 500, 11625, 138.39));
        employees.add(new PayrollMotorPH(21, "Lazaro", "Darlene", "11/25/1985", "47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino", "740-721-558", "45-5617168-2", "606386917510", "354-650-951-000", "104907708845", "Probationary", "Account Rank and File", "Mata, Christian", 23250, 1500, 500, 500, 11625, 138.39));
        employees.add(new PayrollMotorPH(22, "Delos Santos", "Kolby", "02/26/1980", "06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur", "739-443-033", "52-0109570-6", "357451271274", "187-500-345-000", "113017988667", "Probationary", "Account Rank and File", "Mata, Christian", 24000, 1500, 500, 500, 12000, 142.86));
        employees.add(new PayrollMotorPH(23, "Santos", "Vella", "12/31/1983", "99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur", "955-879-269", "52-9883524-3", "548670482885", "101-558-994-000", "360028104576", "Probationary", "Account Rank and File", "Mata, Christian", 22500, 1500, 500, 500, 11250, 133.93));
        employees.add(new PayrollMotorPH(24, "Del Rosario", "Tomas", "12/18/1978", "80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque", "882-550-989", "45-5866331-6", "953901539995", "560-735-732-000", "913108649964", "Probationary", "Account Rank and File", "Mata, Christian", 22500, 1500, 500, 500, 11250, 133.93));
        employees.add(new PayrollMotorPH(25, "Tolentino", "Jacklyn", "05/19/1984", "96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao", "675-757-366", "47-1692793-0", "753800654114", "841-177-857-000", "210546661243", "Probationary", "Account Rank and File", "De Leon, Selena", 24000, 1500, 500, 500, 12000, 142.86));
        employees.add(new PayrollMotorPH(26, "Gutierrez", "Percival", "12/18/1970", "58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur", "512-899-876", "40-9504657-8", "797639382265", "502-995-671-000", "210897095686", "Probationary", "Account Rank and File", "De Leon, Selena", 24750, 1500, 500, 500, 12375, 147.32));
        employees.add(new PayrollMotorPH(27, "Manalaysay", "Garfield", "08/28/1986", "60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur", "948-628-136", "45-3298166-4", "810909286264", "336-676-445-000", "211274476563", "Probationary", "Account Rank and File", "De Leon, Selena", 24750, 1500, 500, 500, 12375, 147.32));
        employees.add(new PayrollMotorPH(28, "Villegas", "Lizeth", "12/12/1981", "66/77 Mann Views, Luisiana 1263 Dinagat Islands", "332-372-215", "40-2400719-4", "934389652994", "210-395-397-000", "122238077997", "Probationary", "Account Rank and File", "De Leon, Selena", 24000, 1500, 500, 500, 12000, 142.86));
        employees.add(new PayrollMotorPH(29, "Ramos", "Carol", "08/20/1978", "72/70 Stamm Spurs, Bustos 4550 Iloilo", "250-700-389", "60-1152206-4", "351830469744", "395-032-717-000", "212141893454", "Probationary", "Account Rank and File", "De Leon, Selena", 22500, 1500, 500, 500, 11250, 133.93));
        employees.add(new PayrollMotorPH(30, "Maceda", "Emelia", "04/14/1973", "50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija", "973-358-041", "54-1331005-0", "465087894112", "215-973-013-000", "515012579765", "Probationary", "Account Rank and File", "De Leon, Selena", 22500, 1500, 500, 500, 11250, 133.93));
        employees.add(new PayrollMotorPH(31, "Aguilar", "Delia", "01/27/1989", "95 Cremin Junction, Surallah 2809 Cotabato", "529-705-439", "52-1859253-1", "136451303068", "599-312-588-000", "110018813465", "Probationary", "Account Rank and File", "De Leon, Selena", 22500, 1500, 500, 500, 11250, 133.93));
        employees.add(new PayrollMotorPH(32, "Castro", "John Rafael", "02/09/1992", "Hi-way, Yati, Liloan Cebu", "332-424-955", "26-7145133-4", "601644902402", "404-768-309-000", "697764069311", "Regular", "Sales & Marketing", "Reyes, Isabella", 52670, 1500, 1000, 1000, 26335, 313.51));
        employees.add(new PayrollMotorPH(33, "Martinez", "Carlos Ian", "11/16/1990", "Bulala, Camalaniugan", "078-854-208", "11-5062972-7", "380685387212", "256-436-296-000", "993372963726", "Regular", "Supply Chain and Logistics", "Reyes, Isabella", 52670, 1500, 1000, 1000, 26335, 313.51));
        employees.add(new PayrollMotorPH(34, "Santos", "Beatriz", "08/07/1990", "Agapita Building, Metro Manila", "526-639-511", "20-2987501-5", "918460050077", "911-529-713-000", "874042259378", "Regular", "Customer Service and Relations", "Reyes, Isabella", 52670, 1500, 1000, 1000, 26335, 313.51));

        int continueProgram = 0;;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> usernames = new ArrayList<>();
        usernames.add("admin1");
        ArrayList<String> passwords = new ArrayList<>();
        passwords.add("admin2");

        System.out.println("\nMOTOR PH PAYROLL SYSTEM DEVELOPED BY GROUP 2");
        System.out.print("Enter username: ");
        String uName = scanner.nextLine();
        System.out.print("Enter password: ");
        String pWord = scanner.nextLine();

        algo:
        while (true) {
            if (continueProgram > 0) {
                System.out.println("\n\nWould you like to have another transaction? ");
                System.out.print("[0] No\n[1] Yes\n\n>> ");
                int transaction = scanner.nextInt();

                if (transaction == 0) {
                    System.out.println("\n>> End of Transaction");
                    break algo;
                }
            }
            continueProgram += 1;

            if ((usernames.contains(uName)) & (passwords.contains(pWord))) {
                // ask the user what action to perform, enter number only
                System.out.println("\nMOTOR PH PAYROLL SYSTEM DEVELOPED BY GROUP 2\n");
                System.out.println("[1] Search Employee Details");
                System.out.println("[2] Calculate Gross Weekly Salary");
                System.out.println("[3] Calculate Gross Wage");
                System.out.println("[4] Calculate Net Wage (With Deductions)");
                System.out.print("\nChoose Mode: ");
                int choice = scanner.nextInt();

                // Perform the chosen action
                if (choice == 1) {
                    searchEmployeeNumber(scanner, employees);
                } else if (choice == 2) {
                    calculateGrossWeeklySalary(scanner, employees);
                } else if (choice == 3) {
                    calculateGrossWage(scanner, employees);
                } else if (choice == 4) {
                    calculateNetWage(scanner, employees);
                } else {
                    System.out.println("\n\n>> Invalid Entry !!");
                }



            } else {
                System.out.println("\n\n>> Invalid Credentials !!");
            }
        }
    }

    // method to search for an employee by their employee number
    private static void searchEmployeeNumber(Scanner scanner, List<PayrollMotorPH> employees) {
        System.out.print("\nEnter the Employee Number: ");
        int empNumber = scanner.nextInt();

        // Search for the employee with the given employee number
        PayrollMotorPH targetEmployee = null;
        for (PayrollMotorPH employee : employees) {
            if (employee.employeeNumber == empNumber) {
                targetEmployee = employee;
                break;
            }
        }

        // print employee information if found
        if (targetEmployee != null) {
            System.out.println("Employee Number: " + targetEmployee.employeeNumber);
            System.out.println("Name: " + targetEmployee.getFullName());
            System.out.println("Birthday: " + targetEmployee.birthday);
        } else {
            System.out.println("Employee not found.");
        }
    }

    // method to calculate hours worked for a week
    private static void calculateGrossWeeklySalary(Scanner scanner, List<PayrollMotorPH> employees) {
        System.out.print("Enter the Employee Number: ");
        int empNumber = scanner.nextInt();

        // search for the employee with given employee number
        PayrollMotorPH targetEmployee = null;
        for (PayrollMotorPH employee : employees) {
            if (employee.employeeNumber == empNumber) {
                targetEmployee = employee;
                break;
            }
        }

        // calculate weekly salary
        if (targetEmployee != null) {
            List<Integer> hoursWorkedPerDay = new ArrayList<>();

            //clock in and clock out times for each day of the week
            for (int i = 0; i < 5; i++)
            {
                System.out.print("Enter clock in time for day " + (i + 1) + " (format: HH:MM): ");
                String clockInTime = scanner.next();
                System.out.print("Enter clock out time for day " + (i + 1) + " (format: HH:MM): ");
                String clockOutTime = scanner.next();

                // parsing the hours and minutes from the input strings
                int clockInHours = Integer.parseInt(clockInTime.split(":")[0]);
                int clockInMinutes = Integer.parseInt(clockInTime.split(":")[1]);
                int clockOutHours = Integer.parseInt(clockOutTime.split(":")[0]);
                int clockOutMinutes = Integer.parseInt(clockOutTime.split(":")[1]);

                // calculate total minutes worked
                int totalMinutesWorked = (clockOutHours - clockInHours) * 60 + (clockOutMinutes - clockInMinutes);

                // caclulate horus worked
                int hoursWorked = totalMinutesWorked / 60;
                int minutesRemainder = totalMinutesWorked % 60;

                // total hours worked per day add to list
                hoursWorkedPerDay.add(hoursWorked);

                // print total hours worked for day
                System.out.println("Total Hours Worked for day " + (i + 1) + ": " + hoursWorked + " hours " + minutesRemainder + " minutes");
            }

            // calculate the total weekly hours
            int totalWeeklyHours = hoursWorkedPerDay.stream().mapToInt(Integer::intValue).sum();
            System.out.println("Total Weekly Hours Worked: " + totalWeeklyHours + " hours");

            // calculate the weekly salary using the employee's hourly rate
            double hourlyRate = targetEmployee.getHourlyRate();
            double weeklySalary = totalWeeklyHours * hourlyRate;
            System.out.println("Gross Weekly Salary: PHP" + weeklySalary);
        } else {
            System.out.println("Employee not found.");
        }
    }

    // method to calculate the gross wage for an employee
    private static void calculateGrossWage(Scanner scanner, List<PayrollMotorPH> employees) {
        System.out.print("Enter the Employee Number: ");
        int empNumber = scanner.nextInt();

        // search for the employee with the given employee number
        PayrollMotorPH targetEmployee = null;
        for (PayrollMotorPH employee : employees) {
            if (employee.employeeNumber == empNumber) {
                targetEmployee = employee;
                break;
            }
        }

        // calculate the gross wage
        if (targetEmployee != null) {
            double basicSalary = targetEmployee.getBasicSalary();
            double riceSubsidy = targetEmployee.getRiceSubsidy();
            double phoneAllowance = targetEmployee.getPhoneAllowance();
            double clothingAllowance = targetEmployee.getClothingAllowance();

            // calculate the gross wage components
            double totalAllowances = riceSubsidy + phoneAllowance + clothingAllowance;
            double grossWage = basicSalary + totalAllowances;

            // display breakdown
            System.out.println("Basic Salary: PHP" + basicSalary);
            System.out.println("Rice Subsidy: PHP" + riceSubsidy);
            System.out.println("Phone Allowance: PHP" + phoneAllowance);
            System.out.println("Clothing Allowance: PHP" + clothingAllowance);
            System.out.println("Total Allowances: PHP" + totalAllowances);
            System.out.println("Gross Wage for " + targetEmployee.getFullName() + ": PHP" + grossWage);
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static double calculateSSSDeduction(double basicSalary) {
        if (basicSalary <= 3250) {
            return 135.00;
        } else if (basicSalary <= 3750) {
            return 157.50;
        } else if (basicSalary <= 4250) {
            return 180.00;
        } else if (basicSalary <= 4750) {
            return 202.50;
        } else if (basicSalary <= 5250) {
            return 225.00;
        } else if (basicSalary <= 5750) {
            return 247.50;
        } else if (basicSalary <= 6250) {
            return 270.00;
        } else if (basicSalary <= 6750) {
            return 292.50;
        } else if (basicSalary <= 7250) {
            return 315.00;
        } else if (basicSalary <= 7750) {
            return 337.50;
        } else if (basicSalary <= 8250) {
            return 360.00;
        } else if (basicSalary <= 8750) {
            return 382.50;
        } else if (basicSalary <= 9250) {
            return 405.00;
        } else if (basicSalary <= 9750) {
            return 427.50;
        } else if (basicSalary <= 10250) {
            return 450.00;
        } else if (basicSalary <= 10750) {
            return 472.50;
        } else if (basicSalary <= 11250) {
            return 495.00;
        } else if (basicSalary <= 11750) {
            return 517.50;
        } else if (basicSalary <= 12250) {
            return 540.00;
        } else if (basicSalary <= 12750) {
            return 562.50;
        } else if (basicSalary <= 13250) {
            return 585.00;
        } else if (basicSalary <= 13750) {
            return 607.50;
        } else if (basicSalary <= 14250) {
            return 630.00;
        } else if (basicSalary <= 14750) {
            return 652.50;
        } else if (basicSalary <= 15250) {
            return 675.00;
        } else if (basicSalary <= 15750) {
            return 697.50;
        } else if (basicSalary <= 16250) {
            return 720.00;
        } else if (basicSalary <= 16750) {
            return 742.50;
        } else if (basicSalary <= 17250) {
            return 765.00;
        } else if (basicSalary <= 17750) {
            return 787.50;
        } else if (basicSalary <= 18250) {
            return 810.00;
        } else if (basicSalary <= 18750) {
            return 832.50;
        } else if (basicSalary <= 19250) {
            return 855.00;
        } else if (basicSalary <= 19750) {
            return 877.50;
        } else if (basicSalary <= 20250) {
            return 900.00;
        } else if (basicSalary <= 20750) {
            return 922.50;
        } else if (basicSalary <= 21250) {
            return 945.00;
        } else if (basicSalary <= 21750) {
            return 967.50;
        } else if (basicSalary <= 22250) {
            return 990.00;
        } else if (basicSalary <= 22750) {
            return 1012.50;
        } else if (basicSalary <= 23250) {
            return 1035.00;
        } else if (basicSalary <= 23750) {
            return 1057.50;
        } else if (basicSalary <= 24250) {
            return 1080.00;
        } else if (basicSalary <= 24750) {
            return 1102.50;
        } else {
            return 1125.00;
        }
    }
    // method to calculate PhilHealth deduction

    private static double calculatePhilhealthDeduction(double basicSalary) {
        // phlHealth contribution rate is 3% of the monthly basic salary, divided by 2
        double philhealthRate = 0.03; // 3%
        double philhealthDeduction = (basicSalary * philhealthRate) / 2;
        return philhealthDeduction;
    }

    // method to calculate pagibig deduction
    private static double calculatePagibigDeduction(double basicSalary) {
        // Pag-IBIG contribution rate depends on the monthly basic salary
        double pagibigRate;
        if (basicSalary >= 1000 && basicSalary <= 1500) {
            pagibigRate = 0.01; // 1% for basic salary between 1000 and 1500
        } else {
            pagibigRate = 0.02; // 2% for basic salary over 1500
        }
        double pagibigDeduction = basicSalary * pagibigRate;
        return pagibigDeduction;
    }


    // calculate net wage
    private static void calculateNetWage(Scanner scanner, List<PayrollMotorPH> employees) {
        System.out.print("Enter the Employee Number: ");
        int empNumber = scanner.nextInt();

        // employee with the target number
        PayrollMotorPH targetEmployee = null;
        for (PayrollMotorPH employee : employees) {
            if (employee.employeeNumber == empNumber) {
                targetEmployee = employee;
                break;
            }
        }

        // If the employee exists, calculate net wage
        if (targetEmployee != null) {
            // Calculate gross wage
            double basicSalary = targetEmployee.getBasicSalary();
            double riceSubsidy = targetEmployee.getRiceSubsidy();
            double phoneAllowance = targetEmployee.getPhoneAllowance();
            double clothingAllowance = targetEmployee.getClothingAllowance();
            double grossWage = basicSalary + riceSubsidy + phoneAllowance + clothingAllowance;

            // government contribution deductions
            double sssDeduction = calculateSSSDeduction(basicSalary);
            double philhealthDeduction = calculatePhilhealthDeduction(basicSalary);
            double pagibigDeduction = calculatePagibigDeduction(basicSalary);

            // taxable income
            double contributionDeductions = pagibigDeduction + sssDeduction + philhealthDeduction;
            double taxableIncome = basicSalary - contributionDeductions;

            // withholding tax
            double tax = 0.0;
            if (taxableIncome < 20832) {
                tax = 0.0;
            } else if (taxableIncome >= 20833 && taxableIncome < 33333) {
                tax = taxableIncome * 0.20;
            } else if (taxableIncome >= 33333 && taxableIncome < 66667) {
                tax = 2500 + (taxableIncome * 0.25);
            } else if (taxableIncome >= 66667 && taxableIncome < 166667) {
                tax = 10833 + (taxableIncome * 0.30);
            } else if (taxableIncome >= 166667 && taxableIncome < 666667) {
                tax = 40833.33 + (taxableIncome * 0.32);
            } else {
                tax = 200833.33 + (taxableIncome  * 0.35);
            }

            // total deductions
            double totalDeductions = tax + sssDeduction + philhealthDeduction + pagibigDeduction;

            // net wage
            double netWage = grossWage - totalDeductions;

            // Display breakdown
            System.out.println("Gross Wage: PHP" + grossWage);
            System.out.println("Withholding Tax: PHP" + tax);
            System.out.println("SSS Deduction: PHP" + sssDeduction);
            System.out.println("PhilHealth Deduction: PHP" + philhealthDeduction);
            System.out.println("Pag-IBIG Deduction: PHP" + pagibigDeduction);
            System.out.println("Total Deductions: PHP" + totalDeductions);
            System.out.println("Net Wage for " + targetEmployee.getFullName() + ": PHP" + netWage);
        } else {
            System.out.println("Employee not found.");
        }
    }
}
