# Fruteira

O sistema gerencia clientes, frutas e vendas, permitindo o controle de quais frutas foram vendidas, em qual quantidade, para qual cliente e em qual data.

.

⚙️ Tecnologias

Java 17: Backend com POO.

PostgreSQL: Banco de dados relacional.

Maven: Gerenciador de dependências e build.

.

📦 Entidades principais:

1. Cliente
   
Armazena os dados dos clientes.

Atributos: id, nome, cpf

2. Fruta
   
Armazena os produtos (frutas) disponíveis para venda.

Atributos: id, nome, quantidade (estoque), preco

3. Venda
Representa uma compra feita por um cliente em uma data específica.

Relacionamento: Um cliente pode fazer várias vendas.

Atributos: id, data_venda, id_cliente (FK)

4. Itens_Venda
Tabela intermediária que liga Venda com Fruta.

Armazena quais frutas foram compradas em cada venda, com suas quantidades.

Atributos: id, quantidade, id_fruta (FK), id_venda (FK)

🔗 Relacionamentos:
Cliente → Venda: 1 cliente pode fazer várias vendas (1:N)

Venda → Itens_Venda: 1 venda pode conter várias frutas (1:N)

Fruta → Itens_Venda: 1 fruta pode aparecer em vários itens de venda (1:N)

.

🎯 Objetivo do sistema:
Controlar as vendas de frutas para diferentes clientes, incluindo:

O que foi vendido.

Em que quantidade.

Para quem.

E quando.

.

Digrama de Relacionamento 

![image](https://github.com/user-attachments/assets/80060e5d-8daf-4712-9193-5eb6e47228c2)

.

![Windows](https://img.shields.io/badge/WINDOWS-0078D6?style=for-the-badge&logo=windows&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/INTELLIJIDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white)
![Java](https://img.shields.io/badge/JAVA-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/POSTGRESQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white)
<img src="https://github.com/user-attachments/assets/1914a67f-dc17-4547-aa03-5f7d88e21893" width="90">

