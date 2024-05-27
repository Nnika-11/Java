
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
