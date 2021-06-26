# java-cdp
Java Creational Design Pattern Practice

| **Object Scope** | **Class Scope** |
| ---------------- | --------------- |
| Abstract Factory | Factory         |
| Builder          | Simple Factory  |
| Prototype        | Singleton       |

- **Abstract Factory** -  Abstract factory is also called as factory of factories. Abstract Factory patterns work around a super-factory which creates other factories. In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.

  - When to use :

    When application needs a level of indirection that abstracts the creation of families of related or dependent objects without directly specifying their concrete classes. The "factory" object has the responsibility for providing creation services for the entire platform family.

  - Check List :

    - Decide if "platform independence" and creation services are the current source of pain.
    - Map out a matrix of "platforms" versus "products".
    - Define a factory interface that consists of a factory method per product.
    - Define a factory derived class for each platform that encapsulates all references to the `new` operator.
    - The client should retire all references to `new`, and use the factory methods to create the product objects.

  - Rules of thumb :

    - Sometimes creational patterns are competitors: there are cases when either Prototype or Abstract Factory could be used profitably. At other times they are complementary: Abstract Factory might store a set of Prototypes from which to clone and return product objects, Builder can use one of the other patterns to implement which components get built. Abstract Factory, Builder, and Prototype can use Singleton in their implementation.
    - Abstract Factory, Builder, and Prototype define a factory object that's responsible for knowing and creating the class of product objects, and make it a parameter of the system. Abstract Factory has the factory object producing objects of several classes. Builder has the factory object building a complex product incrementally using a correspondingly complex protocol. Prototype has the factory object (aka prototype) building a product by copying a prototype object.
    - Abstract Factory classes are often implemented with Factory Methods, but they can also be implemented using Prototype.
    - Abstract Factory can be used as an alternative to Facade to hide platform-specific classes.
    - Builder focuses on constructing a complex object step by step. Abstract Factory emphasizes a family of product objects (either simple or complex). Builder returns the product as a final step, but as far as the Abstract Factory is concerned, the product gets returned immediately.
    - Often, designs start out using Factory Method (less complicated, more customizable, subclasses proliferate) and evolve toward Abstract Factory, Prototype, or Builder (more flexible, more complex) as the designer discovers where more flexibility is needed.

- **Builder ** : Builder pattern hide the complexity of object creation. It Encapsulates creating and assembling the parts of a complex object in a separate Builder object.  A class delegates object creation to a Builder object instead of creating the objects directly.

  - When to use : When application needs to create complex objects with multiple steps involved in creation and expect final object as outcome.
  - Check List  :
    - Decide if a common input and many possible representations (or outputs) is the problem at hand.
    - Encapsulate the parsing of the common input in a Reader class.
    - Design a standard protocol for creating all possible output representations. Capture the steps of this protocol in a Builder interface.
    - Define a Builder derived class for each target representation.
    - The client creates a Reader object and a Builder object, and registers the latter with the former.
    - The client asks the Reader to "construct".
    - The client asks the Builder to return the result.
  - Rules of thumb :
    - Sometimes creational patterns are complementary: Builder can use one of the other patterns to implement which components get built. Abstract Factory, Builder, and Prototype can use Singleton in their implementations.
    - Builder focuses on constructing a complex object step by step. Abstract Factory emphasizes a family of product objects (either simple or complex). Builder returns the product as a final step, but as far as the Abstract Factory is concerned, the product gets returned immediately.
    - Builder often builds a Composite.
    - Often, designs start out using Factory Method (less complicated, more customizable, subclasses proliferate) and evolve toward Abstract Factory, Prototype, or Builder (more flexible, more complex) as the designer discovers where more flexibility is needed.

- **Factory** : Factory pattern creates object without exposing the creation logic to the client and refer to newly created object using a common interface.

  - When to use : Factory design pattern is used when we have a super class with multiple sub-classes and based on input one of the sub-class is expected to be returned.
  - Check List :
    - If you have an inheritance hierarchy that exercises polymorphism, consider adding a polymorphic creation capability by defining a `static` factory method in the base class.
    - Design the arguments to the factory method. What qualities or characteristics are necessary and sufficient to identify the correct derived class to instantiate?
    - Consider designing an internal "object pool" that will allow objects to be reused instead of created from scratch.
    - Consider making all constructors `private` or `protected`.
  - Rules of thumb :
    - Abstract Factory classes are often implemented with Factory Methods, but they can be implemented using Prototype.
    - Factory Methods are usually called within Template Methods.
    - Factory Method: creation through inheritance. Prototype: creation through delegation.
    - Often, designs start out using Factory Method (less complicated, more customizable, subclasses proliferate) and evolve toward Abstract Factory, Prototype, or Builder (more flexible, more complex) as the designer discovers where more flexibility is needed.
    - Prototype doesn't require subclassing, but it does require an Initialize operation. Factory Method requires subclassing, but doesn't require Initialize.
    - The advantage of a Factory Method is that it can return the same instance multiple times, or can return a subclass rather than an object of that exact type.
    - Some Factory Method advocates recommend that as a matter of language design (or failing that, as a matter of style) absolutely all constructors should be private or protected. It's no one else's business whether a class manufactures a new object or recycles an old one.
    - The `new` operator considered harmful. There is a difference between requesting an object and creating one. The `new` operator always creates an object, and fails to encapsulate object creation. A Factory Method enforces that encapsulation, and allows an object to be requested without inextricable coupling to the act of creation.
