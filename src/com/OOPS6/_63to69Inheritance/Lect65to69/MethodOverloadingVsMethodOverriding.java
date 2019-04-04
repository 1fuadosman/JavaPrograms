package com.OOPS6._63to69Inheritance.Lect65to69;

public class MethodOverloadingVsMethodOverriding {

    /*

    ********Method overloading********

    - Method overloading means providing two or more seperate methods in a class
    with the same name but different parameters
    - Method return type may or may not be different and that allows us to reuse
    the same method name
    - Overloading is very handy, it reduces duplicated code and we dont have to remember
    multiple method names
    -We can oveload static and instance methods(more about the difference between static
    and instance methods later in the course).
    -Usually overloading happens inside a single class, but a method can also be treated
    as overloading the subclass of that class.
    -That is because a subclass inherits one version of the method from the parent class
    and then the subclass can have another overloaded version of the method
    -Method overloading rules: Methods will be considered overloaded if both follow the following rules:
        a) Methods must have the same method name.
        b) Method must have different parameters.
    -If methods follow the rules above then they may or may not:
        a) Have different return types
        b) have different access modifiers
        c) Throw different checked or unchecked exceptions

    ******Method Overriding***********

    -Method overriding means defining a method in a child class that already exists in the
    parent class with same signature(same name, same argument).
    -By extending the parent class the child class gets all the methods defined in the parent
    class(those methods are known as derived methods).
    -When we override a method its recommended to put @Override immediately above the method
    definition. This is an annotation that the compiler reads and will then show us an error
    of we dont follow overriding rules correctly.
    -We cant override static methods only instance methods
    -Method overriding rules: Methods will be considered overriden if we following these rules
        a) It must have the same name and same arguments.
        b) Return type can be a subclass of the return type in the parent class
        c) It cant have a lower access modifier
        d) for example if the parent method is protected then using private in the child is not
        allowed but using public in the child would be allowed.
        e) Only inherited methods can be overridden, in other words methods can be overridden in
        only in child classes
        f) Constructors and private methods cannot be overriden.
        g) Methods that are final cannot be overriden
        h) A subclass can use super.methodName() to call the superclass version of an oberriden method.







     */
}
