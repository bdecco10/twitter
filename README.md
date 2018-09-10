# Twitter
Consume serviço do twitter

# Framework
SpringBoot: 2.0.4.RELEASE                                                                                                                 
Mockito: 2.0.4.RELEASE                                                                                                             
Junit: 2.0.4.RELEASE                                                                                                             
Twitter4j: 4.0.7                                                                                                             
SpringData: 2.0.4.RELEASE                                                                                                             
H2database: 2.0.4.RELEASE                                                                                                             

# Design Patterns
Strategy

# PACKAGE
MVC - com.br.twitter.                                                                                                                     
Controller : responsavel pela regra de negocio                                                                                             
Service: responsavel por expor o serviço                                                                                                   
Consume: consumir o serviço                                                                                                               
model: responsável por manipular os objetos de payload                                                                                     
Utils: utilizado em todas as camadas como apoio                                                                                                                     
# BD
H2                                                                                                                                        

# Teste
Classe de test

TwitterLegacyConsumeTest: responsavel pelos teste unitarios da classe controller                                                           

# OBS                                                                                                                                     
App que recupera 100 post do twitter e salva no H2 embarcado do proprio SpringBoot, recupera as informações usando o SpringData com Query nativa.
