package com.ee.domain.delivery;

import java.util.List;

public interface Route {

	public RouteStopPoint getStartRoutePoint();

	public RouteStopPoint getEndRoutePoint();

	public List<RouteStopPoint> getRoutePoints();
}
