package practice;

class Encapsulation {  // Renamed the class to avoid conflict
    private int id = 100;
    private String name = "Pawan";
    private String loc;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLoc() {  // Fixed method name (camelCase)
        return loc;
    }

    public void setLoc(String loc) {  // Fixed method name (camelCase)
        this.loc = loc;
    }
}

public class Encap {  // Main class (same as file name)
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();  // Use the corrected class name
        System.out.println(obj.getName());
        System.out.println(obj.getId());
        obj.setLoc("Blore");  
        System.out.println("Location: " + obj.getLoc());  
    }
}