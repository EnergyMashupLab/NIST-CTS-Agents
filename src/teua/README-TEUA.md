NIST-CTS Transactive Energy (User) Agent
========

Background
----------
See the project [README](../../README.md)

Technical Description Transactive Energy (User) Agent (TEA)
---------------------
The NIST-CTS Project is a standards-based implementation of the Common
Transactive Services and a Market Agent and a Transactive Energy Agent. See the
respective repositories' README files for a closer view; see  the project See the project [README](../../README.md) for an overview

-   **Transactive Energy [User] Agent** (TEUA) which interacts with the MA and provides
    integration capabilities for device and facility management
    
    -   Uses ei2j capabilities for CTS connections
    
    -   Integrates with Supervisory Controller (SC)

The terminmology **User Agent** is consistent with X.500 series and mail systems where the user is represented by
a "user agent". In effect the TEA will act as a "skin" to present energy buy and sell requests from the System Controller
to present to and receive from the Market Agent (MA) which encapsulates markets.

See the Architecture Drawing for the TEUA: ![TEUA Architecture Drawing](TEUA-Architecture.png)

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
    
Built With
----------

Agile programming and architecture are used.

The project will use Github, Maven, and Java 8.

Authors
-------

-   **William Cox** - *Architecture* - [Cox Software Architects
    LLC](http://coxsoftwarearchitects.com/)

-   **Toby Considine –** *Architecture* – [TC9 Inc](http://www.tc9.com/)

See also the list of [contributors] who participated in this project.

License
-------

This project is licensed under the Apache 2.0 License.

Acknowledgments
---------------
