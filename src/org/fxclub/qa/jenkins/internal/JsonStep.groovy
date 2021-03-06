package org.fxclub.qa.jenkins.internal

class JsonStep extends JsonBase {

    JsonStepResult result
    List<JsonStepComment> comments
    def line
    def name
    JsonStepMatch match
    List<Integer> matchedColumns
    List<JsonStepRow> rows
    def keyword
    
    class JsonStepResult extends JsonBase{
        def duration
        def status
        def error_message

        JsonStepResult(){

        }
    }

    @Override
    String toString() {
        return "JsonStep{" +
                "name=" + name +
                '}';
    }

}