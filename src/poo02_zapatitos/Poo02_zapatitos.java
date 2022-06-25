package poo02_zapatitos;

import java.util.Scanner;

public class Poo02_zapatitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa emp = new Empresa();
        Zapato[] zap = new Zapato[100];
        
        System.out.println("Ingrese nombre de la empresa");
        emp.setNombre(scanner.nextLine());
        
        System.out.println("Menu principal_ N: Nuevo, L: Listar, S: Salir");
        var resp = scanner.next();
        var cout = 0;
        while (!"S".equals(resp)) {            
            if("N".equals(resp)) {
                System.out.println("Modelo_ 1:Ejecutivo, 2: Premier, 3: Emperador");
                var modelo = scanner.next();
                
                System.out.println("Talla: 8, 9, 10 ");
                var talla = scanner.nextInt();
                zap[cout] = new Zapato();
                
                switch(modelo) {
                    case "1": 
                        zap[cout].setModelo("Ejecutivo");
                        break;
                    case "2":
                        zap[cout].setModelo("Premier");
                        break;
                    case "3":
                        zap[cout].setModelo("Emperador");
                        break;
                }
                
                zap[cout].setTalla(talla);
                cout++;
                emp.setZapatoses(zap);                
            } else if ("L".equals(resp)) {
                emp.listaModelos();
            }
            
            System.out.println("Menu principal_ N: Nuevo, L: Listar, S: Salir");
            resp = scanner.next();
        }
        
        System.out.println("Gracias");
        
    }
    
}
