<<<<<<< HEAD
package service_layer;

import domain_layer.*;

public class PricingService {
    public Payment pricingService(Vehicle vehicle) {
        Payment payment =new Payment();
        if(vehicle==null ){
            payment.setAmount(0.00);
            return payment;
        }
        switch (vehicle.getVehicleType()) {
            case TWO_WHEELER -> payment.setAmount(20.00);
            case THREE_WHEELER -> payment.setAmount(30.00);
            case FOUR_WHEELER -> payment.setAmount(40.00);
        }
        return payment;
        }
}
=======
package service_layer;

import domain_layer.*;

public class PricingService {
    public Payment pricingService(Vehicle vehicle) {
        Payment payment =new Payment();
        if(vehicle==null ){
            payment.setAmount(0.00);
            return payment;
        }
        switch (vehicle.getVehicleType()) {
            case TWO_WHEELER -> payment.setAmount(20.00);
            case THREE_WHEELER -> payment.setAmount(30.00);
            case FOUR_WHEELER -> payment.setAmount(40.00);
        }
        return payment;
        }
    }
>>>>>>> 9780f22bce0d570e8526a7f6ef38dc2af128417f
