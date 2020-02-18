Development Environment Notes 20191031
======================================

Project Build Steps
-------------------

Most work is in the **development** branch of the repository.

1.  Download prequisites and tooling as needed. **NOTE: If you are cloning the
    code from GitHub, you need only the Java SDKs, Spring Tool IDE, Apache
    Tomcat Server and MySQL server.**

2.  Install the MySQL Server on your machine

3.  Clone the current project into your local machine. Checkout may require the
    **-f** flag. (Substitute the repository you're working with as necessary)

-   git clone https://github.com/EnergyMashupLab/NIST-CTS-Agents  
    git checkout development  
    git pull origin development

1.  Import the project into your SpringTool IDE

2.  Select options from the popup menu from right-clicking the project to build
    the project

**Additional Information** Useful git commands - Pull updates to our local
branch

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
git pull origin development
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

To determine which branch you're on

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
git branch
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

To determine whether you've updated code on your local machine'

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
git status
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

To add your files back

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
git add
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

To commit your changes

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
git commit -am "your message"
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

To push your code back to the origin banch (you may need your github login name
and password)

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
git push origin yourbranchname
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

-   To run your code in the IDE You should have a working MySQL database locally
    with a database named *njit_cts_eml* See

-   HowToRun.md

    HowToRun.md

    for more detail on creating the MySQL database. Login user (root\@localhost)
    and password are in src/main/resources/application.properties. Run your code

    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    (right click on project -> run as -> Spring boot app
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    This will start your tomcat server automatically.

**Test** See

JUnit_Doc in this directory

JUnit_Doc in this directory

for testing details.
