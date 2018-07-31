package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Zadania domowe przewidziane na okres 23.07 - 29.07
//        Kategoria: Klasy, dziedziczenie

//        Zadanie 1:
        System.out.println("Zadanie 1:\n");

        Cat pussy = new Cat("Pussy", 5);
        Dog spike = new Dog("Spike", 3);

        System.out.println(pussy.toString());
        System.out.println(spike.toString());

//        Zadanie 2:
        System.out.println("\nZadanie 2:\n");

        pussy.iAmAnimal();
        spike.iAmAnimal();

//        Zadanie 3 i 4:

        Human artur = new Human("Artur", "Kowalski");
        Human janina = new Human("Janina", "Nowak");

        artur.setHumansAnimal(spike);
        artur.getHumansAnimal();

        janina.setHumansAnimal(pussy);
        janina.getHumansAnimal();

//        Zadanie 5:
        System.out.println("\nZadanie 5:\n");

        artur.introduce();
        artur.introduce("Kocham zwierzęta.");

//        Kategoria: Listy
//        Zadanie 6:

        System.out.println("\nZadanie 6:\n");

        List<String> list = new ArrayList();
        list.add("First Element");
        list.add("Second Element");
        list.add("Third Element");
        list.add("Fourth Element");
        list.add("Fifth Element");
        list.add("Sixth Element");
        list.add("Seventh Element");
        list.add("Eight Element");
        list.add("Ninth Element");
        list.add("Tenth Element");

        System.out.println("Wyświetlam listę za pomocą pętli for.");
        for (int i = 0; i < (list.size()); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nWyświetlam listę za pomocą pętli foreach.");
        for (String item : list) {
            System.out.println(item);
        }

//        Zadanie 7:
        System.out.println("\nZadanie 7:\n");

        List<Integer> listInteger = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        System.out.println("Wyświetlam listę:");
        for (int i : listInteger) {
            System.out.print(i + ", ");
        }
        System.out.println("\n\nLista zawiera " + listInteger.size() + " elementów.\n");
        listInteger.remove(0);
        listInteger.remove(listInteger.size() - 1);
        System.out.println("Lista po korekcie zawiera " + listInteger.size() + " elementów.");

//         Zadanie 8:
        System.out.println("\nZadanie 8:\n");

        Book bookOne = new Book("A ja żem jej powiedziała...", "Katarzyna Nosowska", 208, "Wielka Litera");
        Book bookTwo = new Book("Majami. Zły pies", "Artur Górski", 224, "Prószyński Media");
        Book bookThree = new Book("Chaos. Nowy porządek świata", "Orzechowski Marek", 704, "Wydawnictwo MUZA S.A.");
        Book bookFour = new Book("Szkoła zabójców", "Brandon Webb", 480, "Akurat");
        Book bookFive = new Book("Nocna runda", "Lee Child", 432, "Wydawnictwo Albatros");
        Book bookSix = new Book("Poszukiwany", "Lee Child", 380, "Albatros");
        Book bookSeven = new Book("Sto milionów dolarów", "Lee Child", 416, "Albatros");
        Book bookEight = new Book("Wróg bez twarzy", "Lee Child", 448, "Albatros");
        Book bookNine = new Book("Uprowadzony", "Lee Child", 480, "Albatros");
        Book bookTen = new Book("Nigdy nie wracaj ", "Lee Child", 480, "Albatros");
        Book bookEleven = new Book("Echo w płomieniach", "Lee Child", 448, "Albatros");

        List<Book> bookList = new ArrayList<>(Arrays.asList(bookOne, bookTwo, bookThree, bookFour, bookFive, bookSix, bookSeven, bookEight, bookNine, bookTen, bookEleven));

        for (Book i : bookList) {
            System.out.println(i);
        }

        bookList.remove(bookList.size() / 2);
        System.out.println("\nRozmiar listy po poprawkach: " + bookList.size());


        System.out.println("\nLista po poprawkach.");
        for (Book i : bookList) {
            System.out.println(i);
        }


//      W poleceniu dotyczącym wyświetlania książek, które mają powyżej 200 stron zmieniłem zakres na 400,
//      ponieważ wszystkie książki umieszczone w spełniały ten warunek.

        //TODO ok :)

        System.out.println("\nWyświetlam książki, które mają ponad 400 stron.");
        for (Book i : bookList) {
            if (i.getPages() > 400) {
                System.out.println(i);
            }
        }

        for (int i = 0; bookList.get(i).getPages() > 400; i++) {
            System.out.println(bookList.get(i));
        }

//      Zadanie 9:
        System.out.println("\nZadanie 9:\n");

        Book bookTwoOne = new Book("Elementarz", "Praca zbiorowa", 78, "PWN");
        Book bookTwoTwo = new Book("Apartament w Paryżu", "Guillaume Musso",400, "Albatros");
        Book bookTwoThree = new Book("Za zamkniętymi drzwiami", "B.A. Paris", 304, "Albatros");
        Book bookTwoFour = new Book("To", "Steven King", 360, "Albatros");

        List<Book> bookListTwo = new ArrayList<>(Arrays.asList(bookTwoOne, bookTwoTwo, bookTwoThree, bookTwoFour));

        bookList.addAll(bookListTwo);

        System.out.println("Wielkość połączonych list: " + bookList.size() +"\n");

        System.out.println("Wszystkie elementy listy:");
        for (Book i : bookList){
            System.out.println(i);
        }
    }
}


