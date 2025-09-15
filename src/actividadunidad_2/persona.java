/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadunidad_2;

/**
 *
 * @author Sebastian
 */
public class persona {
    public void Presentarse(){
        System.out.println("hola, me presento");
    }
   
 }


 class Estudiante extends persona{
    @Override
    public void Presentarse(){
        System.out.println("hola, soy un alumno");
    }

 }

 class Profesor extends persona{
   @Override
   public void Presentarse(){
         System.out.println("Hola, soy un tutor");
    }
}
