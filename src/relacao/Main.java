/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacao;

/**
 *
 * @author thays
 */
public class Main {
    public static void main(String[] args){
        Computador meuPC = new Computador("Dell","G15", 2023, "DDR5", 16);
        
        meuPC.ligar();
        meuPC.mostrarConfiguracao();
        meuPC.executarPrograma();
        
        
    
    }
}
