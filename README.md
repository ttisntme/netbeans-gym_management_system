# netbeans-gym_management_system
NetBeans, java application, Gym System management, Db4O database

A Gym system management application
Including multiple roles, enterprises and organizations.

This Gym System has a system manager:
username : sysadmin
password : sysadmin

It contains some already created roles, you can create new system by deleting the Databank.db4o file.
Different roles and organizatinos and enterprises communicates with the WorkRequest. 

Main Parts: (Enterprises)
  Selling part:  
    Organization:  Supplier / SellingStaff / Manufacturer   (one);
    Roles:               Supplier / SellingStaff / Manufacturer  (multiple number)

  Cafe part:  
    Organization:    FoodSupplier / Transport / CafeStaff      (one);
    Roles:                 FoodSupplier / Transport / CafeStaff    (multiple number)

  Coach part:  
    Organization:    CoachStaff / CoachTrainer    (one)
    Roles:                 CoachStaff / CoachTrainer   (multiple number)

  Member part:  
    Organization:    User     (one)
    Roles:                 User      (multiple number)



WorkRequest: 
  User(order cafe or food) —----> CafeStaff  
  User(purchase product) —-----> StoreAdmin
  User(register for Coach)-------->CoachStaff
  CafeAdmin —----> foodsupplier
  StoreAdmin(order material and goods)—------> Supplier
  StoreAdmin(order equipment)—------> Manufacturer
  CoachStaff(request pro training) ---------> CoachTrainer
