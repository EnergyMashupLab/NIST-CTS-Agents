NIST-CTS
========

We invite participation in an open source project to develop Actors for
edge-based self-optimization of power distribution systems. This project is named
NIST-CTS because it is an implimentation of an agent based transactive energy 
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

With respect to markets, Bilateral Market is classification; Double Auction and Order Book are two subclassifications within bilateral markets.

To see a description of the components that make up this project, look under the 
link to src, above.

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

The project has four repositories in addition to this top-level repository:

-   **Markets** including

    -   The Market Modular Interface
    
    -   A bilateral market
    
    -   (future) Additional plug-in markets and documentation

-   **Market Agent** (MA) which interacts with the markets and with Transactive
    Energy Agents using the CTS including
    
    -   The Market Modular Interface
    
    -   Market Position Management (see note)
    
    -   Maintains the Ledger, the record of cleared (not pending) transactions (see note)
    
    -   Uses ei2j capabilities for CTS connections
    
    -   (Optional and future) links to wholesale markets
    
-   **Transactive Energy [User] Agent** (TEUA) which interacts with the MA and provides
    integration capabilities for device and facility management
    
    -   Uses ei2j capabilities for CTS connections
    
    -   Integrates with Supervisory Controller (SC)
    
    -   Provides information on committed market positions to the SC (see note below)

-   **Utilities**

    -   Common Transactive Services (CTS) implementation

    -   ei2j--Energy Interoperation to and from Java, includes CTS implementation

    -   Logging (traces) and input for live and simulation meter and other data
    
    -   Ledgers keep records of tenders and transactions; they can be saved to a file or possibly sent over a network connection as the design matures.
    
Note: 
A ledger is a list in time order of committed transactions. A position is cumulative committed transactions. A trace of messages includes transactions proposed but never cleared.

The Market Position Manager is a function that tracks completed (cleared) transactions in a ledger to determine committed market positions. Market position information is needed by the TEUA (on behalf of the SC), and is maintained by the MA as transactions are created and cleared.

The TEUA consumes information on existing market positions to the SC which can use the information to determine the difference between committed position and projected needs, thus transacting only for what is needed to align currcommitted position with projected needs, tendering to buy or sell as appropriate.

All transactions and clearing flow through the MA, which through the MPM function will update the Market Position for use by the TEUA.
    
See the Architecture Drawing below. ![Architecture Drawing](Architecture.png)

Built With
----------

Agile programming and architecture are used.

The project uses Github, Maven, and Java 8.

Build Steps
-------
1. Download the Spring tool IDE(Or any eclipse will also work)
2. Install the MySql Server on your machine.
3. Clone the current project into your local machine
    3.1 git clone <project_url>
    3.2 git checkout development
    3.3 git pull origin development
4. Import the project into your Spring tool IDE
5. Click on Build to build the project

Authors
-------

-   **William Cox** - *Architecture* - [Cox Software Architects
    LLC](http://coxsoftwarearchitects.com/)

-   **Toby Considine –** *Architecture* – [TC9 Inc](http://www.tc9.com/)

See also the list of [contributors] who participated in this project.

License
-------

This project is licensed under the Apache 2.0 License.

For incoming (contributed) licenses see https://github.com/EnergyMashupLab/EML_Licenses

Acknowledgments
---------------
