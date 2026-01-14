/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacao;

/**
 *
 * @author thays
 */
public class MemoriaRAM {

    String tipo;
    int capacidadeGb;
    boolean instalada = true;
    
    public MemoriaRAM(String tipo, int capacidadeGb){
        this.tipo = tipo;
        this.capacidadeGb = capacidadeGb;
    }
    public String getDiscricao(){
        return "Memoria " +tipo+" GB "+ capacidadeGb;
    }
    public boolean isInstalada(){
        return instalada;
    }
    public void remover(){
        this.instalada = false;
        System.out.println("Memoria RAM removida do do computador");
    }
}
