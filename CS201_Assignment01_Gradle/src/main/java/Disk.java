/**
 * An instance of the Disk class represents a disk
 * to be placed on the game board.
 */

public class Disk
{
	private double x, y, radius; // Adding private fields for Disk class.
	private DiskColor color;    // Adding private field for Disk class.

	public Disk(double x, double y, double radius, DiskColor color) // Constructor to store the values and initialize the objects in Disk class.
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}

	public double getX() // Getter method to return x coordinate value.
	{
		return x;
	}

	public double getY() // Getter method to return y coordinate value.
	{
		return y;
	}

	public double getRadius() // Getter method to return radius value.
	{
		return radius;
	}

	public DiskColor getColor() // Getter method to return color value.
	{
		return color;
	}

	public boolean overlaps(Disk other)
	{
		double diskDistance = Math.sqrt(((x - other.x) * (x - other.x)) + ((y - other.y) * (y - other.y))); // Variable to store the distance calculation of the 2 disks.
		double radiusSum = radius + other.radius; // Variable to store the sum of the radius of the 2 disks.

		// Statement returning if the distance of the 2 disks is smaller than the radius sum of the 2 disks.
		return diskDistance < radiusSum;
	}

	public boolean isOutOfBounds(double width, double height)
	{
		// Statement returning if the disk will be out of bounds of the rectangle.
		return x + radius > width || x - radius < 0 || y + radius > height || y - radius < 0;
	}
}
