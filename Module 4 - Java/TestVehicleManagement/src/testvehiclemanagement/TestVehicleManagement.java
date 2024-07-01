package testvehiclemanagement;

import vehicle.Truck;

public class TestVehicleManagement {

    public static void main(String[] args) {

        Truck truck=new Truck(21000, 70, 110,"red");
        System.out.println(truck.getsalePrice());
    }

}
