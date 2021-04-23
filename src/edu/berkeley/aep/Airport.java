package edu.berkeley.aep;

import java.util.ArrayList;
import java.util.List;

//understand airport and its outgoing neighbors;
public class Airport {
    String name;
    List<Airport> connectedNeighbors;

    public Airport(String name){
        this.name = name;
        this.connectedNeighbors = new ArrayList<>();
    }

    public boolean isReachable(Airport other){
        if(this.equals(other)){
            return true;
        }
        if(connectedNeighbors.contains(other)){
            return true;
        }
        return false;
    }

    public void connectToAnotherAirport(Airport other){
        this.connectedNeighbors.add(other);
    }

    @Override
    public boolean equals(Object other){
        if(this == other) return true;
        if(!(other instanceof Airport)){
            return false;
        }
        Airport newAirport = (Airport) (other);
        if(this.name.equals(newAirport.name)){
            return true;
        }
        return false;
    }
}
