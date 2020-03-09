URI Structure for POST service operations
=====================================

### /LMA 
        /CreateTender
        /CreatedTender
        /CreateTransaction
        /CreatedTransaction 
        /CancelTender 
        /CanceledTender

### /LME 
        /CreateTender
        /CancelTender
        /CreatedTransaction 

### /TEUA
        /<number>/
                /CreateTender
                /CreatedTender
                /CreateTransaction

TEUA numbers assigned on creation.

#### Terminology 
LMA - Local Market Agent

LME - Local Market Engine 

TEUA - TE User Agent 

Refer to the [Architecture Diagram](https://github.com/EnergyMashupLab/NIST-CTS-Agents/blob/master/Architecture.png) for more detail on the RESTcontrollers.