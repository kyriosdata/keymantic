# Branch (erivan)
Criado para identificar com precisão todas as contribuições do erivan ao projeto,
dessa forma, mantendo um registro histórico do que foi realizado. 

# Objetivo
Definir e implementar estratégia inspirada no _keymantic_ para a produção de consultas AQL (_Archetype Query Language_) a partir de palavras-chave. A estratégia deve produzir zero ou mais consultas em AQL a partir de um conjunto fornecido de palavras-chave, tendo acesso restrito às descrições de arquétipos, registradas usando a linguagem ADL (_Archetype Definition Language_), sem consulta aos dados correspondentes. 

# Plano do projeto
- Iniciação científica ([aqui](https://docs.google.com/document/d/1mWNLwYy9H4FYTgc9hbmU4QttvOldDwPYqFij8oIkHDE/edit?usp=sharing))

# Documentação
Consulte [aqui](https://kyriosdata.github.io/keymantic).

### Objetivos específicos
- Personalizar o método _keymantic_ para o contexto específico de arquétipos. Essa adaptação é um trabalho desconhecido na literatura especializada.
- A personalização pode incluir o [Lucene](https://lucene.apache.org/) para facilitar a localização do arquétipo de interesse dado um conjunto de palavras chave?
- Implementar o método personalizado (item acima).
- Registrar o desempenho do método implementado.
