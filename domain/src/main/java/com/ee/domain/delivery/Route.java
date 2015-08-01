package com.ee.domain.delivery;

import java.util.List;

import com.ee.core.PersistentObject;

public interface Route extends PersistentObject {

	public RouteStopPoint getStartRoutePoint();

	public RouteStopPoint getEndRoutePoint();

	public List<RouteStopPoint> getRoutePoints();
	
	public void addStopPointToRoute(RouteStopPoint stopPoint);
	
	public void addStopPointToRoute(String description);
}
