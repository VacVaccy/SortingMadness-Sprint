## SortingMadness-Sprint

Aplikacja służąca do sortowania zbiorów danych różnymi algorytmami. Ma pomóc użytkownikowi w ocenie, która metoda może się najlepiej sprawdzić w konkretnych przypadkach oraz, oczywiście, w uporządkowaniu danych. Dane liczbowe są sortowane standardowo, natomiast tekstowe - leksykograficznie. Należy zaimplementować co najmniej 6 różnych metod sortowania. Aplikacja będzie dostępna poprzez GUI, a także jako zdalne API, dzięki czemu można zintegrować z istniejącymi narzędziami.

### Sposób użycia

#### Kompilacja projektu

```sh
mvn clean compile
```

#### Tworzenia pliku .jar

```sh
mvn clean package
```

#### Uruchamianie z konsoli

```sh
mvn spring-boot:run
```

### Algorytmy sortowania

| Numer  | Nazwa algorytmu     |
|--------|---------------------|
| 1      | Bubble Sort         |
| 2      | Selection Sort      |
| 3      | Insertion Sort      |
| 4      | Quick Sort          |
| 5      | Heap Sort           |
| 6      | Shell Sort          |


### Przykładowe zapytania GET
###### Dla liczb całkowitych
```
http://localhost:8080/app/sortingmadness/sort?data=<lista liczb całkowitych>&algorithms=<numery algorytmów>
http://localhost:8080/app/sortingmadness/sort?data=1,-2,0,54,-4,0,12,-63&algorithms=1,2,6,5,4,3,1
```

###### Dla ciągów znaków
```
http://localhost:8080/app/sortingmadness/sort?data=<lista ciągów znaków>&algorithms=<numery algorytmów>
http://localhost:8080/app/sortingmadness/sort?data=1a,2,6,3,-12&algorithms=4,1,2
```

### Przykładowe zapytania POST
###### Dla liczb całkowitych
```
{
  "sorts": ["1", "5", "3", "1"],
  "data": [1, -2, 0, 54, -4, 0, 12, -63]
}
```

###### Dla ciągów znaków
```
{
  "sorts": ["4", "2", "6"],
  "data": [1,-1, "a3", "x5fzz", "Xysdzx3"]
}
```

### Autorzy
- Jakub Urbaniak
- Wojciech Wróbel

### Przydatne linki:

##### [DOD](https://docs.google.com/spreadsheets/d/e/2PACX-1vTn6j3M8pmGEzrsQk8mXse7lVHUdhYWkfxbkQiYI23rBtwM4N3bWw0qtupW-gesfCkcYasnZ-eEXl-F/pubhtml)

##### [Zadania - Trello](https://trello.com/b/1zwqhHnm/sortingmadness)

##### [DOKUMENTACJA](https://vacvaccy.github.io/SortingMadness-Sprint/)
