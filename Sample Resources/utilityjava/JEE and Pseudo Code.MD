Design Notes - JEE Containers and Actor Loops
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

The containers' lifecycle is managed with the Spring framework. The actors are effectively HttpServlets, and communicate with HTTP GET and PUT operations. Within these containers certain EJBeans implement the equivalent of HttpServlet, and communicate with actors in other contains via HTTP GET PUT and POST.

At a high level, the main loop for each actor awaits input, processes, and repeats, following a typic listener loop pattern.

Creating and receiving payloads is the core interaction; all messages conform to the Common Transactive Services (CTS) with the following simplifications:
- Simpler XML Schemas to allow for simpler yet conformant payloads and data types
- JSON schemas generated from the XSD as a guide to serialization
- UML models created from the XSD, and simplified as in OASIS Energy Interoperation
- Sample artifacts build in XML from the schemas, as a guide for generation of JSON and Java payload objects
- Inheritance hierarchy between EmixBaseType and TenderType and TransactionType made explicit rather than implicit as in the standards
- Simpler EMIX artifacts with a single time interval each, then reflected in the inherited Tenders and Transactions

Logging, Ledgers, and Positions
-----------------------------
A ledger is a list in time order of committed transactions. A position is cumulative committed transactions. A trace of messages includes transactions proposed but never cleared.

The Market Position Manager is a function, not an actor, that tracks completed (cleared) transactions in a ledger to determine committed market positions. Market position information is needed by the TEUA (on behalf of the SC), and is maintained by the MA as transactions are created and cleared.

The TEUA consumes information on existing market positions to the SC which can use the information to determine the difference between committed position and projected needs, thus transacting only for what is needed to align currcommitted position with projected needs, tendering to buy or sell as appropriate.

The traceable events are receipt and creation of payloads. This also will apply to the Market implementation.
This allows key tracing functions in a simulation or live deployment to be easily done. The key points are
- Logging
- Ledger Management, and 
- Position Management

To exercise these hooks, in high level pseudocode the **main loop for the TEUA** would look something like this:

- Get a request to buy/sell energy (from the SC) (**log** in transport message list for debugging)
- Create a CreateTender payload (**log** with all fields of the Tender (party, counterparty, Tender, etc)
- Send to MA (**log** in transport message list)
- Wait for response in the form of a Created Tender (**log** receipt) and then a CreateTransaction(**log** and **ledger**)
- Update my **position**
- Respond to a CreateTransaction with a CreatedTransaction (**log**)

Similarly, the **main loop for the MA** would look something like this:

- Get a CreateTender (from a TEUA) (**log**) (**log** in transport message list for debugging)
- Respond with a CreatedTender (**log**)
- Forward tender to the market (**log**) (**log** in transport message list for debugging)
- When market matches and clears, build and send CreateTransaction (**log** and **ledger**) (**log** in transport message list for debugging)
- When CreatedTransaction received from TEUA (**log** and **ledger**) (**log** in transport message list for debugging, update in ledger to note acknowledgement)
 
License
-------

This project is licensed under the Apache 2.0 License.

Acknowledgments
---------------
