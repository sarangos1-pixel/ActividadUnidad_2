/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadunidad_2;

/**
 *
 * @author Sebastian
 */
public class vehiculo {
    public void moverse(){
        System.out.println("el vehiculo se mueve");
    }
    
}

  class Bicicleta extends vehiculo{
  @Override
  public void moverse(){
      System.out.println("la bicicleta se mueve");
      
   }
}
