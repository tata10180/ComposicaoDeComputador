/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacao;

/**
 *
 * @author thays
 */
public class Computador {
    String marca;
    String modelo;
    int anoFabricacao;
    MemoriaRAM memoria;
    
    public Computador(String marca, String modelo, int anoFabricacao, String tipoRam,int capacidadeRam ){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.memoria = new MemoriaRAM( tipoRam, capacidadeRam);
    }
    public void ligar(){
            System.out.println("Computador "+marca+" "+modelo+" "+anoFabricacao+" ligado! Iniciando o sistema...");
    }
    public void executarPrograma(){
        if(memoria.isInstalada()){
            System.out.println("Executando programa.... Rapido gracas a "+memoria.getDiscricao()+"!");
        } else{
            System.out.println("Impossivel executar: sem memoria RAM instalada!");
        }
    }
    public void mostrarConfiguracao(){
        System.out.println("Configuracao do Sistema");
        System.out.println("Marca: "+marca+" | Modelo: "+modelo);
        System.out.println("Ano: "+anoFabricacao);
        System.out.println("Status da memoria: "+memoria.isInstalada());
        System.out.println("Descricao: "+memoria.getDiscricao());
        
    }
}
