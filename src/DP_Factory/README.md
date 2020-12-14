# Factory Pattern

## Definition
The Factory pattern provides a way to use an instance as a object factory.
The factory can return an instance of one of several possible classes (in a
subclass hierarchy), depending on the data provided to it.

## Where to use
##### When a class can't anticipate which kind of class of object it must create.
##### you want to localize the knowledge of which class gets created.
##### When you have classes that is derived from the same subclasses, or they may in fact be unrelated classes that just share the same interface. Either way, the methods in these class instances are the same and can be used interchangeably.
##### When you want to insulate the client from the actual type that is being instantiated.

## Benefits
##### The client does not need to know every subclass of objects it must create. It only need one reference to the abstract class/interface and the factory object.
##### The factory encapsulate the creation of objects. This can be useful if the creation process is very complex.
## Drawbacks/consequences
There is no way to change an implementing class without a recompile.