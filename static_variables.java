package practice;

class StaticVariables { 
    static int a = 100;
    int b = 200; 
    public static void main(String[] args) {
        System.out.println("a value: " + a); 
        StaticVariables m = new StaticVariables();
        System.out.println("b value: " + m.b); 
    }
}