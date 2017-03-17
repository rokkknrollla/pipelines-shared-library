package org.fxclub.qa.jenkins

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
class JsonStepMatchArgument{

    def val
    def offset

    JsonStepMatchArgument(){

    }

}