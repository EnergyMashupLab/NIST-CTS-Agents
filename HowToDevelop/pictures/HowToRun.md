# **Importing Maven Projects from Git into Eclipse**

**Step 1:** Select the folder where you want to create the local storage, right click and select &#39;Git Bash Here&#39;.

![](step1.png)

**Step 2:** Use the command &#39;git clone&#39; to create a clone of the repository.



Change the directory using &#39;cd&#39; command and go to NIST-CTS-Agents.

**Step 3:** In Eclipse select the File menu and then select Import.



**Step 4:** Select Existing Maven Projects and click on next.



**Step 5:** Browse to the local NIST-CTS-Agents folder and click finish. The project is now imported in Eclipse.

**Step 6:** Right click on project, go to Run As and select Maven Build.

You will get a Build success message in the console.



**Step 7:**** Configure Tomcat server**



**Step 8:** Select tomcat server and click next.



**Step 9:** Move the project to configure it to the server



Now the server is configured.

**Step 10:** Open MySQL Workbench and create the table &#39;nist\_cts\_eml&#39;.

**Step 11:** Right click on the project, go to Run As, and click on Spring Boot App.

 

**Step 12:** The project is now running. Open the browser and go to localhost:8080 to view the project.
