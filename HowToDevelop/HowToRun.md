# **Importing Maven Projects from Git into Eclipse**

**Step 1:** Select the folder where you want to create the local storage, right click and select &#39;Git Bash Here&#39;.

![](pictures/step1.png)

**Step 2:** Use the command &#39;git clone&#39; to create a clone of the repository.

![](/https://github.com/EnergyMashupLab/NIST-CTS-Agents/tree/sprint4/HowToDevelop/pictures/step2.PNG)

Change the directory using &#39;cd&#39; command and go to NIST-CTS-Agents.

**Step 3:** In Eclipse select the File menu and then select Import.

![](/https://github.com/EnergyMashupLab/NIST-CTS-Agents/tree/sprint4/HowToDevelop/pictures/step3.PNG)

**Step 4:** Select Existing Maven Projects and click on next.

![](/https://github.com/EnergyMashupLab/NIST-CTS-Agents/tree/sprint4/HowToDevelop/pictures/step4.PNG)

**Step 5:** Browse to the local NIST-CTS-Agents folder and click finish. The project is now imported in Eclipse.

**Step 6:** Right click on project, go to Run As and select Maven Build.

You will get a Build success message in the console.

![](/https://github.com/EnergyMashupLab/NIST-CTS-Agents/tree/sprint4/HowToDevelop/pictures/step5.png)

**Step 7:**** Configure Tomcat server**

![](/https://github.com/EnergyMashupLab/NIST-CTS-Agents/tree/sprint4/HowToDevelop/pictures/step7.PNG)

**Step 8:** Select tomcat server and click next.

![](/https://github.com/EnergyMashupLab/NIST-CTS-Agents/tree/sprint4/HowToDevelop/pictures/step8.PNG)

**Step 9:** Move the project to configure it to the server

![](/https://github.com/EnergyMashupLab/NIST-CTS-Agents/tree/sprint4/HowToDevelop/pictures/step9.PNG)

Now the server is configured.

**Step 10:** Open MySQL Workbench and create the table &#39;nist\_cts\_eml&#39;.

**Step 11:** Right click on the project, go to Run As, and click on Spring Boot App.

 ![](/https://github.com/EnergyMashupLab/NIST-CTS-Agents/tree/sprint4/HowToDevelop/pictures/step10.png)

**Step 12:** The project is now running. Open the browser and go to localhost:8080 to view the project.
