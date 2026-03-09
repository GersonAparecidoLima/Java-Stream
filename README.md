🌊 Java Streams: Processamento Inteligente de Dados

Este repositório é dedicado ao estudo e implementação da Stream API do Java. Aqui, exploro como transformar coleções de dados de forma declarativa, utilizando conceitos de programação funcional para escrever códigos mais limpos, performáticos e fáceis de manter.

🚀 Conceitos e Operações Aplicadas
🧊 Imutabilidade e Factory Methods
List.of(): Criação de listas imutáveis de forma concisa, garantindo a segurança dos dados e evitando efeitos colaterais em coleções que não devem ser alteradas.

⚙️ O Fluxo de Dados (Stream API)
.stream(): Início do pipeline de processamento, permitindo que os dados sejam manipulados elemento a elemento de forma eficiente.

.filter() (Filtragem): Aplicação de predicados (expressões lambda) para selecionar apenas os dados que atendem a critérios específicos (ex: nomes que começam com determinada letra).

.map() (Transformação): Mapeamento de valores para novos formatos ou cálculos (ex: calcular comissões de vendas ou converter textos para maiúsculas).

🏁 Operações Terminais
.toList(): Coleta dos resultados do fluxo de volta para uma lista concreta, encerrando o pipeline de processamento.
