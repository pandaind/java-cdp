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

- **Prototype** : The prototype pattern is a creational design pattern. It is used when the type of objects to create is determined by a prototypical instance, which is cloned to produce new objects.

  - When to use : Prototype design pattern is used in scenarios where application needs to create a number of instances of a class, which has almost same state and when there is need to avoid creating objects using new keyword.
  - Check List : 
    - Add a `clone()` method to the existing "product" hierarchy.
    - Design a "registry" that maintains a cache of prototypical objects. The registry could be encapsulated in a new `Factory` class, or in the base class of the "product" hierarchy.
    - Design a factory method that: may (or may not) accept arguments, finds the correct prototype object, calls `clone()` on that object, and returns the result.
    - The client replaces all references to the `new` operator with calls to the factory method.
  - Rules of thumb :
    - sometimes creational patterns are competitors: there are cases when either Prototype or Abstract Factory could be used properly. At other times they are complementary: Abstract Factory might store a set of Prototypes from which to clone and return product objects. Abstract Factory, Builder, and Prototype can use Singleton in their implementations.
    - Abstract Factory classes are often implemented with Factory Methods, but they can be implemented using Prototype.
    - Factory Method: creation through inheritance. Prototype: creation through delegation.
    - Often, designs start out using Factory Method (less complicated, more customizable, subclasses proliferate) and evolve toward Abstract Factory, Prototype, or Builder (more flexible, more complex) as the designer discovers where more flexibility is needed.
    - Prototype doesn't require sub classing, but it does require an "initialize" operation. Factory Method requires subclassing, but doesn't require Initialize.
    - Designs that make heavy use of the Composite and Decorator patterns often can benefit from Prototype as well.
    - Prototype co-opts one instance of a class for use as a breeder of all future instances.
    - Prototypes are useful when object initialization is expensive, and you anticipate few variations on the initialization parameters. In this context, Prototype can avoid expensive "creation from scratch", and support cheap cloning of a pre-initialized prototype.
    - Prototype is unique among the other creational patterns in that it doesn't require a class – only an object. Object-oriented languages like Self and Omega that do away with classes completely rely on prototypes for creating new objects.

- **Singleton** : The singleton pattern is a GOF creational design pattern that restricts the instantiation of a class to single object. This is useful when exactly one object is needed to coordinate actions across the system.

  - When to use : Application needs one, and only one, instance of an object. Additionally, lazy initialization and global access are necessary and state of objects needs to be shared across application. Logger and Print Spooler are candidate application for singleton.
  - Check List :
    - Define a private `static` attribute in the "single instance" class.
    - Define a public `static` accessors function in the class.
    - Do "lazy initialization" (creation on first use) in the accessors function.
    - Define all constructors to be `protected` or `private`.
    - Clients may only use the accessors function to manipulate the Singleton.
  - Rules of thumb :
    - Abstract Factory, Builder, and Prototype can use Singleton in their implementation.
    - Facade objects are often Singletons because only one Facade object is required.
    - State objects are often Singletons.
    - The advantage of Singleton over global variables is that you are absolutely sure of the number of instances when you use Singleton, and, you can change your mind and manage any number of instances.
    - The Singleton design pattern is one of the most inappropriately used patterns. Singletons are intended to be used when a class must have exactly one instance, no more, no less. Designers frequently use Singletons in a misguided attempt to replace global variables. A Singleton is, for intents and purposes, a global variable. The Singleton does not do away with the global; it merely renames it.
    - When is Singleton unnecessary? Short answer: most of the time. Long answer: when it's simpler to pass an object resource as a reference to the objects that need it, rather than letting objects access the resource globally. The real problem with Singletons is that they give you such a good excuse not to think carefully about the appropriate visibility of an object. Finding the right balance of exposure and protection for an object is critical for maintaining flexibility.
    - Our group had a bad habit of using global data, so I did a study group on Singleton. The next thing I know Singletons appeared everywhere and none of the problems related to global data went away. The answer to the global data question is not, "Make it a Singleton." The answer is, "Why in the hell are you using global data?" Changing the name doesn't change the problem. In fact, it may make it worse because it gives you the opportunity to say, "Well I'm not doing that, I'm doing this" – even though this and that are the same thing.

- **Object pool** : Object pools (otherwise known as resource pools) are used to manage the object caching. Generally the pool will be a growing pool, i.e. the pool itself will create new objects if the pool is empty, or we can have a pool, which restricts the number of objects created.

  - Check List :
    - Create `ObjectPool` class with private array of `Object`s inside
    - Create `acquire` and `release` methods in ObjectPool class
    - Make sure that your ObjectPool is Singleton
  - Rules of thumb:
    - The Factory Method pattern can be used to encapsulate the creation logic for objects. However, it does not manage them after their creation, the object pool pattern keeps track of the objects it creates.
    - Object Pools are usually implemented as Singletons.
