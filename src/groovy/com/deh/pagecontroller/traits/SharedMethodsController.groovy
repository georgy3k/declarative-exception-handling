package com.deh.pagecontroller.traits

import com.deh.exceptions.DEHServiceException
import grails.web.Action

trait SharedMethodsController {

    @Action
    def methodB() {
        throw new DEHServiceException("methodB")
    }
}