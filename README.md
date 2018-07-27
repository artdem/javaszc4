# javaszc4
Zadania domowe przewidziane na okres 23.07 - 29.07

Kategoria: Klasy, dziedziczenie

Wszystkie zadania mogą zostać zrobione w jednym projekcie. Proszę tylko w klasie Main
wykorzystać komentarzę, które będą mówiły o tym które zadanie jest teraz wykonywane. Po
uruchomieniu programu powinny zostać wykonane wszystkie zadania.

Przykład:
public class Main {
public static void main(String[] args) {
//Klasy i dziedziczenie
//Zadanie 1
.....
//Zadanie 2
....
//Zadanie 3
….
//Listy
}
}

WAŻNE!
Wszystkie klasy mają być tworzone w nowych plikach .java

Zadanie 1)
● Stworzyć klasę Zwierzę, która będzie zawierała pola: (String)imię, (Integer)wiek.
● Stworzyć klasę Pies i Kot, które będą dziedziczyły po klasie Zwierze.
● Klasy Pies i Kot nie posiadają swoich własnych pól.
● Klasa Zwierzę powinna posiadać konstruktor publiczny, który przyjmie wszystkie pola
opisane powyżej.
● W klasie Zwierze dodać metodę toString()
● W metodzie main stworzyć jeden obiekt klasy Pies i jeden obiekt klasy Kot i wypisać
je na ekran.

Zadanie 2)
Rozbudowa Zadania 1.
● Dodać do klasy Zwierzę metodę, która będzie wypisywać na ekran “Jestem Zwierzę”.
● Dodać w klasach Pies i Kot nadpisywanie metody(@Override), która została
stworzona w klasie Zwierzę. Metoda dla Psa powinna wypisać na ekran “Jestem
Pies” a dla Kota “Jestem Kot”
● W metodzie main wywołać dla Psa i Kota tą metodę, którą stworzyliśmy.

Zadanie 3)
Rozbudowa zadań: 1 i 2.
● Stworzyć dwa Enum’y :
○ Pierwszy enum: będzie zawierał rasy psów (dodać po 3 rasy)
○ Drugi enum : będzie zawierał rasy kotów(dodać po 3 rasy)
● Do klasy Pies dodać dodać pole rasa, które będzie zawierało Enum przygotowany
dla psa.
● Do klasy Kot dodać dodać pole rasa, które będzie zawierało Enum przygotowany dla
kota

Zadanie 4)
Rozbudowa zadań: 1 , 2 i 3
● Stworzyć klasę Człowiek, która będzie zawierała pola, imię, nazwisko
● Klasa człowiek powinna zawierać konstruktor publiczny, który będzie przyjmował
wszystkie pola jako argumenty
● Stworzyć klasę Dane Adresowe, która będzie zawierała pola dotyczące adresu,
numeru telefonu, maila itp.
● Do klasy Człowiek dodać dwa kolejne pola:
○ Pole zwierzę, które będzie typu Zwierzę
○ Pole dane adresowe, które będzie typu Dane Adresowe
● W metodzie main, stworzyć dwa obiekty klasy Człowiek:
○ Dla jednego obiektu w polu zwierzę przypisać obiekt klasy Pies(który został
stworzony we wcześniejszych zadaniach)
○ Dla drugiego obiektu w polu zwierzę przypisać obiekt klasy Kot(który został
stworzony we wcześniejszych zadaniach)

Zadanie 5)
Rozbudowa zadań: 1 , 2 ,3 i 4
● Do klasy Człowiek dodać nową metodę która będzie wypisywać : “ Cześć nazywam
się [tutaj powinniśmy wypisać imię i nazwisko ]”
● Przeciążyć powyższą metodę, która będzie dodawała dodatkowy tekst, który będzie
przyjmowany jako parametr metody. Przykład w parametrze metody przeciążonej
podamy “Kocham zwierzęta”. Tekst, który zostanie wyświetlony to : “ Cześć
nazywam się [tutaj powinniśmy wypisać imię i nazwisko ]. Kocham zwierzęta “
● W metodzie main wywołać:
○ metodę w wersji “podstawowej” bez argumentów
○ metodę w wersji “rozszerzonej” z argumentem np. “Kocham zwierzęta”
Kategoria: Listy

Zadanie 6)
Wszystkie poniższe rzeczy wykonujemy w metodzie main
● Stworzyć listę, która będzie zawierała elementy typu String
● Do listy dodajmy 10 elementy wykorzystując metodę add()
● Wyświetlamy listę za pomocą zwykłej pętli for
● Wyświetlamy listę za pomocą pętli foreach

Zadanie 7)
● Stworzyć listę, która będzie zawierała elementy typu Integer
● Do listy dodajemy 15 elementów poprzez wykorzystanie Arrays.asList ()
● Wyświetlamy wszystkie elementy listy za pomocą foreach
● Wyświetlamy wielkość listy
● Usuwamy pierwszy i ostatni element listy
● Wyświetlamy wielkość listy

Zadanie 8)
● Tworzymy klasę Książka, która będzie zawierała pola tytuł, autor, liczba stron,
wydawnictwo.
● Tworzymy 11 obiektów klasy Książka
● Dodajemy je do listy, która będzie przechowywać książki(sposób dodania dowolny)
● Wyświetlamy wszystkie elementy za pomocą System.out.println(...)
● Usuwamy środkowy element listy
● Wyświetlamy wszystkie elementy za pomocą System.out.println(...)
● Wyświetlamy wielkość listy
● Przechodzimy po liście(for, foreach) i wyświetlamy tylko książki, które mają powyżej
200 stron

Zadanie 9)
Rozbudowa zadania : 8
● Tworzymy drugą listę która będzie również zawierać książki
● Dodajemy do tej listy 4 obiekty klasy Książka
● Powinniśmy mieć 2 listy jedna z zadania 8, która posiada 10 obiektów i drugą która
posiada 4 elementy
● Do listy, która posiada 10 elementów dodajemy naszą drugą listę(która ma 4
elementy). Wykorzystujemy do tego metodę addAll(...)
● Wyświetlamy wielkość listy
● Wyświetlamy wszystkie elementy listy.
