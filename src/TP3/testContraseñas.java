/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;


public class testContraseñas {
   

    
    public static boolean tieneMinimoCaracteres(String contraseña) {
        return contraseña.length() >= 8;
    }

    
    public static boolean tieneDigitos(String contraseña) {
        for (char caracter : contraseña.toCharArray()) {
            if (Character.isDigit(caracter)) {
                return true;
            }
        }
        return false;
    }

   
    public static boolean tieneCaracterEspecial(String contraseña) {
        String caracteresEspeciales = "!@#$%^&*";
        for (char caracter : contraseña.toCharArray()) {
            if (caracteresEspeciales.contains(Character.toString(caracter))) {
                return true;
            }
        }
        return false;
    }

  
    public static String construirContraseñaSegura(String... componentes) {
        StringBuilder sb = new StringBuilder();
        for (String componente : componentes) {
            sb.append(componente);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
      
        String contrasena1 = "Contraseña123";
        String contraseña2 = "SecurePassword!";
        String contraseña3 = "abc123";

        System.out.println("La contraseña tiene al menos 8 caracteres: " + tieneMinimoCaracteres(contrasena1));
        System.out.println("La contraseña tiene al menos un digito numerico: " + tieneDigitos(contrasena1));
        System.out.println("La contraseña tiene al menos un caracter especial: " + tieneCaracterEspecial(contrasena1));

        String contraseñaSegura = construirContraseñaSegura("Mi", "Contraseña", "Segura", "123", "!");
        System.out.println("Contraseña segura construida: " + contraseñaSegura);
    }
}

      