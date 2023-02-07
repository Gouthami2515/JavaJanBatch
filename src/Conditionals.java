import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        double marks;
        char input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        marks = scanner.nextDouble();
        if(marks <=40)
            System.out.println("u need to study hard");
        else if (marks>40 && marks<=60)
            System.out.println("u need to improve");
        else if(marks>60 && marks<=80)
            System.out.println("Good. u can do better");
        else if (marks >80 && marks <=100)
            System.out.println("Excellent, keep it up");
        else
            System.out.println("invalid marks");
        System.out.println("*****select A for English*****");
        System.out.println("*****select B for Spanish*****");
        System.out.println("*****select C for Dutch*****");
        System.out.println("*****select D for French*****");
        System.out.println("*****select E for Russian*****");
        input = scanner.next().charAt(0);
        switch(input){
            case 'A' :
                System.out.println("selected english");
                break;
            case 'B' :
                System.out.println("selected spanish");
                break;
            case 'C' :
                System.out.println("selected dutch");
                break;
            case 'D' :
                System.out.println("selected French");
                break;
            case 'E' :
                System.out.println("selected russian");
                break;
            default:
                System.out.println("invalid input. please select from menu");
        }


    }
}
