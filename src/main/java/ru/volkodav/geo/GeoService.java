package ru.volkodav.geo;

import ru.olmart.entity.Location;

public interface GeoService {

    Location byIp(String ip);

    Location byCoordinates(double latitude, double longitude);
}
