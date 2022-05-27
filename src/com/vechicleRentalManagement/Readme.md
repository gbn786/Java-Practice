System Requirements
1. We will focus on the following set of requirements while designing our Car Rental System:

2. The system will support the renting of different automobiles like cars, trucks, SUVs, vans, and motorcycles.

3. Each vehicle should be added with a unique barcode and other details, including a parking stall number which helps to locate the vehicle.

4. The system should be able to retrieve information like which member took a particular vehicle or what vehicles have been rented out by a specific member.

5. The system should collect a late-fee for vehicles returned after the due date.

6. Members should be able to search the vehicle inventory and reserve any available vehicle.

7. The system should be able to send notifications whenever the reservation is approaching the pick-up date, as well as when the vehicle is nearing the due date or has not been returned within the due date.

8. The system will be able to read barcodes from vehicles.

9. Members should be able to cancel their reservations.

10. The system should maintain a vehicle log to track all events related to the vehicles.

11. Members can add rental insurance to their reservation.

12. Members can rent additional equipment, like navigation, child seat, ski rack, etc.

13. Members can add additional services to their reservation, such as roadside assistance, additional driver, wifi, etc.

Use case diagram

We have four main Actors in our system:

1. Receptionist: Mainly responsible for adding and modifying vehicles and workers. Receptionists can also reserve vehicles.
2. Member: All members can search the catalog, as well as reserve, pick-up, and return a vehicle.
3. System: Mainly responsible for sending notifications about overdue vehicles, canceled reservation, etc.
4. Worker: Mainly responsible for taking care of a returned vehicle and updating the vehicle log.



Here are the top use cases of the Car Rental System:

1. Add/Remove/Edit vehicle: To add, remove or modify a vehicle.
2. Search catalog: To search for vehicles by type and availability.
3. Register new account/Cancel membership: To add a new member or cancel an existing membership.
4. Reserve vehicle: To reserve a vehicle.
5. Check-out vehicle: To rent a vehicle.
6. Return a vehicle: To return a vehicle which was checked-out to a member.
7. Add equipment: To add an equipment to a reservation like navigation, child seat, etc.
8. Update car log: To add or update a car log entry, such as refueling, cleaning, damage, etc.

Class diagram
Here are the main classes of our Car Rental System:

CarRentalSystem: The main part of the organization for which this software has been designed.

CarRentalLocation: The car rental system will have multiple locations, each location will have attributes like ‘Name’ to distinguish it from any other locations and ‘Address’ which defines the address of the rental location.

Vehicle: The basic building block of the system. Every vehicle will have a barcode, license plate number, passenger capacity, model, make, mileage, etc. Vehicles can be of multiple types, like car, truck, SUV, etc.

Account: Mainly, we will have two types of accounts in the system, one will be a general member and the other will be a receptionist. Another account can be of the worker taking care of the returned vehicle.

VehicleReservation: This class will be responsible for managing reservations for a vehicle.

Notification: Will take care of sending notifications to members.

VehicleLog: To keep track of all the events related to a vehicle.

RentalInsurance: Stores details about the various rental insurances that members can add to their reservation.

Equipment: Stores details about the various types of equipment that members can add to their reservation.

Service: Stores details about the various types of service that members can add to their reservation, such as additional drivers, roadside assistance, etc.

Bill: Contains different bill-items for every charge for the reservation.




