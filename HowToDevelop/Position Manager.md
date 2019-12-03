Position Manager:

Position Manager Payload is stored in org.theenergymashuplab.cts.controller.payloads package, in this class all the rest call to access 
position manager is stored. Following describes all its api.
createPosition : Will add position into the table.
getPositionHistoryToId : Fetch position from table with respect to the sellerId.
getPositionHistoryFromId : Fetch position from table with respect to the buyerId.
getPositionHistory : Fetch position from table with respect to the count.
getStatus : Fetch status from table given the id of respective position id.

Position Manager Model is stored in org.theenergymashuplab.cts.model package, it represents the database table.

PositionRepository is stored in org.theenergymashuplab.cts.repository package, in this class all the native queries are stored.


