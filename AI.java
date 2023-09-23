import java.util.Scanner;

class MarkSheet {
    private String name;
    private String fatherName;
    private String motherName;
    private String collegeName;
    private String semester;
    private int year;
    private int rollNumber;
    private int physicsMarks;
    private int chemistryMarks;
    private int mathMarks;
    private int hindiMarks;
    private int englishMarks;
    private int totalMarks;
    private double percentage;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSemester() {
        return semester;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setPhysicsMarks(int physicsMarks) {
        this.physicsMarks = physicsMarks;
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public void setChemistryMarks(int chemistryMarks) {
        this.chemistryMarks = chemistryMarks;
    }

    public int getChemistryMarks() {
        return chemistryMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setHindiMarks(int hindiMarks) {
        this.hindiMarks = hindiMarks;
    }

    public int getHindiMarks() {
        return hindiMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void calculateTotalMarks() {
        totalMarks = physicsMarks + chemistryMarks + mathMarks + hindiMarks + englishMarks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void calculatePercentage() {
        percentage = (double) totalMarks / 5;
    }

    public double getPercentage() {
        return percentage;
    }
}

 class MarkSheetGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of mark sheets to generate: ");
        int numberOfMarkSheets = scanner.nextInt();

        MarkSheet[] markSheets = new MarkSheet[numberOfMarkSheets];

        for (int i = 0; i < numberOfMarkSheets; i++) {
            MarkSheet markSheet = new MarkSheet();

            System.out.println("\nEnter details for mark sheet " + (i + 1));

            System.out.print("Name: ");
            markSheet.setName(scanner.next());

            System.out.print("Father's Name: ");
            markSheet.setFatherName(scanner.next());

            System.out.print("Mother's Name: ");
            markSheet.setMotherName(scanner.next());

            System.out.print("College Name: ");
            markSheet.setCollegeName(scanner.next());

            System.out.print("Semester: ");
            markSheet.setSemester(scanner.next());

            System.out.print("Year: ");
            markSheet.setYear(scanner.nextInt());

            boolean duplicateRollNumber;
            do {
                duplicateRollNumber = false;
                System.out.print("Roll Number: ");
                int rollNumber = scanner.nextInt();
                for (int j = 0; j < i; j++) {
                    if (markSheets[j].getRollNumber() == rollNumber) {
                        duplicateRollNumber = true;
                        System.out.println("Roll Number already exists. Please enter a unique Roll Number.");
                        break;
                    }
                }
                markSheet.setRollNumber(rollNumber);
            } while (duplicateRollNumber);

            do {
                System.out.print("Physics Marks: ");
                int physicsMarks = scanner.nextInt();
                if (physicsMarks >= 0 && physicsMarks <= 100) {
                    markSheet.setPhysicsMarks(physicsMarks);
                    break;
                } else {
                    System.out.println("Invalid Physics Marks. Please enter marks between 0 and 100.");
                }
            } while (true);

            do {
                System.out.print("Chemistry Marks: ");
                int chemistryMarks = scanner.nextInt();
                if (chemistryMarks >= 0 && chemistryMarks <= 100) {
                    markSheet.setChemistryMarks(chemistryMarks);
                    break;
                } else {
                    System.out.println("Invalid Chemistry Marks. Please enter marks between 0 and 100.");
                }
            } while (true);

            do {
                System.out.print("Math Marks: ");
                int mathMarks = scanner.nextInt();
                if (mathMarks >= 0 && mathMarks <= 100) {
                    markSheet.setMathMarks(mathMarks);
                    break;
                } else {
                    System.out.println("Invalid Math Marks. Please enter marks between 0 and 100.");
                }
            } while (true);

            do {
                System.out.print("Hindi Marks: ");
                int hindiMarks = scanner.nextInt();
                if (hindiMarks >= 0 && hindiMarks <= 100) {
                    markSheet.setHindiMarks(hindiMarks);
                    break;
                } else {
                    System.out.println("Invalid Hindi Marks. Please enter marks between 0 and 100.");
                }
            } while (true);

            do {
                System.out.print("English Marks: ");
                int englishMarks = scanner.nextInt();
                if (englishMarks >= 0 && englishMarks <= 100) {
                    markSheet.setEnglishMarks(englishMarks);
                    break;
                } else {
                    System.out.println("Invalid English Marks. Please enter marks between 0 and 100.");
                }
            } while (true);

            markSheet.calculateTotalMarks();
            markSheet.calculatePercentage();

            markSheets[i] = markSheet;
        }

        System.out.println("\nMark Sheets:");
        for (int i = 0; i < numberOfMarkSheets; i++) {
            MarkSheet markSheet = markSheets[i];
            System.out.println("\nMark Sheet " + (i + 1));
            System.out.println("Name: " + markSheet.getName());
            System.out.println("Father's Name: " + markSheet.getFatherName());
            System.out.println("Mother's Name: " + markSheet.getMotherName());
            System.out.println("College Name: " + markSheet.getCollegeName());
            System.out.println("Semester: " + markSheet.getSemester());
            System.out.println("Year: " + markSheet.getYear());
            System.out.println("Roll Number: " + markSheet.getRollNumber());
            System.out.println("Physics Marks: " + markSheet.getPhysicsMarks());
            System.out.println("Chemistry Marks: " + markSheet.getChemistryMarks());
            System.out.println("Math Marks: " + markSheet.getMathMarks());
            System.out.println("Hindi Marks: " + markSheet.getHindiMarks());
            System.out.println("English Marks: " + markSheet.getEnglishMarks());
            System.out.println("Total Marks: " + markSheet.getTotalMarks());
            System.out.println("Percentage: " + markSheet.getPercentage() + "%");
			System.out.println("|________________________________________________________________________________________");
		System.out.println("|\t\t\t\t<"+college+">");
		System.out.println("|\t\t\t\t________________");
		System.out.println("|                                                                                         ");
		System.out.println("|\tRoll        : "+rollno+"\t\t\t\t\tCourse :\t "+course+"      ");
		System.out.println("|\tName        : "+name+"\t\t\t\t\tBranch : "+branch+"  ");
		System.out.println("|\tFather Name : "+father+"\t\t\t\t\tSem  : "+semester+"      ");
		System.out.println("|\tMother Name : "+mother+"\t\t\t\t\tYear : "+year+"     ");
		System.out.println("|");
		System.out.println("|__________________________________________________________________________________________");
		System.out.println("|\tSubCode      SubName       MaxMarks      MinMarks      ObtMark    ");
		System.out.println("|__________________________________________________________________________________________");
		System.out.println("|\tBSC101       physics        100            33            "+phy+"       ");
		System.out.println("|------------------------------------------------------------------------------------------");
		System.out.println("|\tBSC102       chemeistry     100            33            "+chemistry+"       ");
		System.out.println("|------------------------------------------------------------------------------------------");
		System.out.println("|\tBSC103       Maths          100            33            "+maths+"       ");
		System.out.println("|------------------------------------------------------------------------------------------");
		System.out.println("|\tBSC104       Hindi          100            33            "+hindi+"       ");
		System.out.println("|------------------------------------------------------------------------------------------");
		System.out.println("|\tBSC105       English        100            33            "+english+"       ");
		System.out.println("|------------------------------------------------------------------------------------------");
		System.out.println("|\t\t\t\t\t\t\t\t\t  ");
		System.out.println("|\t\t\t\t\t\t\t\t\t  ");
		System.out.println("|\t\t\t\t\t\t\t\t\t  ");
		/*------------------------------------------------------------*/
        }

        System.out.println("\nSearch by:");
        System.out.println("1. Name");
        System.out.println("2. Roll Number");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the name to search: ");
                String searchName = scanner.next();
                boolean found = false;
                for (int i = 0; i < numberOfMarkSheets; i++) {
                    MarkSheet markSheet = markSheets[i];
                    if (markSheet.getName().equalsIgnoreCase(searchName)) {
                        System.out.println("\nMark Sheet Found:");
                        System.out.println("Name: " + markSheet.getName());
                        System.out.println("Father's Name: " + markSheet.getFatherName());
                        System.out.println("Mother's Name: " + markSheet.getMotherName());
                        System.out.println("College Name: " + markSheet.getCollegeName());
                        System.out.println("Semester: " + markSheet.getSemester());
                        System.out.println("Year: " + markSheet.getYear());
                        System.out.println("Roll Number: " + markSheet.getRollNumber());
                        System.out.println("Physics Marks: " + markSheet.getPhysicsMarks());
                        System.out.println("Chemistry Marks: " + markSheet.getChemistryMarks());
                        System.out.println("Math Marks: " + markSheet.getMathMarks());
                        System.out.println("Hindi Marks: " + markSheet.getHindiMarks());
                        System.out.println("English Marks: " + markSheet.getEnglishMarks());
                        System.out.println("Total Marks: " + markSheet.getTotalMarks());
                        System.out.println("Percentage: " + markSheet.getPercentage() + "%");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("No mark sheet found for the given name.");
                }
                break;
            case 2:
                System.out.print("Enter the roll number to search: ");
                int searchRollNumber = scanner.nextInt();
                boolean found2 = false;
                for (int i = 0; i < numberOfMarkSheets; i++) {
                    MarkSheet markSheet = markSheets[i];
                    if (markSheet.getRollNumber() == searchRollNumber) {
                        System.out.println("\nMark Sheet Found:");
                        System.out.println("Name: " + markSheet.getName());
                        System.out.println("Father's Name: " + markSheet.getFatherName());
                        System.out.println("Mother's Name: " + markSheet.getMotherName());
                        System.out.println("College Name: " + markSheet.getCollegeName());
                        System.out.println("Semester: " + markSheet.getSemester());
                        System.out.println("Year: " + markSheet.getYear());
                        System.out.println("Roll Number: " + markSheet.getRollNumber());
                        System.out.println("Physics Marks: " + markSheet.getPhysicsMarks());
                        System.out.println("Chemistry Marks: " + markSheet.getChemistryMarks());
                        System.out.println("Math Marks: " + markSheet.getMathMarks());
                        System.out.println("Hindi Marks: " + markSheet.getHindiMarks());
                        System.out.println("English Marks: " + markSheet.getEnglishMarks());
                        System.out.println("Total Marks: " + markSheet.getTotalMarks());
                        System.out.println("Percentage: " + markSheet.getPercentage() + "%");
                        found2 = true;
                        break;
                    }
                }
                if (!found2) {
                    System.out.println("No mark sheet found for the given roll number.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
 }