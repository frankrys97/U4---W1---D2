package esercizio1;

public class Esercizio1 {
    public static void main(String[] args) {

        System.out.println(isEven("ciao"));
        System.out.println(isEven("amico"));


        System.out.println(leapYear(2000));
        System.out.println(leapYear(2001));
        System.out.println(leapYear(2100));


    }

    public static boolean isEven(String str) {
        if (str.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

//    public static boolean leapYear(int year) {
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    return true;
//                } else {
//                    return false;
//                }
//            } else {
//                return true;
//            }
//        } else {
//            return false;
//        }
//    }

//    public static boolean leapYear2(int year) {
//        if (year % 4 == 0) {
//            if (year % 100 != 0 || year % 400 == 0) {
//                return true;
//            }
//        }
//        return false;
//    }
}


