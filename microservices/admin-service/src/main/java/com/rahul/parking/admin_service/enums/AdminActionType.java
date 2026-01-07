

package com.rahul.parking.admin_service.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
        description = "Type of admin operations supported by the system"
)
public enum AdminActionType {

    USER_QUERY,
    SPECIAL_ENTRY,
    TICKET_REGENERATE
}

