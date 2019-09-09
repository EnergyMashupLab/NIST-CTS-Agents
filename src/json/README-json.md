NIST-CTS Common Transactive Services JSON Schemas
=================================================

Background
----------
See the project [README](../../README.md)

Technical Description Transactive Services JSON Schemas
-------------------------------------------------------
The NIST-CTS Project is a standards-based implementation of the Common
Transactive Services and a Market Agent and a Transactive Energy Agent. See the
respective repositories' README files for a closer view; see the project
[README](../../README.md) for an overview.

-   **CTS JSON Schemas** These schemas are used to implement the Common
    Transactive Services CTS links in the [Architecture
    Drawing](../../Architecture.png) shown below. They are planned for payload
    serialization.

Schemas for the Common Transactive Services are a minimalist expression of OASIS
Energy Interoperation, OASIS EMIX, and OASIS WS-Calendar PIM and Streams for use
in inter-actor communication.

Changes include - Profiled to use Minimal PIM Conformant WS-Calendar,
WS-Calendar Streams, Strip GML - Removed references to VENs, VTNs to leave
Common Transactive Services only

These JSON schemas are

Copyright 2019 TC9 Inc and Cox Software Architects LLC

Copyright 2014 2015 OASIS Open

A summary of where the utility code is used is in the [project README Architecture Drawing](../../Architecture.png): ![Architecture Drawing](../../Architecture.png)

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

These schemas are based on the Energy Interoperation, EMIX, and WS-Calendar
schemas and WS-Calendar Platform-Independent Model (PIM). See the individual xsd
files for details.

Built With
----------

Agile programming and architecture are used.

The project uses Github, Maven, and Java 8.

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
