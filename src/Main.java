public class Main {
    public static void main(String[] args) {
        Dni dni = new Dni(18957690, 'E');
        System.out.println(dni);
        System.out.println(dni.isCorrect() ? "correcto" : "incorrecto" );


        Dni dni2= new Dni("26602548N");
        System.out.println(dni2);
        System.out.println(dni2.isCorrect() ? "correcto" : "incorrecto" );
    }


}