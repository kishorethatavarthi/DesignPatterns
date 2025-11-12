package com.learnings.state;

public interface TrafficLightState {
   void next(TrafficLightContext context);

   String getColor();
}
