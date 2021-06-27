**(d)** Create a new project called Lab02d. Design and implement a program that computes and then reports the maximum number of flowers that can be planted in a triangular-shaped garden having sides of length **a** , **b** and **c** meters, assuming at most 17 flowers can be planted in each square meter. You can use [Heron's formula](http://web.archive.org/web/20191227213603/https://en.wikipedia.org/wiki/Heron%27s_formula) (below) to compute the area of the garden, but when computing the number of flowers, remember that partial flowers will die! _Tip:_ the Math class has a function Math.sqrt that you can use to compute the square root of a value.

![](http://web.archive.org/web/20191227213603im_/http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab02/triangle_withAnnotations.png)

Heron's formula: the  area of a  triangle  whose sides have lengths  **_a_** ,  _**b**_ , and  _**c**_  is

![A = \sqrt{s(s-a)(s-b)(s-c)},](http://web.archive.org/web/20191227213603im_/http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab02/HeronsAreaFormula2.png)

where  **_s_**  is the  semi-perimeter  of the triangle; that is

  ![s=\frac{a+b+c}{2}.](http://web.archive.org/web/20191227213603im_/http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab02/HeronsSemiPerimeterFormula.png)
