/**
 * A river has a name, length (in kilometers), and the continent it is on.
 */
public class River implements Comparable<River> {
    private static final String default_name = "Unknown River";
    private static final int default_length = 0; 
    private static final String default_continent = "Unknown Continent";

    private String name;
    private int length; // in kilometers
    private String continent;

  
    public River() {
        this.name = default_name;
        this.length = default_length;
        this.continent = default continent;
    }

    
    public River(String name, int length, String continent) {
        this.name = name;
        this.length = length;
        this.continent = continent;
    }

    /* Gives us the name of the river. */
    
    public String getName() {
        return name;
    }

    /* Returns the length of the river in kilometers. */
     
    public int getLength() {
        return length;
    }

    
    public String getContinent() {
        return continent;
    }

    /* This serves to return a string representation of the river. */
     
    @Override
    public String toString() {
        return "River[name=" + name + ", length=" + length + ", continent=" + continent + "]";
    }

    /* Compares this river to another river based on their lengths. */ 

    public int compareTo(River other) {
        return Integer.compare(this.length, other.length);
    }

    /*  This checks if this river is equal to another river based on their attributes. */
     
    public boolean equals(River other) {
        if (this == other) return true;
        if (other == null) return false;
        return this.name.equals(other.name) &&
               this.length == other.length &&
               this.continent.equals(other.continent);
    }

    /* Main method which shows the River class. */
  
    public static void main(String[] args) {
        River amazon = new River("Amazon", 6992, "South America");
        River nile = new River("Nile", 6650, "Africa");
        River defaultRiver = new River();

        System.out.println(amazon);
        System.out.println(nile);
        System.out.println(defaultRiver);

        System.out.println("Comparing Amazon and Nile: " + amazon.compareTo(nile));
    
        System.out.println("Amazon equals Nile: " + amazon.equals(nile));
        System.out.println("Amazon equals Amazon: " + amazon.equals(amazon));
    }
}
