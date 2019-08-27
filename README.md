# NIST-CTS

The NIST-CTS Project is an implementation of the Common Transactive Services and a Market Agent and a Transactive Energy Agent. The goal is to provide the following. See the respective repositories' README files for a closer view.
* Common Transactive Services infrastructure
* The Market Modular Interface
* One or more pluggable markets
* A Transactive Energy Agent to integrate with consumers and producers of energy and interact with the market(s) through a Market Agent (MA)

The project uses Utilities including
* Energy Interoperation to and from Java
* Logging and input for live and simulation data
* Ledgers

The project is based on standards including 
* the TEMIX profile of [OASIS Energy Interoperation](https://docs.oasis-open.org/energyinterop/ei/v1.0/os/). Energy Interoperation is the profile base of [OOpenADR 2] standardized as [IEC 62746-10-1] (https://webstore.iec.ch/publication/26267)
* Informative UML models for Energy Interoperation/CTS payloads
* Adapter methods for integrating with Independent System Operator and other wholesale energy markets are based on [IEC 62746-10-3:2018] (https://webstore.iec.ch/publication/59771) 
## Project Structure
The project has four repositories in addition to this top-level one:
* Markets including
  * The Market Modular Interface
  * Market Position Management
  * An example functioning market
  * (Optional and future) links to wholesale markets
* Market Agent (MA) which interacts with the markets and with Transactive Energy Agents using the CTS
* Transactive Energy Agent (TEA) which interacts with the MA and provides integration capabilities for device and facility management
* Utilies
  * ei2j--Energy Interoperation to and from Java
  * Logging and input for live and simulation meter and other data
  * Ledgers

## Built With
Agile methods; this is the initial project architecture README

## Authors

* **William Cox** - *Architecture* - [Cox Software Architects LLC](http://coxsoftwarearchitects.com/)

See also the list of [contributors]TBD who participated in this project.

## License

This project is licensed under the Apache 2.0 License [LICENSE.md](LICENSE.md) file for details

## Acknowledgments


