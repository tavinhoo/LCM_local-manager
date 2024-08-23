# 🛠 Gerenciador de Comércio Local

Bem-vindo ao repositório do projeto de gerenciamento para um comércio local! 🚀 Este projeto visa criar um módulo de um ERP que auxilia no controle de caixa, pagamentos, estoque e outras funcionalidades essenciais para o gerenciamento eficiente de um comércio.

## 🎯 Propósito do Projeto

O objetivo é desenvolver uma aplicação robusta que permita:
- **Controle de Caixa:** Gerenciar transações financeiras e acompanhar entradas e saídas de caixa.
- **Pagamentos:** Registrar e gerenciar pagamentos realizados e pendentes.
- **Estoque:** Monitorar e controlar o estoque de produtos disponíveis.
- **Outras Funcionalidades:** Oferecer suporte para outras necessidades operacionais de um comércio local.

Para isso, utilizaremos as seguintes tecnologias:
- **Frontend:** Angular
- **Backend:** Java com Spring Boot

## 🛠 Tecnologias e Dependências

### Frontend (Angular):
- Angular CLI
- Angular Router
- Reactive Forms ou Template-driven Forms
- HttpClientModule
- Angular Material ou Bootstrap
- RxJS
- NgRx (opcional)
- ngx-toastr ou Angular Snackbar

### Backend (Java com Spring Boot):
- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Spring Boot Starter Security
- Spring Boot Starter Validation
- Spring Boot Starter Actuator
- Spring Boot Starter Test
- JWT (JSON Web Token)
- PostgreSQL Driver
- MapStruct

## 🗂 Estrutura do Projeto

### Frontend
- Desenvolvimento da interface de usuário e funcionalidades com Angular.
- Comunicação com o backend via HTTP para gerenciamento de caixa, pagamentos e estoque.

### Backend
- Criação de APIs RESTful com Spring Boot.
- Implementação da lógica de negócios para controle de caixa, pagamentos e estoque.
- Gerenciamento de autenticação e autorização com JWT.

## 🛠 Instruções de Configuração

### Backend
1. Clone o repositório:
   ```bash
   git clone https://github.com/tavinhoo/LCM_local-manager.git
2. Navegue até o diretório do backend:
   ```bash
   cd backend
3. Configure seu banco de dados no arquivo application.properties.
4. Execute o projeto:
   ```bash
   ./mvnw spring-boot:run
### Frontend
1. Navegue até o diretório do frontend:
   ```bash
   cd frontend
2. Instale as dependências:
   ```bash
   npm install
3. Execute o servidor de desenvolvimento:
  ```bash
  ng serve
  ```

## 🧩 Funcionalidades Futuras

- **Sistema de Relatórios e Análises:** Implementação de relatórios personalizados e análises de dados para ajudar na tomada de decisões.
- ~**Integração com Gateways de Pagamento:** Conectar o sistema a gateways de pagamento para facilitar transações online.~
- **Melhorias na Interface de Usuário:** Refinamento contínuo da interface para melhorar a experiência do usuário.
- **Notificações:** Adicionar notificações em tempo real para atualizações de estoque, pagamentos pendentes, etc.
- **Multiplataforma:** Expandir o suporte para dispositivos móveis com um design responsivo ou uma aplicação mobile.

## 📜 Contribuindo

Se você deseja contribuir para o projeto, sinta-se à vontade para enviar um pull request ou abrir uma issue para discutir melhorias. 🚀

## 📣 Acompanhe o Desenvolvimento

Para acompanhar o progresso e as atualizações do projeto, siga-nos no [GitHub](https://github.com/tavinhoo/LCM_local-manager.git). Sinta-se à vontade para fazer perguntas ou sugestões!

## 📄 Licença

Este projeto é licenciado sob a [Licença MIT](LICENSE).

---

Obrigado por visitar o repositório do projeto! Se tiver alguma dúvida ou sugestão, não hesite em entrar em contato. 😊

