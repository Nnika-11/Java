
### Read All Wiki
## Comparable Interface

The `Comparable` interface in Java is used to order the objects of a user-defined class.
It contains only one method, `compareTo(Object)`, which provides a single sorting sequence.
This interface is part of the `java.lang` package.

[Example](https://github.com/Nnika-11/Java/blob/master/Compareble_Comparator/ComparableTestEstimation.java)
1. Create your class
2. Implement Comparable \<Generic>\
   <sup>(Generic is usually YourClassName)</sup>
3. Override `compareTo` method
4. Create an Array/Collection of YourClassName elements and populate the array 
5. Use the Arrays/Collections.`sort()` function

`X.compareTo(Y)`\
Params:\
x – the first obj to compare \
y – the second obj to compare

Returns:\
the value 0 if x == y;\
a value less than 0 if x < y; \
and a value greater than 0 if x > y;


## Comparator Interface
The `Comparator` interface in Java is used to order the objects of a user-defined class.
It provides a way to define **multiple sorting** sequences in the `compare(Object, Object)` method, unlike the Comparable interface, 
which provides a single sorting sequence.


<details>
  <summary> <b> Exercise </b> </summary>

### 1. Sorting Movies by Title
Create a Movie class and implement the
Comparable interface to sort the movies by their titles in alphabetical order.
Check the resul by running:
```java
public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 2010, 8.8));
        movies.add(new Movie("The Godfather", 1972, 9.2));
        movies.add(new Movie("Interstellar", 2014, 8.6));

        Collections.sort(movies);

        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
```

### 2. Sorting Movies by Complex Criteria
Create a Movie class and use multiple custom comparators to sort Movie objects by a complex set of criteria:
first by genre, then by rating (in descending order),
and finally by release year (in ascending order).
There will be null values for ratings.

Check the resul by running:
```java
public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 2010, 8.8, "Sci-Fi"));
        movies.add(new Movie("The Godfather", 1972, 9.2, "Crime"));
        movies.add(new Movie("Interstellar", 2014, 8.6, "Sci-Fi"));
        movies.add(new Movie("The Dark Knight", 2008, 9.0, "Action"));
        movies.add(new Movie("The Shawshank Redemption", 1994, 9.3, "Drama"));
        movies.add(new Movie("Tenet", 2020, null, "Sci-Fi"));
        movies.add(new Movie("Joker", 2019, 8.5, "Drama"));

        //add your code to sort collection of movies

        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
```
</details>