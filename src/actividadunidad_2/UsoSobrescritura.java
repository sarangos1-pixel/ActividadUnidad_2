/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadunidad_2;

/**
 *
 * @author Sebastian
 */
public class UsoSobrescritura {
    int test;
    public void prueba(){
            System.out.println("prueba");  
    }
    
 }
//con error
 class error extends UsoSobrescritura{
 @Override
 public void prueba(int test){
     System.out.println("prueba incorrecta");
  }
 }
