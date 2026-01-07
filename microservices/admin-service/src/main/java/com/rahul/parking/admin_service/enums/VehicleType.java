package com.rahul.parking.admin_service.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
        description = "Type of vehicle types supported by the system"
)
public enum VehicleType {
    TWO_WHEELER,
    THREE_WHEELER,
    FOUR_WHEELER
}
