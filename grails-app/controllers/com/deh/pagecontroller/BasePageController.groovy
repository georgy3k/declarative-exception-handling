package com.deh.pagecontroller

import com.deh.exceptions.DEHServiceException

class BasePageController {

    def handleDEHServiceException(DEHServiceException dehServiceException) {
        println("handleDEHServiceException")
        dehServiceException.errors.each { error ->
            println(error)
        }
        render (view: "/error")
    }
}
