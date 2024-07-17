---
title: UML Iphone
---
classDiagram
  Iphone --> reprodutorMusical
  Iphone --> aparelhoTelefonico
  Iphone --> navegadorInternet
  reprodutorMusical : +tocar(): void
  reprodutorMusical : +pausar(): void
  reprodutorMusical : +selecionarMusica(String musica): void
  reprodutorMusical : String musica
