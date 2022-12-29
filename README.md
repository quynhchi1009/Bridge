# Bridge
Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

Divide the classes into two hierarchies:

- Abstraction: the GUI layer of the app → controls the appearance
- Implementation: the operating systems’ APIs

⇒ change the GUI classes without touching the API-related classes & add support for another operating system only requires creating a subclass in the implementation hierarchy

### Structure

1. **Abstraction** provides high-level control logic.
2. **Implementation** declares the interface that’s common for all concrete implementations. 
3. **Concrete Implementations** contain platform-specific code.
4. **Refined Abstractions** provide variants of control logic.
5. **Client** is only interested in working with the abstraction.

### Applicability

- when you want to divide and organize a monolithic class that has several variants of some functionality
- when you need to extend a class in several orthogonal (independent) dimensions
- if you need to be able to switch implementations at runtime
