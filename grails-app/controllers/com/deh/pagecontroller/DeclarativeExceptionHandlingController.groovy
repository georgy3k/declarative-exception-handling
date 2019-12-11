package com.deh.pagecontroller

import com.deh.exceptions.DEHServiceException
import com.deh.pagecontroller.traits.SharedMethodsController

class DeclarativeExceptionHandlingController extends BasePageController implements SharedMethodsController {

    def methodA() {
        throw new DEHServiceException("methodA")
    }
}
