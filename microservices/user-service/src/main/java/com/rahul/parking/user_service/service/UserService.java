package com.rahul.parking.user_service.service;

import com.rahul.parking.user_service.data_transfer_object.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    private final RestTemplate restTemplate;

    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public EntryResponse processEntry(EntryRequest request) {
        EntryResponse response = new EntryResponse();

        // basic validation
        if (request == null || request.getVehicleType() == null) {
            response.setMessage("Invalid entry request");
            return response;
        }

        // call parking service
        ParkingResponse parkingResponse =
                restTemplate.postForObject(
                        "http://parking-service/parking/entry",
                        request,
                        ParkingResponse.class
                );

        // if ticket id availability missing then parking not allowed
        if (parkingResponse == null ) {
            response.setMessage("Parking not available. Please try later.");
            return response;
        }
        // ticket id or  slot id missing
        if(parkingResponse.getTicketId()==null || parkingResponse.getSlotId()==null){
            response.setMessage("Please enter ticket id and slot id both ");
            response.setParking(false);
            return response;
        }
        response.setTicketId(parkingResponse.getTicketId());
        response.setSlotId(parkingResponse.getSlotId());
        response.setParking(true);
        response.setMessage("You can park your vehicle now");
        return response;
    }

    public ParkingResponse processExit(ExitRequest  request){
        ParkingResponse parkingResponse = new ParkingResponse();
        if(request==null || request.getTicketId()==null){
            ParkingResponse response = new ParkingResponse();
            response.setMessage("invalid entry request");
            return response;

        }
        return restTemplate.postForObject("http://parking-service/parking/exit",request,ParkingResponse.class);
    }
}
