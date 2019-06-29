package SearchInArrayPackage;

import java.util.Random;
import java.util.Scanner;

public class SearchInArray
{
    public static void main(String[] args)
    {

        Random gen = new Random();
        Scanner bl = new Scanner(System.in);

        String msg = "";
        boolean checkFlag = true;

        System.out.println("Searcher in array v1.0");
        System.out.println("Autor: Tomasz Rosik");
        System.out.println("**********************");

        do
        {
            System.out.println("Etap I - Generowanie tablicy do przeszukania");
            System.out.println("********************************************");
            System.out.print("Podaj wielkość tablicy od 1 do 10 : ");
            int countArray = bl.nextInt();

            if (countArray > 10 || countArray < 1)
            {
                System.out.println("Liczba musi być z zakresu 1 - 10 .");
            } else
            {
                msg = "Wygenerowana tablica to: [";
                int[] arrayToSearch = new int[countArray];
                for (int i = 0; i < arrayToSearch.length; i++)
                {
                    arrayToSearch[i] = Math.abs(gen.nextInt(99));
                    msg += i + "=>" + arrayToSearch[i] + ",";
                }
                msg += "]";
                msg = msg.replace(",]", "]");

                System.out.println(msg);
                System.out.println();

                System.out.println("Etap II - Wyszukaj liczbę w tablicy");
                System.out.println("***********************************");
                System.out.print("Podaj którą liczbę wyszukać: ");
                int numberSearch = bl.nextInt();

                int i;
                boolean found = false;
                for (i = 0; i < arrayToSearch.length; i++)
                {
                    if (arrayToSearch[i] == numberSearch)
                    {
                        found = true;
                        break;
                    }
                }

                if (found)
                {
                    System.out.format("Znaleziono liczbę: %d pod indeksem: %d \n", numberSearch, i);

                } else
                {
                    System.out.format("%d nie wystepuje w tablicy \n", numberSearch);
                }

                boolean endApp = false;
                do
                {
                    System.out.println("Chcesz wyszukiwać dalej ? \n Tak - 1 , Nie kończymy - 2");
                    int end = bl.nextInt();


                    switch (end)
                    {
                        case 1:
                            endApp = false;
                            break;
                        case 2:
                            endApp = false;
                            checkFlag = false;
                            break;
                        default:
                            endApp = true;
                            System.out.println("Wybierz 1 aby kontynuować lub wybierz 2 aby zakończyć wyszukiwanie");
                            break;
                    }


                } while (endApp);

            }


        } while (checkFlag);

        System.out.println("Koniec");

    }
}
