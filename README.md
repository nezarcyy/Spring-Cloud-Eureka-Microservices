# Microservices Architecture with FeignClient
## Project Overview

This repository focuses on implementing a microservices architecture with FeignClient. The primary objective is to provide a comprehensive understanding of the architecture's key components and principles. The project includes features such as the creation and registration of microservices, connecting to an in-memory H2 database, establishing a microservice Gateway, and implementing synchronous communication between microservices using the OPENFEIGN tool.


## Architecture Overview

The microservices architecture, implemented with Spring Cloud and Eureka, adheres to key principles, including the distribution of responsibilities, autonomous service management, and communication through lightweight protocols.

## Project Structure

-   **Microservices**: The core structure comprises client microservices, functioning as autonomous entities that interact to deliver complete functionality. such as Voiture and Client.
-   **API Gateway**: Acts as a centralized entry point, streamlining request management by directing traffic to the relevant microservices.
-   **Eureka Discovery Server**: Plays a crucial role by enabling dynamic registration of each microservice, forming a decentralized directory of available services.

## Architecture Diagram
For a visual representation of the microservices architecture, please refer to the diagram below:

<p align="center">
  
![Capture](https://github.com/nezarcyy/Spring-Cloud-Eureka-Microservices/assets/101062393/84ca4428-c575-4781-b31b-cdc909660577)

</p>

