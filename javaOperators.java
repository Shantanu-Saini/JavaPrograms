import java.util.*;
class javaOperators{
    public static void unary_opr(int num, char opr){
        switch(opr){
            case '1':
                System.out.println(num + "++ = " + ++num);
                break;
            case '2':
                System.out.println(num + "-- = " + --num);
                break;
            case '3':
                System.out.println("~" + num + " = " + ~num);
                break;
            case '4':
                System.out.println("-" + num + " = " + -num);
                break;
        }
    }
    public static int arit_opr(int a, int b, char opr){
                switch(opr){
                    case '+':
                        return (a+b);
                    case '-':
                        return (a-b);
                    case '*':
                        return (a*b);
                    case '/':
                        return (a/b);
                    case '%':
                        return (a%b);
                }
                return -1;
    }
    public static void rela_opr(int a, int b, char opr){
                switch(opr){
                    case '1':
                        System.out.println(a>b);
                        break;
                    case '2':
                        System.out.println(a<b);
                        break;
                    case '3':
                        System.out.println(a>=b);
                        break;
                    case '4':
                        System.out.println(a<=b);
                        break;
                    case '5':
                        System.out.println(a==b);
                        break;
                    case '6':
                        System.out.println(a!=b);
                        break;
                }
    }
    public static void tern_opr(int a, int b, char opr){
        int ans;
        switch(opr){
            case '1' :
                ans = (a>b) ? a : b;
                System.out.println("Maximum number is : " + ans);
                break;
            case '2' :
                ans = (a<b) ? a : b;
                System.out.println("Minimum number is : " + ans);
                break;
        }
    }
    public static void main(String args[]){
        Scanner val = new Scanner(System.in);
        
        System.out.println("Enter 1 for Unary Operators : ");
        System.out.println("Enter 2 for Binary Operators : ");
        System.out.println("Enter 3 for Ternary Operators : ");
        int input = val.nextInt();
        char bin_opr, opr;
        int ans, num1, num2, num3;
        switch(input){
            case 1 : 
                System.out.println("Unary Operator : ");
                System.out.println("Enetr any number : ");
                num1 = val.nextInt();
                System.out.println("Enter Operator(1 for ++, 2 for --, 3 for ~, 4 for -)");
                opr = val.next().charAt(0);
                unary_opr(num1, opr);
                break;
            case 2 : 
                System.out.println("Binary Operator : ");
                System.out.println("Enter A for Arithmetic Operators : ");
                System.out.println("Enter R for Relatonal Operators : ");
                bin_opr = val.next().charAt(0);
                switch(bin_opr){
                    case 'A' : 
                      System.out.println("Arithmetic Operator : ");
                      System.out.println("Enetr first number : ");
                      num1 = val.nextInt();
                      System.out.println("Enetr Second number : ");
                      num2 = val.nextInt();
                      System.out.println("Enetr Operator(+,-,*,/,%)");
                      opr = val.next().charAt(0);
                      ans = arit_opr(num1,num2,opr);
                      System.out.println("Answer = " + ans);
                      break;
                    case 'R' : 
                      System.out.println("Relatonal Operator : ");
                      System.out.println("Enetr first number : ");
                      num1 = val.nextInt();
                      System.out.println("Enetr Second number : ");
                      num2 = val.nextInt();
                      System.out.println("Enetr Operator(1 - >,2 - <,3 - >=, 4 - <=, 5 - ==, 6 - !=)");
                      opr = val.next().charAt(0);
                      rela_opr(num1,num2,opr);
                      break;
                }
                break;
            case 3 : 
                System.out.println("Ternary Operator : ");
                System.out.println("Enetr first number : ");
                num1 = val.nextInt();
                System.out.println("Enetr Second number : ");
                num2 = val.nextInt();
                System.out.println("Enter Any operation(1-Maximum, 2-Minimum) : ");
                opr = val.next().charAt(0);
                tern_opr(num1,num2,opr);
                break;
            default:
                 System.out.println("Invalid Input");
        }
    }
}