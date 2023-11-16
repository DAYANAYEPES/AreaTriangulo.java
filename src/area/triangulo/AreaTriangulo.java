/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.triangulo;



import java.util.Scanner;

public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Miscelanea de ejercicios \n");
        System.out.println("1. Area de un triangulo \n");
        Scanner entrada = new Scanner(System.in);
            double base, altura, area;
         System.out.println("este programa calcula el area de un triangulo ");   
            

        System.out.println("escriba la base");
        base = entrada.nextDouble();
        System.out.println("escriba la altura");
        altura = entrada.nextDouble();
        area = base * altura / 2;
        System.out.println("el area del triangulo es: " + area + "\n");
    


        System.out.println("2. Suma");
        
        System.out.println("este programa suma dos numeros ");
        double numero1, numero2, total;
        System.out.println("ingrese un numero");
        numero1=entrada.nextDouble();
        System.out.println("ingrese el siguente numero");
        numero2=entrada.nextDouble();
        total=numero1+numero2;
        System.out.println("la suma de los numero es: "+ total +"\n");
        
        
       System.out.println("3. numero elevado");
      
       System.out.println("este programa eleva un numero al cuadrado "+"\n");
       int numero3,total3;
       System.out.println("ingrese un numero");
       numero3=entrada.nextInt();
       total3=numero3^2;
       System.out.println("el numero elevado al cuadrado es:"+total3+ "\n");
       
       System.out.println("4.convertidor");
       
       double euros,dolares,resultado;
        System.out.println("este programa convierte euros a dolares ");
        System.out.println("ingrese los euros ");
        euros=entrada.nextDouble();
        dolares=euros*1.07;
        System.out.println("dolares: "+dolares );
       
        System.out.println("5.area y perimietro de un cuadrado"+"\n");
        
        System.out.println("ese programa determina el area y perimetro de un cuadrado"+"\n");
        
        double area9,lado,perimetro;
        System.out.println("ingrese el lado del cuadrado");
        lado=entrada.nextDouble();
        area9=lado*lado;
        perimetro=lado*lado*lado*lado;
        System.out.println("el area del cuadrado es:"+area9 +"cm2" );
        System.out.println();
        System.out.println("el perimietro del cuadrado es"+perimetro +"cm2"+"\n");
        
        
        System.out.println("6.area y volumen de un cilindro");
        
        System.out.println();
        System.out.println("este programa calcula el area y volumen de un cilindro"+"\n");
        System.out.println();
        double radio5,altura7,areacili,volumencili;
       System.out.println("ingrese el radio del cilindro");
        radio5=entrada.nextDouble();
        
        System.out.println("ingrese el altura del cilindro");
       altura7=entrada.nextDouble();
        
       areacili=((2)*(3.1416)*(radio5))*(altura7*radio5);
       volumencili=((3.1416)*(radio5*radio5)*(altura7));
       
    System.out.println("el area del cilindro es"+areacili+"cm2");
    System.out.println();
        System.out.println("el volumen del cilindro es"+volumencili+"cm3");
        
        
        System.out.println("7 area longitud radio de un circulo");
        System.out.println();
        System.out.println("este programa alcula el area y logitud de un circulo"+"\n");
        System.out.println();
        double area8,longitud,radio2;
        System.out.println("ingrese el radio del circulo");
        radio2=entrada.nextDouble();
        
        longitud=(2*(3.1416)*radio2);
        area8=((3.1416)*(radio2*radio2));
        System.out.println(" la longitud del circulo es:"+longitud);
        System.out.println();
        System.out.println("el area del  circulo es: "+area8);        
        
        
        System.out.println("8.promedio de 3 numeros ");
      System.out.println("este programa calcula el promedio de 3 numeros "+"\n");
      
      double dato1,dato2,dato3,promedio;
      System.out.println("ingrese un numero");
      dato1=entrada.nextInt();
      System.out.println("ingrese un numero");
      dato2=entrada.nextInt();
      System.out.println("ingrese un numero");
      dato3=entrada.nextInt();
      promedio= dato1+dato2+dato3/2;
      System.out.println("el promedio es:"+promedio+"\n" );
              
      
        
       
        
                
      
                
        
        
    }
    
    
    

    
}
 