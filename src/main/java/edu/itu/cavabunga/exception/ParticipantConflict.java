package edu.itu.cavabunga.exception;

public class ParticipantConflict extends RuntimeException {

    public ParticipantConflict(){

    }

    public ParticipantConflict(String message){
        super(message);
    }
    public ParticipantConflict(Throwable cause){
        super(cause);
    }



}
