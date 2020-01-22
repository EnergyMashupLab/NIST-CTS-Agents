NIST-CTS
========

We invite participation in an open source project to create Actors[<sup>1</sup>](#fn1) for
edge-based self-optimization of power distribution systems. This project is named
NIST-CTS-Agents because it is an implementation of an agent-based transactive energy 
market using the Common Transactive Services defined during the NIST Transactive 
Energy Challenge. 

Background
----------

Transactive Resource Management (TRM) enables Actors representing systems that
use or supply a resource—any commodity whose value is defined by time and
delivery location— to coordinate behaviors without the need for central control.
TRM-based systems engage Actors in markets to manage supply and demand of a
resource over time. Markets enable emergent behavior—new behavior related to
actors and relationships as actors meet their internal needs.

TRM systems are highly resilient, as Actors can join or leave the system without
additional integration. TRM applications include managing power distribution,
smart power grids, smart water, bandwidth sharing, placement of web and social
media ads, and wastewater management.

When the resource is electric power, TRM is called Transactive Energy (TE).
Transactive Energy is already used to manage the bulk power grid. TE is
considered essential to developing new resilient power grids, to transform
legacy power grids, and to build resource-constrained grids.

Actor-based architectures enable hyper-scalable applications that are easy to
design, build, and maintain. Actor Interactions are limited to defined messages,
so they support diversity of participants and technologies. Market transaction
messages create self-optimizing systems of suppliers, consumers, and
distribution.

This project will develop Transactive Energy User Agents (TEUA) interacting through
Markets. We will define interfaces between an energy system and the Actor (TEUA)
that represents it. TEUAs will interact with a Market Agent/Actor (MA) that
encapsulates market behavior. While the project uses a Bilateral Market model,
the Market Agent will incorporate a Market Modular Interface to support other
market models.

Bilateral Market is a classification; examples of bilateral markets include Double Auction and Order Book.

To see a description of the components that make up this project, look under the 
subfolders of the [dev directory](../dev ).

Results
-------

We expect that this project will make it easier for communities, facility
owners, and device makers to apply TE. NIST looks to use these agents in
simulations to model TE for regulators and legislators. A complete
implementation of the Common Transactive Services will be highly visible and
widely used.

Standards Used
--------------

The project uses standards including

-   The TEMIX profile of [OASIS Energy
    Interoperation](https://docs.oasis-open.org/energyinterop/ei/v1.0/os/).
    Energy Interoperation is the profile base of [OpenADR 2] standardized as
    [IEC 62746-10-1] (<https://webstore.iec.ch/publication/26267>)

-   Informative UML models for Energy Interoperation/CTS payloads as shown in
    the EI Standard

-   ISO 17800 Facility Smart Grid Information Model
    (<https://www.iso.org/standard/71547.html> )

-   Adapter methods for integrating with Independent System Operator Wholesale
    Markets and other energy markets are based on [IEC 62746-10-3:2018]
    (<https://webstore.iec.ch/publication/59771>)

Technical Description
---------------------

The NIST-CTS Project is a standards-based implementation of the Common
Transactive Services and a Market Agent and a Transactive Energy Agent. See the
respective repositories' README files for a closer view.
The Architecture Drawing shows terminology and relationships.![Architecture Drawing](Architecture.png) 

The project has a number of components and information in a number of subfolders under [../dev](../dev ). 

-   **Markets** including

    -   The Local Market Engine (LME), the matching engine that coordinates buy and sell tenders
    
    -   The Market Modular Interface, shown as ei2j+, an extension of the CTS and ei2j
    
    -   A bilateral market
    
    -   (future) Additional plug-in markets and documentation

-   **Local Market Agent** (LMA) which interacts with the local market and with Transactive
    Energy Agents and External Market Adapters using the CTS including
    
    -   The Market Modular Interface, shown as ei2j+, an extension of the CTS and ei2j
    
    -   Market Position Management (see note)
    
    -   The Ledger, the record of cleared (not pending) transactions (see note)
    
    -   Price Adjustment hooks, enabling market economics experiments
    
    -   Uses ei2j capabilities for CTS connections
    
    -   Links to external markets via the External Market Adapter (EMA) which is an extension of the TEUA
    
-   **External Market Adapter** (EMA), an extension of the TEUA, interacts with the Local Market Agent and a single external market. Functions include
    
    -   Market Position Management (see note)
    
    -   The Ledger, the record of cleared (not pending) transactions (see note)
    
    -   Price Adjustment hooks, enabling market economics experiments and presentation of markup on wholesale prices
    
    -   Uses ei2j capabilities for CTS connections
    
-   **Transactive Energy [User] Agent** (TEUA) which interacts with the MA and provides
    integration capabilities for device and facility management
    
    -   Uses ei2j capabilities for CTS connections
    
    -   Integrates with the Supervisory Controller (SC)
    
    -   Maintains the Ledger, the record of cleared (not pending) transactions (see note)
    
    -   Provides information on committed market positions to the SC (see note)

-   **Utilities**

    -   Common Transactive Services (CTS) implementation

    -   ei2j-Energy Interoperation to and from Java, includes CTS implementation

    -   Logging (traces) and input for live and simulation meter and other data
    
    -   Ledgers keep records of tenders and transactions; 
    
Note: 
A ledger is a list in time order of committed transactions. A position is cumulative committed transactions. A trace of messages includes transactions proposed but never cleared. Ledgers are saved to a file or possibly sent over a network connection as the design matures.

The Market Position Manager is a function that tracks completed (cleared) transactions contained in a ledger to determine committed market positions. Market position information is needed by the TEUA (on behalf of the SC), and is maintained by the LMA as transactions are created and cleared.

The TEUA makes information on existing market positions available to the SC, which in turn can use the information to determine the difference between committed position and projected needs. The SC can then transact only for what is needed to align current committed position with projected needs, tendering to buy or sell as appropriate.

All transactions and clearing flow through the LMA, which through the MPM function will update the Market Position for use by the TEUA.

Built With
----------

Agile programming and architecture are used.

The project uses Github, Maven, Java 8, JUnit, Apache Log4j2, Spring and Spring Boot.

Building and Running
-------

See the [HowToDevelop](HowToDevelop) directory for the tooling and development environment.

Authors
-------

-   **William Cox** - *Architecture* - [Cox Software Architects
    LLC](http://coxsoftwarearchitects.com/)

-   **Toby Considine –** *Architecture* – [TC9 Inc](http://www.tc9.com/)

See also the list of [contributors] who participated in this project.

License
-------

This project is licensed under the Apache 2.0 License, and is Copyright 2019-2020 The Energy Mashup Lab.

For incoming (contributed) licenses see https://github.com/EnergyMashupLab/EML_Licenses

Acknowledgments
---------------

Footnotes
---------------

<a class="anchor" id="fn1">1)</a> The difference between Actors and Agents can be a fine one. The actor model of concurrent computation  treats "actor" as the universal primitive of concurrent computation. An actor is an intelligent resource that has the capacity to initiate, manage, and/or control activities of given types. In response to a message it receives, an actor can: make local decisions, create more actors, send more messages, and determine how to respond to the next message received. An Agent *may* be a particular instantiation of an Actor. Some distinguish the two by whether systems can share direct access to external data--to them, an Agent can and an Actor cannot. Perhaps the Market Matching Engine is an Actor and a component of the the Local Market which is an Agent. Similary, the TEUA may be an Actor which with the SC comprises the User Agent. 
This project does not wish to delve into these semantics, and generally uses the terms interchangeably.
