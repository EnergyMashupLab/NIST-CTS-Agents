package XSD-01.EIClasses;


/**
 * @author crossover
 * @version 1.0
 * @created 26-Sep-2019 9:49:52 PM
 */
public enum ReadingTypeEnumeratedType {
	/**
	 * Reading is read from a device that increases monotonically, and usage must be
	 * computed from pairs of start and stop readings.
	 */
	Direct Read,
	/**
	 * Meter or [resource] prepares its own calculation of total use over time.
	 */
	Net,
	/**
	 * Meter covers several [resources] and usage is inferred through some sort of pro
	 * rata computation.
	 */
	Allocated,
	/**
	 * Used when a reading is absent in a series in which most readings are present.
	 */
	Estimated,
	/**
	 * Several meters together provide the reading for this [resource]. This is
	 * specifically a different than aggregated, which refers to multiple [resources]
	 * in the same payload. See also Hybrid.
	 */
	Summed,
	/**
	 * Usage is inferred through knowledge of run-time, normal operation, etc.
	 */
	Derived,
	/**
	 * Reading is the mean value over the period indicated in Granularity
	 */
	Mean,
	/**
	 * Reading is Peak (highest) value over the period indicated in granularity. For
	 * some measurements, it may make more sense as the lowest value. May not be
	 * consistent with aggregate readings. Only valid for flow-rate Item Bases, i.e.,
	 * Power not Energy.
	 */
	Peak,
	/**
	 * If aggregated, refers to different reading types in the aggregate number.
	 */
	Hybrid,
	/**
	 * Indicates reading is pro forma, i.e., is reported at agreed upon rates
	 */
	Contract,
	/**
	 * Indicates reading is in the future, and has not yet been measured.
	 */
	Projected
}