# XML Schema Definitions (XSD) for the CTS rev 0.4
These are restricted schemas based on those in the OASIS specifications for 

+ WS-Calendar
+ Energy Market Infromation Exchange (EMIX)
+ Energy Interoperation (EI)
They have been restricted to use only the information needed for the Common Transactive Services (CTS).

In all schemas, complexity was removed by using the minimal PIM conforming schema (WS-CALENDAR MIN) for all semantics. All schedule objects are based on WS-Calendar STREAMS to permit inheritance when it makes the market work, and to reduce the many ways a WS-Calendar internal can be communicated to a single model that can be used for all CTS purposes.
