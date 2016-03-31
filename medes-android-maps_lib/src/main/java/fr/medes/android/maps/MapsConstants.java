package fr.medes.android.maps;

import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;

public final class MapsConstants {

	public static final double DEFAULT_LATIUDE = 43.589390;
	public static final double DEFAULT_LONGITUDE = 1.445196;
	public static final double DEFAULT_NORTH = 43.589390;
	public static final double DEFAULT_WEST = 1.445196;
	public static final double DEFAULT_SOUTH = 43.586204;
	public static final double DEFAULT_EAST = 1.452513;

	/**
	 * latitude extra (must be a double value) to use when trying to visualize coordinates on a map, or trying to
	 * navigate to it This must be used with MIME_GPS
	 */
	public static final String EXTRA_LATITUDE = "latitude";

	/**
	 * longitude extra (must be a double value) to use when trying to visualize coordinates on a map, or trying to
	 * navigate to it This must be used with MIME_GPS
	 */
	public static final String EXTRA_LONGITUDE = "longitude";

	/**
	 * location parcelable extra that is returned when asking for a location using MIME_GPS
	 */
	public static final String EXTRA_LOCATION = "location";

	/**
	 * Tile source (name) parcelable to precise which tile source to use when putting an area into the cache
	 *
	 * @see ITileSource#name()
	 * @see TileSourceFactory#getTileSource(String)
	 */
	public static final String EXTRA_TILE_SOURCE = "tileSource";

	/**
	 * North latitute (double) parcelable of the bounding box to put into the cache
	 */
	public static final String EXTRA_LAT_NORTH = "latitudeNorth";

	/**
	 * South latitute (double) parcelable of the bounding box to put into the cache
	 */
	public static final String EXTRA_LAT_SOUTH = "latitudeSouth";

	/**
	 * East longitude (double) parcelable of the bounding box to put into the cache
	 */
	public static final String EXTRA_LON_EAST = "longitudeEast";

	/**
	 * West longitude (double) parcelable of the bounding box to put into the cache
	 */
	public static final String EXTRA_LON_WEST = "longitudeWest";

	/**
	 * Maximum zoom level to take into account to pre-cache the geographical area
	 */
	public static final String EXTRA_ZOOM_MAX = "zoomMax";

	/**
	 * Minimum zoom level to take into account to pre-cache the geographical area
	 */
	public static final String EXTRA_ZOOM_MIN = "zoomMin";

	/**
	 * Set to true to activate the visualization of the pre-cached areas
	 */
	public static final String EXTRA_SHOW_PRECACHE = "showPreCache";

	/**
	 * Set to true to refresh the actual pre-cached areas
	 */
	public static final String EXTRA_REFRESH_PRECACHE = "refreshPreCache";

}
