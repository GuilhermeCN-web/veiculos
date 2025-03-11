Vehicle Management System

Overview

This project implements a simple Vehicle Management System in Java, using object-oriented programming principles. It defines a base class Vehicle and three specific vehicle types: Car, Motorcycle, and Truck. The Main class demonstrates their usage.

Classes

1. Vehicle (Base Class)

Attributes:

brand (String)

model (String)

year (int)

Methods:

displayInfo(): Prints vehicle details.

2. Car (Extends Vehicle)

Additional Attribute:

numberOfDoors (int)

Methods:

Overrides displayInfo() to include numberOfDoors.

3. Motorcycle (Extends Vehicle)

Additional Attribute:

cilindradas (boolean)

Methods:

Overrides displayInfo() to include hasSidecar.

4. Truck (Extends Vehicle)

Additional Attribute:

loadCapacity (double)

Methods:

Overrides displayInfo() to include loadCapacity.

5. Main Class

Instantiates and demonstrates different vehicle types.
