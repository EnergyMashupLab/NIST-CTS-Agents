Design Notes - J2EE Containers and Loops
========

Background
----------
See the project [README](../../README.md)

J2EE Containers in utilityjava
---------------------

We create one container for each actor
- Each Transactive Energy User Agent (TEUA)
- The Market Agent (MA)
- The Market

The containers' lifecycle is managed with the Spring framework. The actors communicate with HTTP GET and PUT operations.

At a high level, the main loop for each actor awaits input, processes, and repeats, similar to a listener loop in networking.
Creating and receiving payloads is the core interactions; all messages conform to the Common Transactive Services (CTS) with the following simplifications:
- Simpler XML Schemas to allow for simpler yet conformant payloads and data types
- JSON schemas generated from the XSD as a guide to serialization
- UML models created from the XSD, and simplified as in OASIS Energy Interoperation
- Sample artifacts build in XML from the schemas, as a guide for generation of JSON and Java payload objects
- Inheritance hierarchy between EmixBaseType and TenderType and TransactionType made explicit rather than implicit as in the standards
- Simpler EMIX artifacts with a single time interval each, then reflected in the inherited Tenders and Transactions

The traceable events are receipt and creation of payloads. This also will apply to the Market implementation.
This allows key tracing functions in a simulation or live deployment to be easily done. The key points are
- Logging
- Ledger Management, and 
- Position Management

To exercise these hooks, in high level pseudocode the main loop for the TEUA is 


 
License
-------

This project is licensed under the Apache 2.0 License.

Acknowledgments
---------------
