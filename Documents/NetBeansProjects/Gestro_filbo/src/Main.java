
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String[] librosVendidos = new String[10];
        char opc ='s';

        do {
            
            String TIT, AUT;
            int PRE , tipo, cont = 0;

            System.out.println("Ingrese titulo del libro");
            TIT= leer.nextLine();
            System.out.println("Ingrese el autor del libro");
            AUT= leer.nextLine();
            System.out.println("Ingrese el precio del libro");
            PRE= leer.nextInt();
            System.out.println("Ingrese de que tipo es el libro");
            System.out.println("1. Libro de texto ");
            System.out.println("2. Libro de investigacion ");
            System.out.println("3. Libro de novela ");
            tipo= leer.nextInt();
            
            switch (tipo) {

                case 1:
                    System.out.println("Ingrese el curso al que se le imparte el libro");
                    String CUR = leer.next();



                    LibrosDeTexto tex = new LibrosDeTexto(CUR,TIT, AUT, PRE);
                    tex.setCurso(CUR);
                    tex.setTitulo(TIT);
                    tex.setAutor(AUT);
                    tex.setPrecio(PRE);

                    tex.CalcularDescuento();
                    System.out.println(tex.toString());

                    librosVendidos[cont++] = tex.toString();
                    break;

                case 2:
                    System.out.println("Ingrese la facultad autora del libro");
                    String FAC = leer.next();
                    Investigacion inv = new Investigacion(FAC,TIT, AUT, PRE);

                    inv.setFacultad(FAC);
                    inv.setTitulo(TIT);
                    inv.setAutor(AUT);
                    inv.setPrecio(PRE);

                    inv.CalcularDescuento();
                    System.out.println(inv.toString());
                    librosVendidos[cont++] = inv.toString();
                    break;

                case 3:
                    System.out.println("Ingrese el tipo de novela  del libro");

                    String TIP = leer.next();
                    Novelas nov = new Novelas(TIP,TIT, AUT, PRE);

                    nov.setTipo(TIP);
                    nov.setTitulo(TIT);
                    nov.setAutor(AUT);
                    nov.setPrecio(PRE);

                    nov.CalcularDescuento();
                    System.out.println(nov.toString());

                    librosVendidos[cont++] = nov.toString();
                    break;

                }  
                System.out.println("¿Desea ingresar otro producto?");
                opc = leer.next().charAt(0);
                
        }while (opc == 's'|| opc == 'S');
        
        for (int i = 0; i < librosVendidos.length; i++) {
            if (librosVendidos[i]!= null) {
                System.out.println(librosVendidos[i]);
            }
            
        }
        
        
        
    }
    
}
