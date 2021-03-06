package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String registration_number;
    private String status;
    private String status_date;
    private String type;
    private String use;
    private String first_registration;
    private String vin;
    private String own_weight;
    private String total_weight;
    private String axels;
    private String pulling_axels;
    private String seats;
    private String coupling;
    private String doors;
    private String make;
    private String model;
    private String variant;
    private String model_type;
    private String model_year;
    private String color;
    private String chassis_type;
    private String engine_cylinders;
    private String engine_volume;
    private String engine_power;
    private String fuel_type;
    private String registration_zipcode;
    private String vehicle_id;
    private String batch_id;
    
    public Car() {
    }

    public Car(String registration_number, String status, String status_date, String type, String use, String first_registration, String vin,
            String own_weight, String total_weight, String axels, String pulling_axels, String seats, String coupling, String doors, String make,
            String model, String variant, String model_type, String model_year, String color, String chassis_type, String engine_cylinders,
            String engine_volume, String engine_power, String fuel_type, String registration_zipcode, String vehicle_id, String batch_id, String Car,
            String url) {
        this.registration_number = registration_number;
        this.status = status;
        this.status_date = status_date;
        this.type = type;
        this.use = use;
        this.first_registration = first_registration;
        this.vin = vin;
        this.own_weight = own_weight;
        this.total_weight = total_weight;
        this.axels = axels;
        this.pulling_axels = pulling_axels;
        this.seats = seats;
        this.coupling = coupling;
        this.doors = doors;
        this.make = make;
        this.model = model;
        this.variant = variant;
        this.model_type = model_type;
        this.model_year = model_year;
        this.color = color;
        this.chassis_type = chassis_type;
        this.engine_cylinders = engine_cylinders;
        this.engine_volume = engine_volume;
        this.engine_power = engine_power;
        this.fuel_type = fuel_type;
        this.registration_zipcode = registration_zipcode;
        this.vehicle_id = vehicle_id;
        this.batch_id = batch_id;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus_date() {
        return status_date;
    }

    public void setStatus_date(String status_date) {
        this.status_date = status_date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getFirst_registration() {
        return first_registration;
    }

    public void setFirst_registration(String first_registration) {
        this.first_registration = first_registration;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getOwn_weight() {
        return own_weight;
    }

    public void setOwn_weight(String own_weight) {
        this.own_weight = own_weight;
    }

    public String getTotal_weight() {
        return total_weight;
    }

    public void setTotal_weight(String total_weight) {
        this.total_weight = total_weight;
    }

    public String getAxels() {
        return axels;
    }

    public void setAxels(String axels) {
        this.axels = axels;
    }

    public String getPulling_axels() {
        return pulling_axels;
    }

    public void setPulling_axels(String pulling_axels) {
        this.pulling_axels = pulling_axels;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getCoupling() {
        return coupling;
    }

    public void setCoupling(String coupling) {
        this.coupling = coupling;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getModel_type() {
        return model_type;
    }

    public void setModel_type(String model_type) {
        this.model_type = model_type;
    }

    public String getModel_year() {
        return model_year;
    }

    public void setModel_year(String model_year) {
        this.model_year = model_year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getChassis_type() {
        return chassis_type;
    }

    public void setChassis_type(String chassis_type) {
        this.chassis_type = chassis_type;
    }

    public String getEngine_cylinders() {
        return engine_cylinders;
    }

    public void setEngine_cylinders(String engine_cylinders) {
        this.engine_cylinders = engine_cylinders;
    }

    public String getEngine_volume() {
        return engine_volume;
    }

    public void setEngine_volume(String engine_volume) {
        this.engine_volume = engine_volume;
    }

    public String getEngine_power() {
        return engine_power;
    }

    public void setEngine_power(String engine_power) {
        this.engine_power = engine_power;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public String getRegistration_zipcode() {
        return registration_zipcode;
    }

    public void setRegistration_zipcode(String registration_zipcode) {
        this.registration_zipcode = registration_zipcode;
    }

    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

}
