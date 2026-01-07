
package com.rahul.parking.admin_service.data_transfer_object;

import io.swagger.v3.oas.annotations.media.Schema;

public class AdminResponse {

    @Schema(
            description = "response returned after performing admin operations"
    )
    //variables
    private boolean success;
    private String message;
    private String referenceId;
    //user query variable
    private boolean resolved;

    //getters and setters

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    //constructors


    public AdminResponse(boolean resolved, String message, String referenceId, boolean success) {
        this.resolved = resolved;
        this.message = message;
        this.referenceId = referenceId;
        this.success = success;
    }

    public AdminResponse() {
    }
}
