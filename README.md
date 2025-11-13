# 💰 Sistema de Controle de Despesas

## 📋 Descrição do Projeto
Sistema feito em Java puro para o controle e gerenciamento de despesas pessoais,
permitindo que os usuários cadastrem diversos tipos de despesas e acompanhem suas finanças de forma 
organizada e simples.

## 🎯 Objetivo
Implementar uma aplicação desktop em Java que utilize os 
conceitos de Programação Orientada a Objetos (POO) para gerenciar despesas.

## 🏗️ Estratégia de Construção

### Metodologia de Desenvolvimento
- **Desenvolvimento versionado**: Cada commit representa uma nova funcionalidade
- **Versionamento Semântico**: Versões no formato `MAJOR.MINOR.PATCH`, padrão muito utilizado em aplicações desktop, web e mobile
- **Documentação Contínua**: README atualizado a cada entrega

### Abordagem Técnica
1. **Primeira Fase**: Estrutura básica e menu principal
2. **Segunda Fase**: Implementação das classes, Regras de négocio, Herança, Polimorfismo e Interfaces
3. **Terceira Fase**: Criptografia e detalhes finais

## 📊 Status do Projeto
**Versão Atual**: 0.0.3  
**Status**: 🎉 MVP FUNCIONAL CONCLUÍDO

#### 🟢 CORE DO SISTEMA
- [x] **Cadastro de Despesas** - Com valor, data, descrição e status
- [x] **Listagem Completa** - Todas as despesas com formatação
- [x] **Filtros por Status** - Despesas em aberto vs pagas
- [x] **Registro de Pagamentos** - Marcar despesas como pagas
- [x] **Persistência em Arquivo** - Dados salvos automaticamente

#### 🛠️ TECNICAMENTE
- [x] **Arquitetura em Camadas** - Entity, Service, Main
- [x] **Tratamento de Exceções** - Entradas inválidas tratadas
- [x] **Persistência em .txt** - Arquivo `data/despesas.txt`
- [x] **Interface Amigável** - Emojis e formatação clara


## 🎯 SEPARAÇÃO DE PRIORIDADES

### 🟢 ALTA PRIORIDADE (MVP - Commit 0.1.0)
- [ ] **Entrar Despesa** - Cadastro com descrição, valor e categoria
- [ ] **Listar Despesas** - Visualização básica em console
- [ ] **Anotar Pagamento** - Marcar despesa como paga
- [ ] **Persistência Básica** - Salvar/ler de arquivo .txt

### 🟡 MÉDIA PRIORIDADE (Versão 0.2.0)
- [ ] **Tipos de Despesa** - Categorização com herança
- [ ] **Datas** - Vencimento e data de pagamento
- [ ] **Filtros** - Buscar por status/categoria

### 🔴 BAIXA PRIORIDADE (Versão 0.3.0)
- [ ] **Sistema de Usuários** - Login com criptografia
- [ ] **Relatórios** - Estatísticas e relatórios
- [ ] **Interface Avançada** - Melhorias de UX

## 🏛️ Arquitetura Planejada

### Classes Previstas
| Classe | Tipo | Descrição |
|--------|------|-----------|
| `Main` | Concreta | Classe principal e controle do menu |
| `Despesa` | Abstrata | Modelo base para todas as despesas |
| `DespesaTransporte` | Concreta | Herda de `Despesa` |
| `DespesaAlimentacao` | Concreta | Herda de `Despesa` |
| `Usuario` | Concreta | Gerencia dados do usuário |
| `TipoDespesa` | Concreta | Categorias de despesas |

### Métodos Principais Previstos
- `registrarDespesa()`: Cadastra nova despesa
- `listarDespesas()`: Exibe despesas por filtro
- `gerenciarUsuarios()`: CRUD de usuários

## 🔬 POC - PROVA DE CONCEITO

**Objetivo**: Validar arquitetura de persistência em arquivo texto  
**Funcionalidade Testada**: "Entrar Despesa" completa  
**Métricas de Sucesso**:
- ✅ Dados persistem após fechar programa


**Tecnologias Testadas**:
- Serialização em arquivo texto
- Classes Java com encapsulamento
- Tratamento de exceções

---

## 📦 MVP - PRODUTO MÍNIMO VIÁVEL

**Definição**: Sistema que permite:
- ✅ Cadastrar despesas (descrição, valor, categoria)
- ✅ Listar despesas cadastradas
- ✅ Marcar despesas como pagas
- ✅ Dados persistem em arquivo

**Escopo do MVP**:
`java`

// Funcionalidades ESSENCIAIS
1. CadastrarDespesa(descricao, valor, categoria)
2. ListarDespesas()
3. MarcarComoPaga(id)
4. SalvarEmArquivo()
5. CarregarDeArquivo()


## 📝 Changelog


### [v0.0.3] - 2025-11-12
#### ✅ IMPLEMENTADO
- Sistema completo de cadastro de despesas
- Persistência automática em arquivo texto
- Listagens com filtros (todas/abertas/pagas)
- Registro de pagamentos funcional
- Tratamento robusto de exceções
- Interface de usuário melhorada

#### 🎯 CARACTERÍSTICAS
- **100% Funcional** - Todas operações básicas working
- **Dados Persistentes** - Sobrevive a reinicializações
- **Interface Intuitiva** - Feedback visual claro
- **Código Organizado** - Boas práticas de POO


### [v0.0.2] - 2025-11-10
#### ✅ Adicionado
- Definição clara de prioridades (Alta/Média/Baixa)
- Prova de Conceito (POC) para persistência
- Escopo do Produto Mínimo Viável (MVP)
- Roadmap detalhado das próximas versões
- Arquitetura inicial do sistema

#### 🎯 Planejado para v0.0.3

1. Implementação da classe Despesa
2. Sistema de persistência em arquivo texto
3. POC funcional do cadastro de despesas

### [v0.0.1] - 2025-10-31
#### ✅ Adicionado
- Menu principal com 6 funcionalidades
- Sistema de navegação entre as opções
- Tratamento de exceções para entrada inválida
- Estrutura básica do projeto Java
- Loop de execução até opção de saída

#### 🎯 Funcionalidades do Menu
1. **Entrar despesa** - Placeholder implementado
2. **Anotar pagamento** - Placeholder implementado
3. **Listar despesas em aberto** - Placeholder implementado
4. **Listar despesas pagas** - Placeholder implementado
5. **Gerenciar tipos de despesa** - Placeholder implementado
6. **Gerenciar usuário** - Placeholder implementado
0. **Sair** - Funcionalidade completa

## 👨‍💻 Tecnologias Utilizadas
- **Linguagem**: Java
- **Versionamento**: Git/GitHub
- **Documentação**: Markdown

## 📞 Contato
**Desenvolvedor**: Paulo Henrique Dos Santos  
**Email**: paulohsantos2005@gmail.com  
**Repositório**: https://github.com/PauloH-Tech/Sistema_de_Despesas.git

---
