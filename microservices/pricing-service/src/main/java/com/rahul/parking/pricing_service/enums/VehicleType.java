package com.rahul.parking.pricing_service.enums;

import io.swagger.v3.oas.annotations.media.Schema;

public enum VehicleType {
    @Schema(
            description = "Type of vehicle types supported by the system"
    )
    TWO_WHEELER,
    THREE_WHEELER,
    FOUR_WHEELER
}
