# Micro serviço - Envio de email

Este é um Micro-Serviço feito em JAVA com SPRING BOOT e JavaEmailSender. 

**Java**\
**SpringBoot**\
**JavaEmailSender**\
--- 
### **Instalação**
- **Requisitos para instalação:**
  - ```Docker Desktop```


- **Como Instalar:** A imagem que precisa ser baixada do docker hub é a `usuario/imagen` com o ```docker desktop``` instalado corretamente na sua maquina, basta abrir um terminal de comando de sua preferencia e rodar o seguinte comando
  - ```
      clone docker Hub usuario/imagem
    ```    
- **Como Executar:** Se ocorrer tudo certo com o passo assim basta rodar o seguinte comando sempre que quiser executar o Micro serviço
  - ```
      run docker PORT:8081 usuario/imagem
    ```
    Substitua o PORT pela porta que voce quer que o programa executa em seu computador, no meu eu quero que a aplicação escuta a porta `9897` entao o comando ficaria como
  - ```
      run docker 9897:8081 usuario/imagem
    ```
---
### Como usar
- **Nova movimentação:** para realizar o ajuste de estoque voce deve usar o endpoint ```POST http://localhost:8080/stock-movements``` e passar o seguinte boy
```JSON
{
  "to": "altereParaSeuEmail@email.com",
  "subject": "APLICACAO NO AR",
  "body": "Aqui voce deve passar o BODY do EMAIl"
}
```
onde a informação ***product*** corresponde ao id do produto
a ***quantity*** corresponde a quantidade que esta sendo movimentada nesta operação e a informação ***type*** corresponde ao tipo de movimentação sendo "E" para entrada e "S" para saida.