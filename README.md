# Trabalho de Refatoração do Sistema de Sensores
- **Instituição:** IFBA - Instituto Federal da Bahia
- **Curso:** Análise e Desenvolvimento de Sistemas (ADS)
- **Disciplina:** Padrões de Projetos
- **Projeto:** Refatorando um Sistema de Sensores com Padrões GOF de Criação e Estruturais
- **Professor:** Felipe de Souza Silva
- **Semestre:** 5
- **Ano:** 2025.1

# Sistema de Sensores Inteligente Refatorado

Este projeto consiste na refatoração de um sistema legado de gerenciamento de sensores embarcados, aplicando Padrões de Projeto GOF (Gang of Four) de Criação e Estruturais, com foco em Adapter e Decorator. O objetivo principal foi transformar um sistema com alto acoplamento e baixa coesão em uma solução mais modular, reutilizável e de fácil manutenção.


[Lista A3 - SAJ-ADS08.pdf](https://github.com/user-attachments/files/21475588/A3.-.SAJ-ADS08.-.Refatorando.um.Sistema.de.Sensores.com.Padroes.GOF.de.Criacao.e.Estruturais.pdf)

## Integrantes do Projeto

<table>
  <tr>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/80362674?v=4" width="100px;" alt="Foto do Integrante Janderson"/><br />
      <sub><b><a href="https://github.com/JandersonMota">Janderson Mota</a></b></sub>
    </td>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/110790276?v=4" width="100px;" alt="Foto da Integrante Sarah"/><br />
      <sub><b><a href="https://github.com/">Sarah Pithon</a></b></sub>
    </td>
  </tr>
</table>

## Estrutura do Projeto

A estrutura do projeto está organizada da seguinte forma:

```
/ifba-sistema-sensores
├── SistemaSensoresLegado
├── SistemaSensoresRefatorado
├── SistemaSensoresRefatoradoComSpring
└── README.md
```


```
/SistemaSensoresLegado
├── Main.java
├── SensorTemperatura.java
├── SensorUmidade.java
├── SensorLuminosidade.java
├── DisplayConsole.java
└── SensorManager.java
```


```
/SistemaSensoresRefatorado
├── Main.java
├── sensor
│   ├── ISensor.java                          // Interface comum para sensores (Padrão Adapter)
│   ├── SensorFactory.java                    // Fábrica para criar sensores (Factory Method)
│   ├── SensorManager.java                    // Gerenciador de sensores (Singleton)
│   ├── legacy
│   │   ├── SensorLuminosidade.java           // Classe original (legada)
│   │   ├── SensorTemperatura.java            // Classe original (legada)
│   │   └── SensorUmidade.java                // Classe original (legada)
│   │
│   └── adapter
│       ├── LuminosidadeSensorAdapter.java    // Adapter para SensorLuminosidade
│       ├── TemperaturaSensorAdapter.java     // Adapter para SensorTemperatura
│       └── UmidadeSensorAdapter.java         // Adapter para SensorUmidade
│
├── display
│   ├── IDisplay.java                         // Interface para displays
│   ├── DisplayConsole.java                   // Implementação do DisplayConsole
│   └── decorator
│       ├── SensorDisplayDecorator.java       // Classe abstrata para decoradores de display
│       ├── LogDisplayDecorator.java          // Decorador para adicionar log de leitura
│       ├── FormatacaoDisplayDecorator.java   // Decorador para formatação de dados
│       └── LimiteAlertaDisplayDecorator.java // Decorador para verificação de limites
```


```
/SistemaSensoresRefatoradoComSpring
├── src
│   └── main
│       └── java
│           └── com
│               └── ifba
│                   ├── Main.java
│                   ├── sensor
│                   │   ├── ISensor.java
│                   │   ├── SensorFactory.java
│                   │   ├── SensorManager.java
│                   │   ├── legacy
│                   │   │   ├── SensorLuminosidade.java
│                   │   │   ├── SensorTemperatura.java
│                   │   │   └── SensorUmidade.java
│                   │   │
│                   │   └── adapter
│                   │       ├── LuminosidadeSensorAdapter.java
│                   │       ├── TemperaturaSensorAdapter.java
│                   │       └── UmidadeSensorAdapter.java
│                   │
│                   ├── display
│                   │   ├── IDisplay.java
│                   │   ├── ConsoleDisplay.java
│                   │   └── decorator
│                   │       ├── SensorDisplayDecorator.java
│                   │       ├── LogDisplayDecorator.java
│                   │       ├── FormatacaoDisplayDecorator.java
│                   │       └── LimiteAlertaDisplayDecorator.java
│                   │
│                   └── util
│                       └── Logger.java
```

## Relatorio Técnico

https://docs.google.com/document/d/1mcQfAVPo6UVkutEzuG2npv7XAnWlti0yWRldaMxFWUM/edit?usp=sharing
