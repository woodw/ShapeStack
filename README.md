# ShapeStack
This is a kata excersie called "Circle Square Triangle"
## About
There is an object called ShapeStacker. You give this object a series of shape objects and ask it to "stack!". 
Which will be as though a person were laying down shapes on a table on top of each other.
They are stacked with the largest shape on bottom to the smallest shape on top so that you can see some portion of all the shapes.

##Example
<picture of example>

###Input
Add Square with side length: 10
Add Triangle with side 1:20, sides 2&3:22
Add Circle with diameter: 7
###Output
Prints "T[C[S]]"

##Coding
This is an Object-oriented excercise. At a minimum, you should code objects for ShapeStackerTest, ShapeStacker, Circle, Square Triangle, and Rectangle.

It's up to you to determine the order to appear when stacked based on sizes and what fits inside what.

It's up to you to decide how to handle the case where two shapes cover the same area.
i.e. Square (side:4) and Rectangle (length:4,width:4)

###ShapeStackTest cases:
Assert(Square(4), Circle(4), Triangle(4,10), "T[S[C]]")
Assert(Square(4), Circle(6), Rectangle(2,4), "C[S[R]]")
Assert(Triangle(4,10), Circle(20)),"C[T]")
Assert(Square(4), Rectangle(4, 4), ???)

