package com.deh.exceptions

class DEHServiceException extends RuntimeException {

    List<String> errors = []

    DEHServiceException(String error) {
        errors.add(error)
    }
}
