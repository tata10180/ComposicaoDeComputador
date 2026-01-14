# ComposicaoDeComputador
Este projeto é um exemplo prático de implementação do conceito de Composição em Programação Orientada a Objetos utilizando Java, criado durante uma aula do curso Desenvolvedor Back-End do SENAI.

O sistema simula a relação entre um Computador e sua MemoriaRAM, onde o ciclo de vida da memória está intrinsecamente ligado ao do computador.

🚀 Conceitos Aplicados
Composição: A classe Computador possui um objeto MemoriaRAM como atributo, que é instanciado diretamente no seu construtor.

Encapsulamento: Uso de atributos e métodos para controlar o estado da memória (instalada ou não).

Lógica de Negócio: Métodos que validam se o sistema pode executar programas com base no hardware disponível.

🛠️ Funcionalidades
[x] Criar um computador com especificações personalizadas.

[x] Gerar automaticamente um componente de memória RAM no ato da criação.

[x] Verificar o status do hardware antes de executar tarefas.

[x] Simular a remoção física da memória RAM.

[x] Exibir configurações detalhadas do sistema.

📂 Estrutura das Classes
MemoriaRAM: Define o tipo, capacidade e status de instalação.

Computador: Gerencia o hardware e executa operações do sistema.

Main: Ponto de entrada para demonstrar o funcionamento do sistema.
