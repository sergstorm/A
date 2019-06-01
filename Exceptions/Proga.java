package Exceptions;

import org.omg.PortableInterceptor.INACTIVE;

public class Proga {
   static int m;static int n;
    public static void main(String[] args) throws MyArraySizeException, InterruptedException, MyArrayDataException {
        System.out.println("First : ");
        String[][] b = new String[4][4];
        firstchek(b);
        Thread.sleep(265);

        System.out.println("Second :");
        String [][] c = new String [6][4];
        firstchek(c);

        Thread.sleep(226);
        System.out.println("Third");
        String[][] d = new String[4][4];
        fillmass(d);d[0][3] = "A";
        printmass(d);
        massivproverkarazmera(d);
        System.out.println("Summa "+summmass(d));
    }

    private static void firstchek(String[][] bass) throws MyArraySizeException, MyArrayDataException {

        fillmass(bass);
        printmass(bass);
        massivproverkarazmera(bass);
        System.out.println("Summa "+summmass(bass));
    }

    public static void printmass(String[][] massiv)
    {
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print(massiv[i][j]+" ");
            }
            System.out.println();
        }
    }
    public  static void fillmass(String[][] mass)
    {
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                mass[i][j]=String.valueOf((int)(Math.random()*10));
            }
        }
    }
    public static void massivproverkarazmera (String[][] a) throws MyArraySizeException {
        try {

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    n=i;m=j;
                    if (a[j].length>4 || a.length>4){
                        System.out.println("ne tot razmer Dlinna  bolshe 4"+"Stroka "+(n+1)+" Stolbec "+(m+1));break;
                          // throw new MyArraySizeException(n,m);
                    }
                }
                //System.out.println();
            }
            //System.out.println("SiZe OK ");
        }
        catch (Exception e)
        {
            System.out.println("ne tot razmer "+"Stroka "+(n+1)+" Stolbec "+(m+1));
            throw new MyArraySizeException(n,m);
        }
    }
    public static int summmass(String [][] massiva) throws MyArrayDataException {
        int summ=0;
        try {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    m=i;n=j;
                    try {
                        summ = summ+ Integer.parseInt(massiva[i][j]);
                    } catch (MyArrayDataException e) {
                        System.out.println(" Stroka" +m+" Stolbec"+n);
                    }
                }

            }

        }
        catch (Exception e){e.printStackTrace();}
        return summ;
    }
}
