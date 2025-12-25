package service;

import data_transfer_object.EntryRequest;
import data_transfer_object.EntryResponse;
import data_transfer_object.ParkingResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    private final RestTemplate restTemplate;

    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public  EntryResponse processEntry(EntryRequest request){
        EntryResponse response = new EntryResponse();

        //basic validation
        if(request==null || request.getVehicleType()==null){
            response.setMessage("Invalid entry request");
            return response;
        }
        //call parking service
        ParkingResponse parkingResponse=restTemplate.postForObject("http://localhost:8083/parking/entry",request,ParkingResponse.class);
        if(parkingResponse==null || !parkingResponse.getIsParking()){
            response.setMessage("Parking not available. Please try later.");
            return response;
        }

        response.setSlotId(parkingResponse.getSlotId());
        response.setTicketId(parkingResponse.getTicketId());
        response.setMessage("You can park your vehicle now");
        return response;
    }
}
