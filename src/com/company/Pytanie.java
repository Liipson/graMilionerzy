package com.company;
import java.util.Random;
import java.util.Scanner;

public class Pytanie
{

    String[] pytanie ={"1.Jakiego koloru jest zolty maluch?","2.Jaki pierwiastek jest symbolizowany przez H","Co jest ciezsze kilogram pierzu czy kilogram gwozdzi","Dokoncz cytat 'dawno temu ja tez zaufalem pewnej kobiecie wtedy dalbym sobie za nia reke uciac. I wiesz co...'"};
    String[] opcjaA ={"A.Zoltego", "A.Miedz", "A.Kilogram Pierzu", "A.I bym stracil noge"};
    String[] opcjaB ={"B.Czerwonego", "B.Zelazo", "B.Waza tyle samo", "B.I by nic sie nie zmienilo"};
    String[] opcjaC ={"C.Zielonego", "C.Wodor", "C.Kilogram gwozdzi", "C.I bym nadal mial 2 rece"};
    String[] opcjaD ={"D.Niebieskiego", "D.Tlen", "D.Tak", "D.I bym teraz, k***a, nie mial reki"};

    String[] poprawnaOdp ={"A", "C", "B", "D"};  //indeks świadczy o pytaniu 1,2,3,4 a litera w odpowiednim indeksie to prawidlowa odpowiedz


    public void maszynalosujaca()
    {
        int zebranePunkty=0;
        Scanner wejscie = new Scanner(System.in);

        Random random = new Random();
        int[] a = new int[4];

        for (int i=0; i<a.length;i++)
        {
            a[i]=random.nextInt(4);

            for(int j=0; j<i; j++)
            {
                if(a[i]==a[j])
                {
                    i--;
                    break;
                }
            }
        }

        for(int i=0; i<a.length;i++)
        {
            System.out.println(pytanie[a[i]]);
            System.out.println(opcjaA[a[i]]);
            System.out.println(opcjaB[a[i]]);
            System.out.println(opcjaC[a[i]]);
            System.out.println(opcjaD[a[i]]);
            System.out.println("Wpisz jedna z czterech liter: A,B,C,D");
            String odpowiedzUzytkownika = wejscie.nextLine();
            if(odpowiedzUzytkownika.equals(poprawnaOdp[a[i]]))
            {
                System.out.println("Brawo poprawna odpowiedz");
                zebranePunkty++;
            }
            else
            {
             System.out.println("Niestety podana odpowiedz nie jest poprawna");
            }

        }

    System.out.println("Udalo ci sie uzyskac "+zebranePunkty+" na "+a.length+" mozliwych do uzyskania punktow");
    }

}



